package ru.job4j.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * class passportOffice - сурвис паспортного стола.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 18.03.2020
 */
public class PassportOffice {
    /**
     * Список граждан с ключом по паспорту.
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавить гражданина в список
     *
     * @param citizen - гражданин
     * @return - истина, если новый гражданин был добавлен
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizens.put(citizen.getPassport(), citizen) == null) {
            rsl = true;
        }
        return rsl;
    }

    /**
     * Получить информацию о гражданине по его паспорту
     *
     * @param passport - пасспорт гражданина.
     * @return - информацию о гражданине.
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
