package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.EKSPOR2017;
import com.kerjapraktek.paman.repository.EKSPOR2017_Repository;
import com.kerjapraktek.paman.service.EKSHS10_Service;
import com.kerjapraktek.paman.service.EKSPOR2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EKSPOR2017_ServiceImpl implements EKSPOR2017_Service {
    @Autowired
    private EKSPOR2017_Repository ekspor2017_repository;

    @Override
    public void addEKSPOR2017(EKSPOR2017 ekspor2017) {
        ekspor2017_repository.save(ekspor2017);
    }

    @Override
    public EKSPOR2017 updateEKSPOR2017(EKSPOR2017 ekspor2017) {
        return ekspor2017_repository.save(ekspor2017);
    }

    @Override
    public void deleteEKSPOR2017ById(String HS2017) {
        ekspor2017_repository.deleteById(HS2017);
    }

    @Override
    public List<EKSPOR2017> getAllEKSPOR2017() {
        return ekspor2017_repository.findAll();
    }

    @Override
    public EKSPOR2017 findEKSPOR2017ById(String HS2017) {
        return ekspor2017_repository.getOne(HS2017);
    }
}
