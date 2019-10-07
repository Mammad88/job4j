package ru.job4j.loop;
/**
 * Fitness.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 28.07.2019
 */
public class Fitness {
    /**
     * @param ivan -  увеличивает  силу тяги в 3 раза.
     * @param nik - увеличивает силу тяги в 2 раза.
     * @return month.
     */

    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
