package com.company.Task2;

public class PrimeDivisors {

    public PrimeDivisors() {
    }

    public boolean validateNumber(int number) {
        if (number <= 1)
            throw new ValidateNumberException(" * Ошибка! Введите число > 1!");
        return true;
    }

    public void recursion(int number) {
        int a = 2;
        while (a <= number) {
            if ((number % a) == 0) {
                if (a != number) {
                    System.out.print(a + " * ");
                    recursion(number / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

}
