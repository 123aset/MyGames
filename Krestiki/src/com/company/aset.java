package com.company;

import java.util.Random;

/**
 * Created by User on 22.06.2016.
 */
public class aset {
    public static void main(String[] args) {
        String name = null;
        String name1 = null;
        char[][] table = new char[3][3];
        char a = 49;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + a + " ");
                table[i][j] = a;
                a++;
            }
            System.out.println("|");
        }
            System.out.println( table[1][1]);
//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//            boolean tempStep = random.nextBoolean();
//            System.out.println(tempStep);
//
//        }
    }
}
