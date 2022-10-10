package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {

    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        //int[] b = {1, 23, 3};
        //fillRandom();
        fillOrder();
        print();
        System.out.println(BinarySearch(7));
        System.out.println(Arrays.binarySearch(arr,7));

    }

    static void fillOrder() {
        for (int i = 0; i < size; i++)
            arr[i] = i + 1;
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(90) + 10;
    }

    static void print() {
        /*System.out.println(Arrays.toString(arr));
        System.out.println(sum());
        System.out.println(find(2));*/
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }

    static int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum += arr[i];
        return sum;
    }

    static int find(int n) {
        int result = -1;
        for (int i = 0; i < size; i++)
            if (arr[i] == n)
                result = i;
        return result;
    }

    static void reverse() {
        for (int i = 0; i < size / 2; i++)
            swap(i, size - i - 1);
    }

    static void swap(int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    static int BinarySearch(int number){
        int a=0, b=arr.length-1, middle=(a+b)/2, result=0;
        while ((arr[middle]!=number)&&(a!=b)){
            if (number>arr[middle]) {
                a=middle;
            }
            else b=middle;
            middle = (a+b)/2;
        }
        if (arr[middle]==number) result = middle;
        else result = -1;
        return result;
    }
}
