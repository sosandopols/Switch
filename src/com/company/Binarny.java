package com.company;

import java.util.Scanner;

public class Binarny {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100 + 1), b = 0;
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        while (a != b) {
            System.out.println("enter number: ");
            b = scanner.nextInt();
            if (a > b)
                System.out.println("greater");
            else if (a < b)
                System.out.println("less");
        }
        System.out.println("super");
    }
}
