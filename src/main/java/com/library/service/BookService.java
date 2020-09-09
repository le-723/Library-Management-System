package com.library.service;

import com.library.bean.Book;
import com.library.bean.ClassName;
import com.library.mapper.bookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service
public class BookService implements BookServiceIn {
    @Resource
    private bookMapper bookmapper;

    @Override
    public ArrayList<Book> queryBook(String searchWord) {
        return bookmapper.queryBook(searchWord);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return bookmapper.getAllBooks();
    }

    @Override
    public boolean matchBook(String searchWord) {
        int i=bookmapper.matchBook(searchWord);
        System.out.println(i+searchWord);
        return i>0;
//        return bookmapper.matchBook(searchWord) > 0;
    }

    @Override
    public boolean addBook(Book book) {
        return bookmapper.addBook(book) > 0;
    }

    @Override
    public Book getBook(Long bookId) {
        return bookmapper.getBook(bookId);
    }

    @Override
    public ClassName queryClassById(int classId) {
        ClassName c = bookmapper.queryClassById(classId);
        return c;
    }

    @Override
    public boolean editBook(Book book) {
        return bookmapper.editBook(book) > 0;
    }

    @Override
    public boolean deleteBook(Long bookId) {
        return bookmapper.deleteBook(bookId) > 0;
    }

}
