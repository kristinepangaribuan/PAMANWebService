package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.Impor;

import java.util.List;

public interface Impor_Service {
    public void addImpor(Impor impor);
    public Impor updateImpor(Impor impor);
    public void deleteImporById(Integer Id);
    public List<Impor> getAllImpor();
    public Impor findImporById(Integer Id);
}
