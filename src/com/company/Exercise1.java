package com.company;

public class Exercise1 {

    public static void printAmerica(String day, String month, int date, int year) {
        System.out.print(day + ", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.println(year + ".");
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.print(day + " ");
        System.out.print(date + "th ");
        System.out.print(month + " ");
        System.out.print(year + ".");
    }

    public static void main(String[] args) {
        String day = "Wednesday";
        String month = "September";
        int date = 8;
        int year = 2021;
        printAmerica(day, month, date, year);
        printEuropean(day, date, month, year);
    }
}
