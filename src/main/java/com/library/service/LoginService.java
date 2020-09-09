package com.library.service;

import com.library.bean.ReaderCard;
import com.library.mapper.adminMapper;
import com.library.mapper.readerCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class LoginService implements LoginServiceIn {

    @Resource
    private readerCardMapper readerCardmapper;
    @Resource
    private adminMapper adminmapper;
    @Override
    public boolean hasMatchReader(long readerId, String password){
        return  readerCardmapper.getIdMatchCount(readerId, password)>0;
    }

    @Override
    public String getAdminUsername(long adminId) {
        return adminmapper.getUsername(adminId);
    }

    @Override
    public ReaderCard findReaderCardByReaderId(long readerId){
        return readerCardmapper.findReaderByReaderId(readerId);
    }

    @Override
    public boolean hasMatchAdmin(long adminId, String password){
        return adminmapper.getMatchCount(adminId, password) == 1;
    }

    @Override
    public boolean adminRePassword(long adminId, String newPassword){
        return adminmapper.resetPassword(adminId,newPassword)>0;
    }
    @Override
    public String getAdminPassword(long adminId){
        return adminmapper.getPassword(adminId);
    }

    @Override
    public boolean readerRePassword(long readerId, String newPassword) {
        return readerCardmapper.resetPassword(readerId, newPassword) > 0;
    }

    @Override
    public String getReaderPassword(long readerId) {
        return readerCardmapper.getPassword(readerId);
    }


}
