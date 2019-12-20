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
        System.out.println("начинаем игру!");
        System.out.println("1. спичку забираю");
        System.out.println("2. спички забираю");
        System.out.println("3. спички забираю");
        System.out.println(player1 + " Заберите от 1 до 3 спичек");
        int select = Integer.valueOf(input.nextLine());
        int countMatches = 11;
        boolean game = false;

        while (countMatches > 0) {
            countMatches = countMatches - select;
            System.out.println(player1 + " осталос спичек: " + countMatches);
            if (countMatches == 0) {
                System.out.println("вы выиграли");
            }
            break;
        }

        System.out.println(player2 + " Заберите от 1 до 3 спичек");
        select = Integer.valueOf(input.nextLine());
        while (countMatches > 0) {
            countMatches = countMatches - select;
            System.out.println(player2 + " осталос спичек: " + countMatches);
            if (countMatches == 0) {
                System.out.println("вы выиграли");
            }
            break;
        }

        System.out.println(player1 + " Заберите от 1 до 3 спичек");
        select = Integer.valueOf(input.nextLine());
        while (countMatches > 0) {
            countMatches = countMatches - select;
            System.out.println(player1 + " осталос спичек: " + countMatches);
            if (countMatches == 0) {
                System.out.println("вы выиграли");
            }
            break;
        }

        System.out.println(player2 + " Заберите от 1 до 3 спичек");
        select = Integer.valueOf(input.nextLine());
        while (countMatches > 0) {
            countMatches = countMatches - select;
            System.out.println(player2 + " осталос спичек: " + countMatches);
            if (countMatches == 0) {
                System.out.println("вы выиграли");
            }
            break;
        }
        game = true;
    }
}
