package com.company;

public class Ternary {
    public static void main(String[] args) {
        int age = 18;
        //Продажа табачных изделий до 18 лет запрещена
        String s = age < 18 ? "denied" : "legalize";
        System.out.println(s);
        age = 17;
        System.out.println(age < 18 ? "denied" : "legalize");

        //Строчная или заглавная
        System.out.printf("%d, %d, %d, %d%n", (int) 'a', (int) 'z', (int) 'A', (int) 'Z');
        //System.out.printf("%d, %d, %d, %d%n", (int)'а', (int)'я', (int)'А', (int)'Я');
        char ch = 'H';
        String answer = (int) ch >= 97 && (int) ch <= 122 ? "lowercase" :
                (int) ch >= 65 && (int) ch <= 90 ? "uppercase" : "not a letter";
        System.out.println(answer);

        //Наибольшее из трех чисел
        int a = 1, b = 3, c = 12;
        String max = a > b && a > c ? "a" :
                b > a && b > c ? "b" : "c";
        System.out.println(max);

    }
}
