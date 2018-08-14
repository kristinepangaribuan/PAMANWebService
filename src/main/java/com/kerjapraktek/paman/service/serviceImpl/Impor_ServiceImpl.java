package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.Impor;
import com.kerjapraktek.paman.repository.Impor_Repository;
import com.kerjapraktek.paman.service.Impor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Impor_ServiceImpl implements Impor_Service {
    @Autowired
    private Impor_Repository impor_repository;

    @Override
    public void addImpor(Impor impor) {
        impor_repository.save(impor);
    }

    @Override
    public Impor updateImpor(Impor impor) {
        return impor_repository.save(impor);
    }

    @Override
    public void deleteImporById(Integer Id) {
        impor_repository.deleteById(Id);
    }

    @Override
    public List<Impor> getAllImpor() {
        return impor_repository.findAll();
    }

    @Override
    public Impor findImporById(Integer Id) {
        return impor_repository.getOne(Id);
    }
}
