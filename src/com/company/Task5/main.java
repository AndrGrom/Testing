package com.company.Task5;

import com.company.Task2.ValidateNumberException;

import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<Product> products = new ArrayList<>();
        while (true) {
            try {
                System.out.print(" Введите вместимость коробки: ");
                count = scanner.nextInt();
                if (count > 0) {
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
        products.add(new Product(2, 20));
        products.add(new Product(5, 35));
        products.add(new Product(34, 20));
        products.add(new Product(15, 2));
        products.add(new Product(1, 10));
        products.add(new Product(10, 2));
        products.add(new Product(8, 4));
        products.add(new Product(9, 13));
        products.add(new Product(4, 3));
        products.add(new Product(4, 100));

        products.sort(Comparator.comparingDouble(Product::getMean).reversed());
        System.out.println("-------------- Всего: ----------------------------------------------");
        products.forEach(System.out::println);
        System.out.println("-------------- В сейфе: --------------------------------------------");
        Box box = new Box(count);
        for (Product product : products) {
            if (!box.verificationProduct(product)) break;
        }

        box.getProductList().forEach(System.out::println);
        System.out.println("--------------- Итого: --------------------------------------------");
        System.out.println("Итого поместилось груза " + box.getSizeProduct() + " из " + count);
        System.out.println("Общей ценностью = " + box.getPriceProduct());

    }

}