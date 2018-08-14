package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.MSTPEBR;
import com.kerjapraktek.paman.repository.MSTPEBR_Repository;
import com.kerjapraktek.paman.service.MSTPEBR_Service;
import com.kerjapraktek.paman.service.MST_NEG_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MSTPEBR_ServiceImpl implements MSTPEBR_Service {
    @Autowired
    private MSTPEBR_Repository mstpebr_repository;

    @Override
    public void addMSTPEBR(MSTPEBR mstpebr) {
        mstpebr_repository.save(mstpebr);
    }

    @Override
    public MSTPEBR updateMSTPEBR(MSTPEBR mstpebr) {
        return mstpebr_repository.save(mstpebr);
    }

    @Override
    public void deleteMSTPEBRById(String KD_PEL) {
        mstpebr_repository.deleteById(KD_PEL);
    }

    @Override
    public List<MSTPEBR> getAllMSTPEBR() {
        return mstpebr_repository.findAll();
    }

    @Override
    public MSTPEBR findMSTPEBRById(String KD_PEL) {
        return mstpebr_repository.getOne(KD_PEL);
    }
}
