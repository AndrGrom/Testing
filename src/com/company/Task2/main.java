package com.company.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        PrimeDivisors num = new PrimeDivisors();
        while (true) {
            try {
                System.out.print(" Введите целое число: ");
                number = scanner.nextInt();
                if (num.validateNumber(number)) {
                    break;
                }
            } catch (ValidateNumberException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(" * Ошибка! Введено не верное значение!");
                scanner.nextLine();
            }
        }
        System.out.print("Множители числа "+ number + " = ");
        num.recursion(number);
    }
}