package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.EXP2012_2013;

import java.util.List;

public interface EXP2012_2013_Service {
    public void addEXP2012_2013(EXP2012_2013 exp2012_2013);
    public EXP2012_2013 updateEXP2012_2013(EXP2012_2013 exp2012_2013);
    public void deleteEXP2012_2013ById(String HSXCODE);
    public List<EXP2012_2013> getAllEXP2012_2013();
    public EXP2012_2013 findEXP2012_2013ById(String HSXCODE);
}
