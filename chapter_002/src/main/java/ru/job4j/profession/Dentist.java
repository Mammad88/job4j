package ru.job4j.profession;

public class Dentist extends Doctor {

private Diagnose diagnose;

    public Dentist(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    public void treatTooths(Patient patient) {
       patient.setDiagnose(diagnose);
    }
}
