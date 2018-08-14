package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.Ekspor;
import com.kerjapraktek.paman.repository.Ekspor_Repository;
import com.kerjapraktek.paman.service.Ekspor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ekspor_ServiceImpl implements Ekspor_Service {
    @Autowired
    private Ekspor_Repository ekspor_repository;

    @Override
    public void addEkspor(Ekspor ekspor) {
        ekspor_repository.save(ekspor);
    }

    @Override
    public Ekspor updateEkspor(Ekspor ekspor) {
        return ekspor_repository.save(ekspor);
    }

    @Override
    public void deleteEksporById(Integer Id) {
        ekspor_repository.deleteById(Id);
    }

    @Override
    public List<Ekspor> getAllEkspor() {
        return ekspor_repository.findAll();
    }

    @Override
    public Ekspor findEksporById(Integer Id) {
        return ekspor_repository.getOne(Id);
    }
}
