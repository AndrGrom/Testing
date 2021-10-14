package com.company.Task1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String name = scanner.nextLine();
        int sum = 0;

        for (Character a : name.toCharArray()) {
            if (Character.isDigit(a)) {
                sum += Integer.valueOf(Character.toString(a));
            }
        }
        System.out.println("Сумма чисел: " + sum);
    }

}
