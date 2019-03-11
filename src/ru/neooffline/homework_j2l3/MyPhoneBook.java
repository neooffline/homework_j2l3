package ru.neooffline.homework_j2l3;

import java.util.HashMap;
import java.util.Map;

public class MyPhoneBook {
    private String fistName;
    private String phone;
    private Map<String, String> phoneBook;

    MyPhoneBook() {
        phoneBook = new HashMap<>();
        phoneBook.put("Frolov","4232323");
        phoneBook.put("Sidorov","512125");
        phoneBook.put("Yanushkevich","888999333");
    }

    public void add(String fistName, String phone) {
        phoneBook.merge(fistName, phone, (oldVal,newVal) -> oldVal + ", " + newVal);
    }

    public void get() {
        System.out.println("Fist name        Tel\n" +
                "--------------------");
        for (String e : phoneBook.keySet()
                ) {
            System.out.println(e + " " + phoneBook.get(e));
        }
    }
}
