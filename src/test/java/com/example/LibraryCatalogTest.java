package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class LibraryCatalogTest {

    @Test
    public void addBook_increasesSize() {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("Java 101");
        assertEquals(1, catalog.size());
    }

    @Test
    public void search_findsBook() {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("Clean Code");
        List<String> result = catalog.search("clean");
        assertEquals(1, result.size());
    }

    @Test
    public void sort_sortsAlphabetically() {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("B");
        catalog.addBook("A");
        assertEquals(java.util.Arrays.asList("A", "B"), catalog.sort());
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_emptyTitle_throwsException() {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("");
    }

    @Test
    public void guaranteedFail() {
        fail("THIS TEST MUST FAIL"); // гарантированно ломаем билд
    }
}
