package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.IMPBTKI;

import java.util.List;

public interface IMPBTKI_Service {
    public void addIMPBTKI(IMPBTKI impbtki);
    public IMPBTKI updateIMPBTKI(IMPBTKI impbtki);
    public void deleteIMPBTKIById(Integer Id);
    public List<IMPBTKI> getAllIMPBTKI();
    public IMPBTKI findIMPBTKIById(Integer Id);
}
