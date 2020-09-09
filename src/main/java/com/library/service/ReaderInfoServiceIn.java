package com.library.service;

import com.library.bean.ReaderInfo;

import java.util.ArrayList;

public interface ReaderInfoServiceIn {
    ArrayList<ReaderInfo> readerInfos();

    boolean deleteReaderInfo(long readerId);

    ReaderInfo getReaderInfo(long readerId);

    boolean editReaderInfo(ReaderInfo readerInfo);

    boolean editReaderCard(ReaderInfo readerInfo);

    long addReaderInfo(ReaderInfo readerInfo);
}
