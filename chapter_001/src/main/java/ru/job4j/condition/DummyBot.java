package ru.job4j.condition;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $Id$
 * @since 05.07.2019
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl =  "Привет, умник.";
        } else if ("Пока." .equals(question)) {
            //проверяет известен ли боту этот вопрос и возврашает ответ.
            rsl = "До скорой встречи.";
        }
        return  rsl;
    }
}

