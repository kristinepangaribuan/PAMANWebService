package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.IMPHS10;

import java.util.List;

public interface IMPHS10_Service {
    public void addIMPHS10(IMPHS10 imphs10);
    public IMPHS10 updateIMPHS10(IMPHS10 imphs10);
    public void deleteIMPHS10ById(String HSXCODE);
    public List<IMPHS10> getAllIMPHS10();
    public IMPHS10 findIMPHS10ById(String HSXCODE);
}
