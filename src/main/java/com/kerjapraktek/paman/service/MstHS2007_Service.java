package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.MstHS2007;

import java.util.List;

public interface MstHS2007_Service {
    public void addMstHS2007(MstHS2007 mstHS2007);
    public MstHS2007 updateMstHS2007(MstHS2007 mstHS2007);
    public void deleteMstHS2007ById(String hs07);
    public List<MstHS2007> getAllMstHS2007();
    public MstHS2007 findMstHS2007ById(String hs07);
}
