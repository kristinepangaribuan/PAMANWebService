package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.EXP2012_2013;
import com.kerjapraktek.paman.repository.EXP2012_2013_Repository;
import com.kerjapraktek.paman.service.EXP2012_2013_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EXP2012_2013_ServiceImpl implements EXP2012_2013_Service {
    @Autowired
    private EXP2012_2013_Repository exp2012_2013_repository;

    @Override
    public void addEXP2012_2013(EXP2012_2013 exp2012_2013) {
        exp2012_2013_repository.save(exp2012_2013);
    }

    @Override
    public EXP2012_2013 updateEXP2012_2013(EXP2012_2013 exp2012_2013) {
        return exp2012_2013_repository.save(exp2012_2013);
    }

    @Override
    public void deleteEXP2012_2013ById(String HSXCODE) {
        exp2012_2013_repository.deleteById(HSXCODE);
    }

    @Override
    public List<EXP2012_2013> getAllEXP2012_2013() {
        return exp2012_2013_repository.findAll();
    }

    @Override
    public EXP2012_2013 findEXP2012_2013ById(String HSXCODE) {
        return exp2012_2013_repository.getOne(HSXCODE);
    }
}
