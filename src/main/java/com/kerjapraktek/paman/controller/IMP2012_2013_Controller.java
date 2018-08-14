package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.IMP2012_2013;
import com.kerjapraktek.paman.service.IMP2012_2013_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/IMP2012_2013")
public class IMP2012_2013_Controller {
    @Autowired
    private IMP2012_2013_Service imp2012_2013_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<IMP2012_2013> findAll() {
        return imp2012_2013_service.getAllIMP2012_2013();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addIMP2012_2013(@RequestBody IMP2012_2013 imp2012_2013){
        IMP2012_2013 add = new IMP2012_2013();
        add.setPODALTCODE(imp2012_2013.getPODALTCODE());
        add.setGAB(imp2012_2013.getGAB());
        add.setTAHUN(imp2012_2013.getTAHUN());
        add.setHSXCODE(imp2012_2013.getHSXCODE());
        add.setSITCCODE(imp2012_2013.getSITCCODE());
        add.setQTY(imp2012_2013.getQTY());
        add.setGROSSWTHS(imp2012_2013.getGROSSWTHS());
        add.setNETWTHS(imp2012_2013.getNETWTHS());
        add.setCIFHSUSD(imp2012_2013.getCIFHSUSD());
        add.setOLDCTRYCOD(imp2012_2013.getOLDCTRYCOD());
        add.setCTRYORIG(imp2012_2013.getCTRYORIG());
        imp2012_2013_service.addIMP2012_2013(add);
    }

    @RequestMapping(value = "/update/{PODALTCODE}", method = RequestMethod.PUT)
    public IMP2012_2013 updateIMP2012_2013 (@PathVariable("PODALTCODE")String PODALTCODE, @RequestBody IMP2012_2013 imp2012_2013){
        IMP2012_2013 update = imp2012_2013_service.findIMP2012_2013ById(PODALTCODE);
        update.setGAB(imp2012_2013.getGAB());
        update.setTAHUN(imp2012_2013.getTAHUN());
        update.setHSXCODE(imp2012_2013.getHSXCODE());
        update.setSITCCODE(imp2012_2013.getSITCCODE());
        update.setQTY(imp2012_2013.getQTY());
        update.setGROSSWTHS(imp2012_2013.getGROSSWTHS());
        update.setNETWTHS(imp2012_2013.getNETWTHS());
        update.setCIFHSUSD(imp2012_2013.getCIFHSUSD());
        update.setOLDCTRYCOD(imp2012_2013.getOLDCTRYCOD());
        update.setCTRYORIG(imp2012_2013.getCTRYORIG());
        return imp2012_2013_service.updateIMP2012_2013(update);
    }

    @RequestMapping(value = "/delete/{PODALTCODE}", method = RequestMethod.DELETE)
    public void deleteIMP2012_2013ById(@PathVariable("PODALTCODE")String PODALTCODE){imp2012_2013_service.deleteIMP2012_2013ById(PODALTCODE);}
}
