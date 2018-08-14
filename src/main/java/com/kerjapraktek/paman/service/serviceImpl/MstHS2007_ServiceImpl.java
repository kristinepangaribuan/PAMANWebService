package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.MstHS2007;
import com.kerjapraktek.paman.repository.MstHS2007_Repository;
import com.kerjapraktek.paman.service.MstHS2007_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MstHS2007_ServiceImpl implements MstHS2007_Service {
    @Autowired
    private MstHS2007_Repository mstHS2007_repository;

    @Override
    public void addMstHS2007(MstHS2007 mstHS2007) {
        mstHS2007_repository.save(mstHS2007);
    }

    @Override
    public MstHS2007 updateMstHS2007(MstHS2007 mstHS2007) {
        return mstHS2007_repository.save(mstHS2007);
    }

    @Override
    public void deleteMstHS2007ById(String hs07) {
        mstHS2007_repository.deleteById(hs07);
    }

    @Override
    public List<MstHS2007> getAllMstHS2007() {
        return mstHS2007_repository.findAll();
    }

    @Override
    public MstHS2007 findMstHS2007ById(String hs07) {
        return mstHS2007_repository.getOne(hs07);
    }
}
