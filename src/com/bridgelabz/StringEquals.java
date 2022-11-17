package com.bridgelabz;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the strings:");
        String s1=n.nextLine();
        String s2=n.nextLine();
        if(s1.equals(s2))  // equals function is used to check the two strings are equal or not
        {
            System.out.println("The two strings are equal");
        }
        else
        {
            System.out.println("The two string are not equal");
        }
    }
}

