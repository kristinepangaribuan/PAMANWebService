package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.IMPOR2017;

import java.util.List;

public interface IMPOR2017_Service {
    public void addIMPOR2017(IMPOR2017 impor2017);
    public IMPOR2017 updateIMPOR2017(IMPOR2017 impor2017);
    public void deleteIMPOR2017ById(String HSXCODE);
    public List<IMPOR2017> getAllIMPOR2017();
    public IMPOR2017 findIMPOR2017ById(String HSXCODE);
}
