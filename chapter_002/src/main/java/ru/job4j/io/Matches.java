package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Поиграем в игру 11");
        System.out.println("Общее количество спичек на столе 11!");
        System.out.println("Выигрывает тот, кто заберет последние спички на столе!");
        System.out.println("Введите имя первого игрока!");
        String player1 = input.nextLine();
        System.out.println("Введите имя второго игрока!");
        String player2 = input.nextLine();
        boolean turn = true;
        System.out.println("1. спичку забираю");
        System.out.println("2. спички забираю");
        System.out.println("3. спички забираю");
        int countMatches = 11;
        System.out.println(" Заберите от 1 до 3 спичек");
        int select = Integer.valueOf(input.nextLine());
        while (countMatches > 0) {
            countMatches = countMatches - select;
            System.out.println(" осталос спичек: " + countMatches);
            System.out.println(" Заберите от 1 до 3 спичек");
            select = Integer.valueOf(input.nextLine());
            System.out.println(" осталос спичек: " + countMatches);

            switch (select) {
                case 1:
                    System.out.println("одну спичку забираю");
                    break;
                case 2:
                    System.out.println("две спички забираю!");
                    break;
                case 3:
                    System.out.println("три спички забираю!");
                    break;
                default:
                    System.out.println("такой цифры нет");
                    break;
            }

            if (countMatches - select == 0 ) {
                System.out.println("вы выиграли ");
                break;
            }
        }
        turn = false;
    }
}
