package ru.job4j.collection.map.bank;

import java.util.*;

/**
 * class BankService - банковский сервис.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 21.03.2020
 */
public class BankService {
    /**
     * users -  Это поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавить пользователя в систему.
     *
     * @param user - пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавить новый банковский счет для пользователя.
     * <p>
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     *
     * @param passport - паспорт пользователя.
     * @param account  - банковской счет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(account);
        }
    }

    /**
     * Найти информацию о пользователе по его паспортным данным.
     *
     * @param passport - паспортные данные.
     * @return - информация о пользователе.
     */
    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    /**
     * Получить информацию об аккаунте по паспорту пользователю и реквизитам счета.
     *
     * @param passport  - паспорт пользователя.
     * @param requisite - реквизиты счёта.
     * @return - информация об аккаунте.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        int index = accounts.indexOf(new Account(requisite, -1));
        if (index != -1) {
            return accounts.get(index);
        }
        return null;
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
     * @return - если счет не найден или недостаточно средств, то вернётся false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account dstAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && dstAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            dstAccount.setBalance(dstAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
