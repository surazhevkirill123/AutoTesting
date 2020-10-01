package com.company;

import java.util.Scanner;

public class ArgsOfComLine {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a length of array: ");
        int length = in.nextInt();
        int array[]=new int[length];
        for (int i=0;i<length;i++) {
            Scanner in1 = new Scanner(System.in);
            array[i] = in.nextInt();
        }
        for (int i=length-1;i>=0;i--) {
            System.out.print(array[i]+" ");
        }
    }
}
