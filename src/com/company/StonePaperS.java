package com.company;

import java.util.Scanner;

public class StonePaperS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "", s1;

        while (true) {
            int a = (int) (Math.random()*3+1);
            switch (a){
                case 1:
                    s = "Stone";
                    break;
                case 2:
                    s = "Paper";
                    break;
                case 3:
                    s = "Scissor";
                    break;
            }
            System.out.println("enter a number: 1-Rock, 2-Paper, 3-Scissor");
            int b = scanner.nextInt();
            System.out.println(s);
            if (a == b)
                System.out.println("draw");
            else if((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2))
                System.out.println("you lose");
            else
                System.out.println("you won");
        }
    }
}
