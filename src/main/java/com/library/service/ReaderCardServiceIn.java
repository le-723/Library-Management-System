package com.library.service;

import com.library.bean.ReaderInfo;

public interface ReaderCardServiceIn {
    boolean addReaderCard(ReaderInfo readerInfo, String password);

    boolean updatePassword(long readerId, String password);

    boolean deleteReaderCard(long readerId);
}
