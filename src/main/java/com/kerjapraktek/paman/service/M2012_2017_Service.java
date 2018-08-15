package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.M2012_2017;

import java.util.List;

public interface M2012_2017_Service {
    public void addM2012_2017(M2012_2017 m2012_2017);
    public M2012_2017 updateM2012_2017(M2012_2017 m2012_2017);
    public void deleteM2012_2017ById(Integer Id);
    public List<M2012_2017> getAllM2012_2017();
    public M2012_2017 findM2012_2017ById(Integer Id);
}
