package com.example.library;

import org.springframework.stereotype.Component;

@Component
public class Book {
    public void addBook() {
        System.out.println("Book added to library.");
    }

    public void searchBook() {
        System.out.println("Searching book...");
    }
}
