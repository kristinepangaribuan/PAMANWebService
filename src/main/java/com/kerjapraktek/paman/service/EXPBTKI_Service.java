package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.EXPBTKI;

import java.util.List;

public interface EXPBTKI_Service {
    public void addEXPBTKI(EXPBTKI expbtki);
    public EXPBTKI updateEXPBTKI(EXPBTKI expbtki);
    public void deleteEXPBTKIById(String HSXCODE);
    public List<EXPBTKI> getAllEXPBTKI();
    public EXPBTKI findEXPBTKIById(String HSXCODE);
}
