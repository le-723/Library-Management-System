package com.library.service;

import com.library.bean.Book;
import com.library.bean.ClassName;

import java.util.ArrayList;

public interface BookServiceIn {
    ArrayList<Book> queryBook(String searchWord);

    ArrayList<Book> getAllBooks();

    boolean matchBook(String searchWord);

    boolean addBook(Book book);

    Book getBook(Long bookId);

    public ClassName queryClassById(int classId);

    boolean editBook(Book book);

    boolean deleteBook(Long bookId);
}
