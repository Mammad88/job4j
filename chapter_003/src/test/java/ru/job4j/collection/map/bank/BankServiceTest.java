package ru.job4j.collection.map.bank;

import org.junit.Test;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class BankServiceTest {

    /**
     * Тест - на проверку пользователя в банковской системе, если его нет то и аккаунта нет.
     */
    @Test
    public void whenNonExistingPassportThenHasNoAccounts() {
        BankService bank = new BankService();
        List<Account> list = bank.getUserAccounts("123");
        assertThat(list.size(), is(0));
    }

    /**
     * Тест добавление нового пользователя.
     */
    @Test
    public void whenAddingUserWithoutAccountThenHasNoAccounts() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        List<Account> list = bank.getUserAccounts("3434");
        assertThat(list.size(), is(0));
    }

    /**
     * Тест - добавление нового пользователя и аккаунта.
     */
    @Test
    public void whenAddingUserAndAccountThenReturnAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccountToUser("3434", new Account("5560", new BigDecimal(60000)));
        List<Account> list = bank.getUserAccounts("3434");
        assertThat(list.get(0), is(new Account("5560", new BigDecimal(60000))));
    }

    /**
     * Тест удаление пользователя.
     */
    @Test
    public void whenDeleteUserThenHasNoAccounts() {
        BankService bank = new BankService();
        User alex = new User("3500", "Alex Pit");
        bank.addUser(alex);
        bank.addAccountToUser("3500", new Account("requisite", new BigDecimal(0)));
        bank.deleteUser(alex);
        List<Account> list = bank.getUserAccounts("3500");
        assertThat(list.size(), is(0));
    }

    /**
     * Тест удаление аккаунта пользователя.
     */
    @Test
    public void whenDeleteAccountThenHasNoSuchAccount() throws AccountNotFoundException {
        BankService bank = new BankService();
        bank.addUser(new User("pass1", "Denis"));
        Account first = new Account("requisites1", new BigDecimal(0));
        bank.addAccountToUser("pass1", first);
        bank.addAccountToUser("pass1", new Account("requisites2", new BigDecimal(0)));
        assertThat(bank.getUserAccounts("pass1").size(), is(2));
        bank.deleteAccountFromUser("pass1", first);
        List<Account> list = bank.getUserAccounts("pass1");
        assertThat(list.size(), is(1));
        assertThat(list.get(0).getRequisite(), is("requisites2"));
    }

    /**
     * Тест - удаление не существующего аккаунта.
     * @throws AccountNotFoundException - аккаунт не найден.
     */

    @Test(expected = AccountNotFoundException.class)
    public void whenDeleteNonExistingAccountThenException() throws AccountNotFoundException {
        BankService bank = new BankService();
        bank.addUser(new User("pass1", "Denis"));
        bank.addAccountToUser("pass1", new Account("requisites1", new BigDecimal(0)));
        Account nonExistingAccount = new Account("non-existing-requisites", new BigDecimal("0.0"));
        bank.deleteAccountFromUser("pass1", nonExistingAccount);
    }

    /**
     * Тест получить все аккаунты.
     */
    @Test
    public void getUserAccounts() {
        BankService data = new BankService();
        data.addUser(new User("1", "Victor"));
        data.addAccountToUser("1", new Account("1234", new BigDecimal("40000.50")));
        data.addAccountToUser("1", new Account("5678", new BigDecimal("5000.00")));
        List<Account> result = data.getUserAccounts("1");
        List<Account> expect = new ArrayList<>(Arrays.asList(new Account("1234", new BigDecimal("40000.50")),
                new Account("5678", new BigDecimal("5000.00"))));
        assertThat(result, is(expect));
    }

    /**
     * Тест - перевод денег с одного счета на другой.
     */
    @Test
    public void whenTransferMoneyFromUserToAnotherUser() {
        BankService bank = new BankService();
        User jora = new User("462154", "Jora");
        User tanya = new User("462121", "Tanya");
        bank.addUser(jora);
        bank.addUser(tanya);
        Account first = new Account("122345", new BigDecimal(500));
        Account second = new Account("122346", new BigDecimal(200));
        Account third = new Account("122347", new BigDecimal(300));
        bank.addAccountToUser("462154", first);
        bank.addAccountToUser("462154", second);
        bank.addAccountToUser("462121", third);
        Boolean resultTransfer = bank.transferMoney("462154", "122345", "462121", "122347", new BigDecimal(100));
        assertThat(resultTransfer, is(true));
        assertThat(bank.getUserAccounts("462154").get(0).getValue(), is(new BigDecimal(400)));
        assertThat(bank.getUserAccounts("462121").get(0).getValue(), is(new BigDecimal(400)));
    }

    /**
     * Тест перевод денег больше чем есть на счете.
     */
    @Test
    public void whenTransferMoreSumThenUserHaveOnAccountThenFalse() {
        BankService result = new BankService();
        result.addUser(new User("1", "Max"));
        result.addAccountToUser("1", new Account("1234", new BigDecimal("100.50")));
        result.addUser(new User("2", "Richard"));
        result.addAccountToUser("2", new Account("4321", new BigDecimal("0.00")));
        assertFalse(result.transferMoney("1", "1234", "2", "4321", new BigDecimal(10000)));
    }

    /**
     * Тест перевод с неверными данными паспорта и реквизитов.
     */
    @Test
    public void whenTransferByWrongPassportAndReqThenFalse() {
        BankService result = new BankService();
        result.addUser(new User("1", "Max"));
        result.addAccountToUser("1", new Account("1234", new BigDecimal("100.50")));
        result.addUser(new User("2", "Victor"));
        result.addAccountToUser("2", new Account("4321", new BigDecimal("0.00")));
        assertFalse(result.transferMoney("1111", "1234", "2", "4321", new BigDecimal(10000)));
        assertFalse(result.transferMoney("1", "hhhh", "2", "4321", new BigDecimal(10000)));
        assertFalse(result.transferMoney("1", "1234", "2222", "4321", new BigDecimal(10000)));
        assertFalse(result.transferMoney("1111", "1234", "2", "oooo", new BigDecimal(10000)));
    }
}

