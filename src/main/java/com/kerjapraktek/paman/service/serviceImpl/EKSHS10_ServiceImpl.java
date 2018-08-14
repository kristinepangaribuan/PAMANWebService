package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.EKSHS10;
import com.kerjapraktek.paman.repository.EKSHS10_Repository;
import com.kerjapraktek.paman.service.EKSHS10_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EKSHS10_ServiceImpl implements EKSHS10_Service {
    @Autowired
    private EKSHS10_Repository ekshs10_repository;

    @Override
    public void addEKSHS10(EKSHS10 ekshs10) {
        ekshs10_repository.save(ekshs10);
    }

    @Override
    public EKSHS10 updateEKSHS10(EKSHS10 ekshs10) {
        return ekshs10_repository.save(ekshs10);
    }

    @Override
    public void deleteEKSHS10ById(String HSXCODE) {
        ekshs10_repository.deleteById(HSXCODE);
    }

    @Override
    public List<EKSHS10> getAllEKSHS10() {
        return ekshs10_repository.findAll();
    }

    @Override
    public EKSHS10 findEKSHS10ById(String HSXCODE) {
        return ekshs10_repository.getOne(HSXCODE);
    }
}
