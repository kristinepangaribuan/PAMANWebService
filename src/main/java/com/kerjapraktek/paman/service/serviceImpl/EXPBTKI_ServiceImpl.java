package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.EXPBTKI;
import com.kerjapraktek.paman.repository.EXPBTKI_Repository;
import com.kerjapraktek.paman.service.EXPBTKI_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EXPBTKI_ServiceImpl implements EXPBTKI_Service {
    @Autowired
    private EXPBTKI_Repository expbtki_repository;

    @Override
    public void addEXPBTKI(EXPBTKI expbtki) {
        expbtki_repository.save(expbtki);
    }

    @Override
    public EXPBTKI updateEXPBTKI(EXPBTKI expbtki) {
        return expbtki_repository.save(expbtki);
    }

    @Override
    public void deleteEXPBTKIById(String HSXCODE) {
        expbtki_repository.deleteById(HSXCODE);
    }

    @Override
    public List<EXPBTKI> getAllEXPBTKI() {
        return expbtki_repository.findAll();
    }

    @Override
    public EXPBTKI findEXPBTKIById(String HSXCODE) {
        return expbtki_repository.getOne(HSXCODE);
    }
}
