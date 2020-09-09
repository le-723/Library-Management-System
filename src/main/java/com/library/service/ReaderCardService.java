package com.library.service;

import com.library.bean.ReaderInfo;
import com.library.mapper.readerCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReaderCardService implements ReaderCardServiceIn {
    @Resource
    private readerCardMapper readerCardmap;
@Override
    public boolean addReaderCard(ReaderInfo readerInfo, String password){
    long reader_id=readerInfo.getReaderId();
    String username=readerInfo.getName();
        return  readerCardmap.addReaderCard(reader_id,username,password)>0;
    }
    @Override
    public boolean updatePassword(long readerId, String password){
        return readerCardmap.resetPassword(readerId,password)>0;
    }

    @Override
    public boolean deleteReaderCard(long readerId) {
        return readerCardmap.deleteReaderCard(readerId) > 0;
    }
}
