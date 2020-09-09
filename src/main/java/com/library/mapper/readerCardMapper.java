package com.library.mapper;

import com.library.bean.ReaderCard;
import com.library.bean.ReaderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Map;

public interface readerCardMapper {
    int getIdMatchCount(final long reader_id, final String password);
    ReaderCard findReaderByReaderId(final long reader_id);

    int resetPassword(final long reader_id, final String password);

    int addReaderCard(final long reader_id,final String username, final String password);

    String getPassword(final long reader_id);

    public int deleteReaderCard(final long reader_id);
}
