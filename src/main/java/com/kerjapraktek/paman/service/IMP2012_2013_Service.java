package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.IMP2012_2013;

import java.util.List;

public interface IMP2012_2013_Service {
    public void addIMP2012_2013(IMP2012_2013 imp2012_2013);
    public IMP2012_2013 updateIMP2012_2013(IMP2012_2013 imp2012_2013);
    public void deleteIMP2012_2013ById(String PODALTCODE);
    public List<IMP2012_2013> getAllIMP2012_2013();
    public IMP2012_2013 findIMP2012_2013ById(String PODALTCODE);
}
