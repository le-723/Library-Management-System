package com.library.mapper;

import com.library.bean.Lend;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface lendMapper {
    int returnBookOne(final long book_id, long reader_id);

    int returnBookTwo(final long book_id);

    int lendBookOne(final long book_id, final long reader_id);
    int lendBookTwo(final long book_id);

    ArrayList<Lend> lendList() ;

    ArrayList<Lend> myLendList(final long reader_id);

    public int deleteLend(final long ser_num);
}
