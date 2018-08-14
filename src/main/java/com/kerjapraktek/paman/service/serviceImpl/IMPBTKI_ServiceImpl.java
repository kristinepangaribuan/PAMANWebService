package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.IMPBTKI;
import com.kerjapraktek.paman.repository.IMPBTKI_Repository;
import com.kerjapraktek.paman.service.IMPBTKI_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMPBTKI_ServiceImpl implements IMPBTKI_Service {
    @Autowired
    private IMPBTKI_Repository impbtki_repository;

    @Override
    public void addIMPBTKI(IMPBTKI impbtki) {
        impbtki_repository.save(impbtki);
    }

    @Override
    public IMPBTKI updateIMPBTKI(IMPBTKI impbtki) {
        return impbtki_repository.save(impbtki);
    }

    @Override
    public void deleteIMPBTKIById(Integer Id) {
        impbtki_repository.deleteById(Id);
    }

    @Override
    public List<IMPBTKI> getAllIMPBTKI() {
        return impbtki_repository.findAll();
    }

    @Override
    public IMPBTKI findIMPBTKIById(Integer Id) {
        return impbtki_repository.getOne(Id);
    }
}
