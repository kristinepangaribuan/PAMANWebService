package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.BTKI2017;

import java.util.List;

public interface BTKI2017_Service {
    public void addBTKI2017(BTKI2017 btki2017);
    public BTKI2017 updateBTKI2017(BTKI2017 btki2017);
    public void deleteBTKI2017ById(String BTKI_2017);
    public List<BTKI2017> getAllBTKI2017();
    public BTKI2017 findBTKI2017ById(String BTKI_2017);
}
