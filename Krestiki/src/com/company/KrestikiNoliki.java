package com.company;

import java.util.Scanner;
/**
 * Created by User on 22.06.2016.
 */
public class KrestikiNoliki {
    public String name1;
    public String name2;
    public char[][] table = new char[3][3];
    public boolean step;
    char a = 49;
    public KrestikiNoliki() {
        String name = null;
        String name1 = null;
    }

    public KrestikiNoliki(String name1, String name2, boolean step) {
        this.name1 = name1;
        this.name2 = name2;
        this.step = step;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = a;
                a++;
            }
        }
    }
    public boolean input() {
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + table[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();
        if (step)
            System.out.println(" Ходит " + name1 + " : ");
        else
            System.out.println(" Ходит " + name2 + " : ");
        int n = scr.nextInt();
        if (n < 1 || n > 9)
            return false;
        int i, j;

        if (n % 3 == 0) {
            i = n / 3 - 1;
            j = 2;
        } else {
            j = n % 3 - 1;
            i = n / 3;
        }
        if (table[i][j] == 'O' || table[i][j] == 'X')
            return false;
        if (step) {
            table[i][j] = 'X';
            step = false;
        } else {
            table[i][j] = 'O';
            step = true;
        }
        return true;
    }
    public boolean win() {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == table[i][1]) && (table[i][0] == table[i][2]))
                return true;
            else if ((table[0][i] == table[1][i]) && (table[0][i] == table[2][i]))
                return true;
            else if ((table[0][0] == table[1][1]) && (table[0][0] == table[2][2]) || (table[0][2] == table[1][1]) && (table[0][2] == table[2][0]))
                return true;
        }
        return false;

    }
}
