package com.library.service;

import com.library.bean.Lend;

import java.util.ArrayList;

public interface LendServiceIn {
    boolean returnBook(long bookId, long readerId);

    boolean lendBook(long bookId, long readerId);

    ArrayList<Lend> lendList();

    ArrayList<Lend> myLendList(long readerId);

    int deleteLend(long serNum);
}
