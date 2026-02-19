package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryCatalog {

    private final List<String> books = new ArrayList<>();

    // Добавление книги
    public void addBook(String title) {
        if (title == null || title.trim().isEmpty()) {  // работает на Java 8
            throw new IllegalArgumentException("Title is empty");
        }
        books.add(title);
    }

    // Поиск по подстроке
    public List<String> search(String query) {
        List<String> result = new ArrayList<>();
        for (String b : books) {
            if (b.toLowerCase().contains(query.toLowerCase())) {
                result.add(b);
            }
        }
        return result;
    }

    // Сортировка по алфавиту
    public List<String> sort() {
        List<String> sorted = new ArrayList<>(books);
        Collections.sort(sorted);
        return sorted;
    }

    // Размер каталога
    public int size() {
        return books.size();
    }
}
