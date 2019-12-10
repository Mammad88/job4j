package ru.job4j.profession;

public class Builder extends Engineer {

    private boolean build;

    public Builder(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    public void setBuild(boolean build) {
        this.build = build;
    }

    public boolean isBuild() {
        return build;
    }
}
