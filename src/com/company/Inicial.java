package com.company;

import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your first name: ");
        String first = scanner.nextLine();
        System.out.println("input your last name: ");
        String last = scanner.nextLine();

        System.out.printf("your initials: %c. %c.%n", first.charAt(0), last.charAt(0));
    }
}
