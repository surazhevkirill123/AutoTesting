package com.company;

import java.util.Scanner;

public class HelloUser {
    public static String printName(String username) {
        return username;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a username: ");
        String username = in.nextLine();
        System.out.printf("Hello, %s!",username);
    }
}
