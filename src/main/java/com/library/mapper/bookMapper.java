package com.library.mapper;

import com.library.bean.Book;
import com.library.bean.ClassName;

import java.util.ArrayList;

public interface bookMapper {

    int matchBook(final String search) ;

    ArrayList<Book> queryBook(final String search) ;

    ArrayList<Book> getAllBooks() ;

    int addBook(final Book book);
    Book getBook(final long bookId);
    int editBook(final Book book);
    int deleteBook(final long bookId);

    ClassName queryClassById(final int classId);
}
