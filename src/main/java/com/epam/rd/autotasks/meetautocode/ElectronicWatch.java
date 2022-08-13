package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hour = seconds / 3600 % 24;
        int minutes = seconds / 60 % 60;
        seconds = seconds / 1 % 60;

        String resultTime = String.format("%01d:%02d:%02d", hour, minutes, seconds);
        System.out.print(resultTime);
    }
}
