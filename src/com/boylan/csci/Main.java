package com.boylan.csci;
import java.util.Scanner;
import java.util.*;
//Michael Boylan 1/17/2019
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your city?");
        String city = input.nextLine();
        System.out.println("What is your zipcode?");
        int zipCode = input.nextInt();
        System.out.println("What is the temperature for the next 5 days?");
        double temperatures[]={0,0,0,0,0};

        for (int i = 0; i <= 4; i++) {
            int day = i+1;
            System.out.println("Day "+ day + ":");
            temperatures[i] = input.nextDouble();

        }
        double averageTemp = (temperatures[0] + temperatures[1] + temperatures[2] + temperatures[3] + temperatures[4])/5;
        System.out.println(city +"|"+ zipCode);
        System.out.println("Average Temperature: "+ averageTemp);
    }
}
