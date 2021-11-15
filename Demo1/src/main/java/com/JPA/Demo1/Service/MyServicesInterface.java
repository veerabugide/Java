package com.JPA.Demo1.Service;

import com.JPA.Demo1.Books;

import java.util.List;

public interface MyServicesInterface {
    public List<Books> getBooks();
    public Books addBook(Books books);
    public Books getById(int id);
}
