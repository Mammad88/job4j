package ru.job4j.profession;

public class Doctor extends Profession {

    private Diagnose diagnose;

    public Doctor(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnose heal(Patient patient) {
        return patient.getDiagnose();
    }

    public void treat(Patient patient) {
        patient.setDiagnose(diagnose);
    }
}
