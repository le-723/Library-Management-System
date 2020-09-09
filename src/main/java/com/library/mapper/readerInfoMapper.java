package com.library.mapper;

import com.library.bean.ReaderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

public interface readerInfoMapper {
    ArrayList<ReaderInfo> getAllReaderInfo();
    ReaderInfo findReaderInfoByReaderId(final long reader_id);
    int deleteReaderInfo(final long reader_id);
    int editReaderInfo(final ReaderInfo readerInfo);
    int editReaderCard(final ReaderInfo readerInfo);
    int addReaderInfo(final ReaderInfo readerInfo);
    long getReaderId(final ReaderInfo readerInfo);
}
