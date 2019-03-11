package ru.neooffline.homework_j2l3;

import java.util.HashMap;
import java.util.Map;

public class MyPhoneBook {
    private String fistName;
    private String phone;
    private Map<String, String> phoneBook;

    MyPhoneBook() {
        phoneBook = new HashMap<>();
        phoneBook.put("Фролов", "84953488855");
        phoneBook.put("Сидоров", "84951234567");
        phoneBook.put("Янушкевич", "88002321503");
    }

    public void add(String fistName, String phone) {
        phoneBook.merge(fistName, phone, (oldVal, newVal) -> oldVal + ", " + newVal);
    }

    public void get() {
        System.out.printf("%15s\t%15s\n------------------\n",
                "FistName", "Tel");
        for (String e : phoneBook.keySet()
                ) {
            System.out.printf("Ф:%15s\t%15s\n",
                    e, phoneBook.get(e));
        }
        System.out.println("------------------");
    }

    public void get(String fistName) {
        System.out.printf("Результат поиска по фамилии \"%s\":\n", fistName);
        System.out.println("Телефон(-ы): "
                + phoneBook.get(fistName));
    }
}
