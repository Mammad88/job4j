package ru.job4j.profession;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    public void treatPatient() {
        // проводим операцию
    }

    public void makeIncision() {
        //Делаем надрез
    }
}
