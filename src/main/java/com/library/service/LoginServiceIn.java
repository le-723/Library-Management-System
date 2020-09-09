package com.library.service;

import com.library.bean.ReaderCard;

public interface LoginServiceIn {
    boolean hasMatchReader(long readerId, String password);

    String getAdminUsername(long adminId);

    ReaderCard findReaderCardByReaderId(long readerId);

    boolean hasMatchAdmin(long adminId, String password);

    boolean adminRePassword(long adminId, String newPassword);

    String getAdminPassword(long adminId);

    boolean readerRePassword(long readerId, String newPassword);

    String getReaderPassword(long readerId);
}
