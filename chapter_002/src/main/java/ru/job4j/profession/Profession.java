package ru.job4j.profession;

public class Profession {

   private String name;
   private String surname;
   private String education;
   private long birthday;

   public Profession(String name, String surname, String education, long birthday) {
      this.name = name;
      this.surname = surname;
      this.education = education;
      this.birthday = birthday;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getEducation() {
      return education;
   }

   public void setEducation(String education) {
      this.education = education;
   }

   public long getBirthday() {
      return birthday;
   }

   public void setBirthday(long birthday) {
      this.birthday = birthday;
   }
}
