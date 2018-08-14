package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.Ekspor;

import java.util.List;

public interface Ekspor_Service {
    public void addEkspor(Ekspor ekspor);
    public Ekspor updateEkspor(Ekspor ekspor);
    public void deleteEksporById(Integer Id);
    public List<Ekspor> getAllEkspor();
    public Ekspor findEksporById(Integer Id);
}
