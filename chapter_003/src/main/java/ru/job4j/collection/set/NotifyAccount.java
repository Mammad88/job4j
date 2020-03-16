package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.List;

/**
 * class NotifyAccount - рассылка писем уникальным клиетам банка.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 3.0
 * @since 16.03.2020
 */
public class NotifyAccount {
    /**
     * method sent - отправка уведомление по разным подпискам уникальным клиентам банка.
     *
     * @param accounts - aккayнт клиента банка.
     * @return rsl - возврашает уведомление клиенту, который подписан на разные подписки от банка.
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>(accounts);
        for (Account account : rsl) {
            System.out.println(account);
        }
        return rsl;
    }
}
