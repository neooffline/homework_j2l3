package ru.neooffline.homework_j2l3;

public class Main {
    private static String[] strArray = {"������", "�����", "�����", "�������������",
            "�����", "����", "�������", "�����������", "���������", "������",
            "������", "�����", "������", "����������", "������",
            "������������", "�������", "�������", "��������", "���������"};

    public static void main(String[] args) {
        String curDup = findDupclicates(strArray);
        System.out.printf("���������� ������: %s\n", curDup);

    }

    public static String findDupclicates(String[] strArray) {
        int duplicates = 0;
        int unucal = strArray.length;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (j != i && strArray[j].equals(strArray[i])) {
                    duplicates++;
                    unucal--;
                }

            }
        }
        return duplicates + " " + unucal;
    }
}