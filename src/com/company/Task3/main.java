package com.company.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Вы ничего не ввели. Введите строку: ");
            name = scanner.nextLine().trim();

        }
        ArrayList<ReadString> wordList = new ArrayList<>();
        String[] str1 = name.trim().split(" ");

        for (String a : str1) {
            wordList.add(new ReadString(a));
        }

        wordList.sort((s1, s2) -> s2.getStrAmount() - s1.getStrAmount());
        Config vowel = new Config();

        for (Character a : wordList.get(0).getStrWord().toCharArray()) {
            if (vowel.VOWEL_LETTER.contains(a.toString())) {
                int indexM = wordList.get(0).getStrWord().indexOf(a.toString());
                ReadString readString = wordList.get(0);
                readString.setStrWord(wordList.get(0).getStrWord().replaceFirst(a.toString(), a.toString().toUpperCase()));
                wordList.set(0, readString);
                break;
            }
        }
        wordList.forEach(System.out::println);
    }

}
