package com.library.service;

import com.library.bean.Lend;
import com.library.mapper.lendMapper;
import com.library.mapper.bookMapper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service
public class LendService implements LendServiceIn {
    @Resource
    private lendMapper lendmapper;

    @Override
    public boolean returnBook(long bookId, long readerId){
        return lendmapper.returnBookOne(bookId, readerId)>0 && lendmapper.returnBookTwo(bookId)>0;
    }

    @Override
    public boolean lendBook(long bookId, long readerId){
        return lendmapper.lendBookOne(bookId,readerId)>0 && lendmapper.lendBookTwo(bookId)>0;
    }

    @Override
    public ArrayList<Lend> lendList(){
        return lendmapper.lendList();
    }
    @Override
    public ArrayList<Lend> myLendList(long readerId){
        return lendmapper.myLendList(readerId);
    }

    @Override
    public int deleteLend(long serNum) {
        return lendmapper.deleteLend(serNum);
    }

}
