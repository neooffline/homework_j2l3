package ru.neooffline.homework_j2l3;

import java.util.ArrayList;

public class Main {
    private static String[] strArray = {"Струна", "приют",
            "отступать", "струна", "струна", "ЛУЧ", "погоня",
            "приют", "консилиум", "консилиум", "консилиум", "солнце", "луч"};

    public static void main(String[] args) {
        String[] curDup = findDuplicates(strArray);
//        System.out.printf("Количество дублей: %s\n", curDup);
        for (String el : curDup) {
            System.out.println(el);
        }
        System.out.printf("--------------\n%d уникальных элементов из %d\n",
                curDup.length, strArray.length);

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.get();
        System.out.println();
        phoneBook.add("Frolov","6777767677");
        phoneBook.add("Sidorov","88002255555");
        phoneBook.get();
        phoneBook.get("Frolov");
    }

    public static String[] findDuplicates(String[] strArray) {
        ArrayList<String> resArrayList = new ArrayList<>();
        ArrayList<String> dupArrayList = new ArrayList<>();
        for (String el : strArray) {
            String lowerCase = el.toLowerCase();
            if (!resArrayList.contains(el)) {
                resArrayList.add(lowerCase);
            } else {
                dupArrayList.add(el);
            }
        }
        for (int i = 0; i < resArrayList.size(); i++) {
            String el = resArrayList.get(i);
            for (int k = 0; k < dupArrayList.size(); k++) {
                String el2 = dupArrayList.get(k);
                if (el.equals(el2)) {
                    resArrayList.remove(i);
                    break;
                }
            }
        }
        return resArrayList.toArray(new String[resArrayList.size()]);
    }
}