package ru.neooffline.homework_j2l3;

import java.util.ArrayList;

public class Main {
    private static String[] strArray = {"������", "�����",
            "���������", "������", "������","���","������",
            "�����", "���������", "���������", "���������", "������", "���"};

    public static void main(String[] args) {
        String[] curDup = findDuplicates(strArray);
//        System.out.printf("���������� ������: %s\n", curDup);
        for (String el : curDup
                ) {
            System.out.println(el);
        }
        System.out.printf("--------------\n%d ���������� ��������� �� %d",
                curDup.length,strArray.length);
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
//        Set<String> unique = new HashSet<>(resArrayList);
        return resArrayList.toArray(new String[resArrayList.size()]);
//        return unique.toArray(new String[unique.size()]);
    }
}