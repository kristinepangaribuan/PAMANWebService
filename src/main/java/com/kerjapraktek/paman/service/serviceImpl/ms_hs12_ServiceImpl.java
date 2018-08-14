package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.ms_hs12;
import com.kerjapraktek.paman.repository.ms_hs12_Repository;
import com.kerjapraktek.paman.service.ms_hs12_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ms_hs12_ServiceImpl implements ms_hs12_Service {
    @Autowired
    private ms_hs12_Repository ms_hs12_repository;


    @Override
    public void addms_hs12(ms_hs12 msHs12) {
        ms_hs12_repository.save(msHs12);
    }

    @Override
    public ms_hs12 updatems_hs12(ms_hs12 msHs12) {
        return ms_hs12_repository.save(msHs12);
    }

    @Override
    public void deletems_hs12ById(String HS12_OK) {
        ms_hs12_repository.deleteById(HS12_OK);
    }

    @Override
    public List<ms_hs12> getAllms_hs12() {
        return ms_hs12_repository.findAll();
    }

    @Override
    public ms_hs12 findms_hs12ById(String HS12_OK) {
        return ms_hs12_repository.getOne(HS12_OK);
    }
}
