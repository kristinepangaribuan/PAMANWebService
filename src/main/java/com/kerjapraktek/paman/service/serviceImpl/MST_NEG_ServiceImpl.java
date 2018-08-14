package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.MST_NEG;
import com.kerjapraktek.paman.repository.MST_NEG_Repository;
import com.kerjapraktek.paman.service.MST_NEG_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MST_NEG_ServiceImpl implements MST_NEG_Service {
    @Autowired
    private MST_NEG_Repository mst_neg_repository;

    @Override
    public void addMST_NEG(MST_NEG mst_neg) {
        mst_neg_repository.save(mst_neg);
    }

    @Override
    public MST_NEG updateMST_NEG(MST_NEG mst_neg) {
        return mst_neg_repository.save(mst_neg);
    }

    @Override
    public void deleteMST_NEGById(String NEG) {
        mst_neg_repository.deleteById(NEG);
    }

    @Override
    public List<MST_NEG> getAllMST_NEG() {
        return mst_neg_repository.findAll();
    }

    @Override
    public MST_NEG findMST_NEGById(String NEG) {
        return mst_neg_repository.getOne(NEG);
    }
}
