package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.IMPOR2017;
import com.kerjapraktek.paman.repository.IMPOR2017_Repository;
import com.kerjapraktek.paman.service.IMPOR2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMPOR2017_ServiceImpl implements IMPOR2017_Service {
    @Autowired
    private IMPOR2017_Repository impor2017_repository;


    @Override
    public void addIMPOR2017(IMPOR2017 impor2017) {
        impor2017_repository.save(impor2017);
    }

    @Override
    public IMPOR2017 updateIMPOR2017(IMPOR2017 impor2017) {
        return impor2017_repository.save(impor2017);
    }

    @Override
    public void deleteIMPOR2017ById(String HSXCODE) {
        impor2017_repository.deleteById(HSXCODE);
    }

    @Override
    public List<IMPOR2017> getAllIMPOR2017() {
        return impor2017_repository.findAll();
    }

    @Override
    public IMPOR2017 findIMPOR2017ById(String HSXCODE) {
        return impor2017_repository.getOne(HSXCODE);
    }
}
