package ru.job4j.profession;

public class Programmer extends Engineer {

   public Programmer(String name, String surname, String education, long birthday) {
      super(name, surname, education, birthday);
   }

   private String programma;

   public String getProgramma() {
      return programma;
   }

   public void setProgramma(String programma) {
      this.programma = programma;
   }

   public  void writesCode() {
      //программист пишет код.
   }
}
