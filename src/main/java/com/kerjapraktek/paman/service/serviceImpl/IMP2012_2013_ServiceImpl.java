package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.IMP2012_2013;
import com.kerjapraktek.paman.repository.IMP2012_2013_Repository;
import com.kerjapraktek.paman.service.IMP2012_2013_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMP2012_2013_ServiceImpl implements IMP2012_2013_Service {
    @Autowired
    private IMP2012_2013_Repository imp2012_2013_repository;

    @Override
    public void addIMP2012_2013(IMP2012_2013 imp2012_2013) {
        imp2012_2013_repository.save(imp2012_2013);
    }

    @Override
    public IMP2012_2013 updateIMP2012_2013(IMP2012_2013 imp2012_2013) {
        return imp2012_2013_repository.save(imp2012_2013);
    }

    @Override
    public void deleteIMP2012_2013ById(String PODALTCODE) {
        imp2012_2013_repository.deleteById(PODALTCODE);
    }

    @Override
    public List<IMP2012_2013> getAllIMP2012_2013() {
        return imp2012_2013_repository.findAll();
    }

    @Override
    public IMP2012_2013 findIMP2012_2013ById(String PODALTCODE) {
        return imp2012_2013_repository.getOne(PODALTCODE);
    }
}
