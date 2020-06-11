package ru.job4j.collection.map.bank;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.*;

/**
 * class BankService - банковский сервис.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $3.0$
 * @since 11.06.2020
 */
public class BankService {
    /**
     * users -  Это поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавить пользователя в систему, если такого пользователя нет.
     *
     * @param user - пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя из системы.
     *
     * @param user пользователь.
     */
    public void deleteUser(User user) {
        users.remove(user);
    }

    /**
     * Добавить аккаунта пользователя.
     * <p>
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findUserByPassport.
     * После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     *
     * @param passport - паспорт существующего пользователя.
     * @param account  - новый банковской счет.
     */
    public void addAccountToUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            accounts.add(account);
        }
    }

    /**
     * Deletes one existing user account.
     *
     * @param passport passport of the existing user
     * @param account  account to delete
     * @throws AccountNotFoundException when the specified account not found.
     */
    public void deleteAccountFromUser(String passport, Account account) throws AccountNotFoundException {
        User user = findUserByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            int index = accounts.indexOf(account);
            if (index < 0) {
                throw new AccountNotFoundException();
            }
            accounts.remove(index);
        }
    }

//    /**
//     * Найти информацию о пользователе по его паспортным данным.
//     *
//     * @param passport - паспортные данные.
//     * @return - информация о пользователе.
//     */
//    public User findUserByPassport(String passport) {
//        User result = null;
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//                result = user;
//                break;
//            }
//        }
//        return result;
//    }

    /**
     * Найти информацию о пользователе по его паспортным данным.
     *
     * @param passport - паспортные данные.
     * @return - информация о пользователе.
     */
    private User findUserByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst().orElse(null);
    }
//    /**
//     * Получить информацию об аккаунте по паспорту пользователю и реквизитам счета.
//     *
//     * @param passport  - паспорт пользователя.
//     * @param requisite - реквизиты счёта.
//     * @return - информация об аккаунте.//    */
//    public Account findUserByRequisiteAndPassport(String passport, String requisite) {
//        Account result = null;
//        User user = findUserByPassport(passport);
//        List<Account> accounts = users.get(user);
//        for (Account account : accounts) {
//            if (account.getRequisite().equals(requisite)) {
//                result = account;
//                break;
//            }
//        }
//        return result;
//    }

    /**
     * Найти информацию об аккаунте по паспорту пользователю и реквизитам счета.
     *
     * @param passport  - паспорт пользователя.
     * @param requisite - реквизиты счёта.
     * @return - информация об аккаунте.
     */
    private Account findAccountByRequisiteAndPassport(String passport, String requisite) {
        User user = findUserByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst().orElse(null);
    }

    /**
     * Метод получает список аккаунтов пользователя, пустой список, если пользователь не найден
     *
     * @param passport - паспорт сушествующего пользователя.
     * @return список аккаунтов, или пустой список, если пользователь не найден, или не имеет аккаунта.
     */
    public List<Account> getUserAccounts(String passport) {
        User user = findUserByPassport(passport);
        return user != null ? users.get(user) : Collections.emptyList();
    }

    /**
     * Перевод с счета на счет.
     * Если счёт отправки будет найден и на нём будет сумма,
     * превышающая или равная сумме перевода, то тогда с этого
     * счёта данная сумма будет снята, а на счёт зачисления добавлена.
     *
     * @param srcPassport   - паспорт пользователя.
     * @param srcRequisite  - счёт с которого переводят.
     * @param destPassport  - паспорт пользователя которому переводят.
     * @param destRequisite - счет на который переводят.
     * @param amount        - сумма перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, BigDecimal amount) {
        boolean result = false;
        Account srcAccount = findAccountByRequisiteAndPassport(srcPassport, srcRequisite);
        Account dstAccount = findAccountByRequisiteAndPassport(destPassport, destRequisite);
        if (srcAccount != null && dstAccount != null && (checkAccountBalance(srcAccount, amount))) {
            srcAccount.transfer(dstAccount, amount);
            result = true;
        }
        return result;
    }

    /**
     * Проверка баланса счета.
     *
     * @param acc    - счет пользователя.
     * @param amount Сумма перевода.
     * @return Достаточно ли стредств.
     */
    private boolean checkAccountBalance(Account acc, BigDecimal amount) {
        return acc.getValue().compareTo(amount) >= 0;
    }
}
