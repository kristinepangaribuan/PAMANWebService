package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.BTKI2017;
import com.kerjapraktek.paman.repository.BTKI2017_Repository;
import com.kerjapraktek.paman.service.BTKI2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BTKI2017_ServiceImpl implements BTKI2017_Service {
    @Autowired
    private BTKI2017_Repository btki2017_repository;

    @Override
    public void addBTKI2017(BTKI2017 btki2017) {
        btki2017_repository.save(btki2017);
    }

    @Override
    public BTKI2017 updateBTKI2017(BTKI2017 btki2017) {
        return btki2017_repository.save(btki2017);
    }

    @Override
    public void deleteBTKI2017ById(String BTKI_2017) {
        btki2017_repository.deleteById(BTKI_2017);
    }

    @Override
    public List<BTKI2017> getAllBTKI2017() {
        return btki2017_repository.findAll();
    }

    @Override
    public BTKI2017 findBTKI2017ById(String BTKI_2017) {
        return btki2017_repository.getOne(BTKI_2017);
    }
}
