package com.company;

import java.util.Scanner;

public class Lab3_Zhukov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x:");
        double x = in.nextDouble();
        int x_1 = 1, x_2 = 1, x_3 = 1, x_4 = 1, x_5 = 1,  x_6 = 1, x_x = 1;
        for(int i = 1; i < 14; i++) {
            x_x *= i;
            switch (i) {
                case 3:
                    x_1 = x_x;
                case 5:
                    x_2 = x_x;
                case 7:
                    x_3 = x_x;
                case 9:
                    x_4 = x_x;
                case 11:
                    x_5 = x_x;
                case 13:
                    x_6 = x_x;
            }
        }
        double answer = x - (Math.pow(x, 3) / x_1) + (Math.pow(x, 5) / x_2) - (Math.pow(x, 7) / x_3) +
                (Math.pow(x, 9) / x_4) - (Math.pow(x, 11) / x_5) + (Math.pow(x, 13) / x_6);
        System.out.printf("%.3f", answer);

    }
}
