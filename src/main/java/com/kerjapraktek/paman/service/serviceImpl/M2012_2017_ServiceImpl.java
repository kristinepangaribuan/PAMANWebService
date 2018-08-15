package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.M2012_2017;
import com.kerjapraktek.paman.repository.M2012_2017_Repository;
import com.kerjapraktek.paman.service.M2012_2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class M2012_2017_ServiceImpl implements M2012_2017_Service {
    @Autowired
    private M2012_2017_Repository m2012_2017_repository;

    @Override
    public void addM2012_2017(M2012_2017 m2012_2017) {
        m2012_2017_repository.save(m2012_2017);
    }

    @Override
    public M2012_2017 updateM2012_2017(M2012_2017 m2012_2017) {
        return m2012_2017_repository.save(m2012_2017);
    }

    @Override
    public void deleteM2012_2017ById(Integer Id) {
        m2012_2017_repository.deleteById(Id);
    }

    @Override
    public List<M2012_2017> getAllM2012_2017() {
        return m2012_2017_repository.findAll();
    }

    @Override
    public M2012_2017 findM2012_2017ById(Integer Id) {
        return m2012_2017_repository.getOne(Id);
    }
}
