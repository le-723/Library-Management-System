package com.library.service;

import com.library.bean.ReaderInfo;
import com.library.mapper.readerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Component
@Service
public class ReaderInfoService implements ReaderInfoServiceIn {
    @Resource
    private readerInfoMapper readerInfomapper;
    @Override
    public ArrayList<ReaderInfo> readerInfos() {
        return readerInfomapper.getAllReaderInfo();
    }
    @Override
    public boolean deleteReaderInfo(long readerId) {
        return readerInfomapper.deleteReaderInfo(readerId) > 0;
    }
    @Override
    public ReaderInfo getReaderInfo(long readerId) {
        return readerInfomapper.findReaderInfoByReaderId(readerId);
    }
    @Override
    public boolean editReaderInfo(ReaderInfo readerInfo) {
        return readerInfomapper.editReaderInfo(readerInfo) > 0;
    }
    @Override
    public boolean editReaderCard(ReaderInfo readerInfo) {
        return readerInfomapper.editReaderCard(readerInfo) > 0;
    }
    @Override
    public long addReaderInfo(ReaderInfo readerInfo) {
        if(readerInfomapper.addReaderInfo(readerInfo)>0)
            return readerInfomapper.getReaderId(readerInfo);
        else return -1;
    }
}
