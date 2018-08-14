package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.ms_hs12;

import java.util.List;

public interface ms_hs12_Service {
    public void addms_hs12(ms_hs12 msHs12);
    public ms_hs12 updatems_hs12(ms_hs12 msHs12);
    public void deletems_hs12ById(String HS12_OK);
    public List<ms_hs12> getAllms_hs12();
    public ms_hs12 findms_hs12ById(String HS12_OK);
}
