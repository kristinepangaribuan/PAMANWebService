package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.EKSPOR2017;

import java.util.List;

public interface EKSPOR2017_Service {
    public void addEKSPOR2017(EKSPOR2017 ekspor2017);
    public EKSPOR2017 updateEKSPOR2017(EKSPOR2017 ekspor2017);
    public void deleteEKSPOR2017ById(String HS2017);
    public List<EKSPOR2017> getAllEKSPOR2017();
    public EKSPOR2017 findEKSPOR2017ById(String HS2017);
}
