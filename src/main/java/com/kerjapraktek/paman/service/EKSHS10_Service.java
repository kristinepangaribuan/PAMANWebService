package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.EKSHS10;

import java.util.List;

public interface EKSHS10_Service {
    public void addEKSHS10(EKSHS10 ekshs10);
    public EKSHS10 updateEKSHS10(EKSHS10 ekshs10);
    public void deleteEKSHS10ById(String HSXCODE);
    public List<EKSHS10> getAllEKSHS10();
    public EKSHS10 findEKSHS10ById(String HSXCODE);
}
