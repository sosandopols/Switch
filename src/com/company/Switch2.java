package com.company;

public class Switch2 {
    public static void main(String[] args) {
        Directs direct = Directs.RIGHT;
        switch (direct){
            case LEFT:
                System.out.println(Directs.LEFT);
                break;
            case RIGHT:
                System.out.println(Directs.RIGHT);
                break;
            case UP:
                System.out.println("U");
                break;
            case DOWN:
                System.out.println("D");
                break;
        }
    }
}
enum Directs{LEFT, RIGHT, UP, DOWN}