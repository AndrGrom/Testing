package com.company.Task4;

import com.company.Task2.ValidateNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print(" Введите целое число: ");
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                }
            } catch (ValidateNumberException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(" Ошибка! Введено не верное значение!");
                scanner.nextLine();
            }
        }

        Numbers numbers = new Numbers();
        String str = Integer.toString(number);
        int max = 0;
        for (Character a : str.toCharArray()) {
            if (max < Integer.parseInt(a.toString())) {
                max = Integer.parseInt(a.toString());
            }
        }

        for (int i = 0; i < numbers.getNumber()[0].length; i++) {
            for (int j = 0; j < str.length(); j++) {
                int index = Integer.parseInt(Character.toString(str.charAt(j)));
                if (index == max) {
                    System.out.print(numbers.getNumber()[index][i].replace("*", String.valueOf(max)));
                } else {
                    System.out.print(numbers.getNumber()[index][i]);
                }
            }
            System.out.println();
        }

    }

}
