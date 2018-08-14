package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.MSTPEBR;

import java.util.List;

public interface MSTPEBR_Service {
    public void addMSTPEBR(MSTPEBR mstpebr);
    public MSTPEBR updateMSTPEBR(MSTPEBR mstpebr);
    public void deleteMSTPEBRById(String KD_PEL);
    public List<MSTPEBR> getAllMSTPEBR();
    public MSTPEBR findMSTPEBRById(String KD_PEL);
}
