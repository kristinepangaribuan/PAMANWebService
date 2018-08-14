package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.IMPHS10;
import com.kerjapraktek.paman.repository.IMPHS10_Repository;
import com.kerjapraktek.paman.service.IMPHS10_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMPHS10_ServiceImpl implements IMPHS10_Service {
    @Autowired
    private IMPHS10_Repository imphs10_repository;


    @Override
    public void addIMPHS10(IMPHS10 imphs10) {
        imphs10_repository.save(imphs10);
    }

    @Override
    public IMPHS10 updateIMPHS10(IMPHS10 imphs10) {
        return imphs10_repository.save(imphs10);
    }

    @Override
    public void deleteIMPHS10ById(String HSXCODE) {
        imphs10_repository.deleteById(HSXCODE);
    }

    @Override
    public List<IMPHS10> getAllIMPHS10() {
        return imphs10_repository.findAll();
    }

    @Override
    public IMPHS10 findIMPHS10ById(String HSXCODE) {
        return imphs10_repository.getOne(HSXCODE);
    }
}
