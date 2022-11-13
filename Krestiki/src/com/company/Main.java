package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите имя 1 игрока:");
        String player1 = scr.next();

        System.out.println("Введите имя 2 игрока:");
        String player2 = scr.next();

        Random random = new Random();
        boolean step = random.nextBoolean();

        KrestikiNoliki KrestikiNoliki1 = new KrestikiNoliki(player1, player2, step);

        int i = 0;
        boolean win = false;

        while (!win) {
            win = KrestikiNoliki1.win();
            if (i == 9) {
                System.out.println("Ничья");
                break;
            }
            boolean input = KrestikiNoliki1.input();
            if (!input) {
                System.out.println(" Вы ввели неверные данные! Повторите!");
                continue;
            }
            i++;
        }
        if (KrestikiNoliki1.step) {
            if (i == 9) {
                return;
            }
            System.out.println(" Победил: " + KrestikiNoliki1.name1);
        }
        else {
            if (i == 9) {
                return;
            }
            System.out.println(" Победил: " + KrestikiNoliki1.name2);
        }
    }
}
