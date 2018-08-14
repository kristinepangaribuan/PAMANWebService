package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.EXP2012_2013;
import com.kerjapraktek.paman.service.EXP2012_2013_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/EXP2012_2013")
public class EXP2012_2013_Controller {
    @Autowired
    private EXP2012_2013_Service exp2012_2013_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<EXP2012_2013> findAll() {
        return exp2012_2013_service.getAllEXP2012_2013();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEXP2012_2013(@RequestBody EXP2012_2013 exp2012_2013){
        EXP2012_2013 add = new EXP2012_2013();
        add.setHSXCODE(exp2012_2013.getHSXCODE());
        add.setTAHUN(exp2012_2013.getTAHUN());
        add.setPROCMTH(exp2012_2013.getPROCMTH());
        add.setPODALTCODE(exp2012_2013.getPODALTCODE());
        add.setOLDCTRYCOD(exp2012_2013.getOLDCTRYCOD());
        add.setDESTCTRY(exp2012_2013.getDESTCTRY());
        add.setSITCCODE(exp2012_2013.getSITCCODE());
        add.setNETWTHS(exp2012_2013.getNETWTHS());
        add.setFOBHSUSD(exp2012_2013.getFOBHSUSD());
        exp2012_2013_service.addEXP2012_2013(add);
    }

    @RequestMapping(value = "/update/{HSXCODE}", method = RequestMethod.PUT)
    public EXP2012_2013 updateEXP2012_2013(@PathVariable("HSXCODE")String HSXCODE, @RequestBody EXP2012_2013 exp2012_2013){
        EXP2012_2013 update = exp2012_2013_service.findEXP2012_2013ById(HSXCODE);
        update.setTAHUN(exp2012_2013.getTAHUN());
        update.setPROCMTH(exp2012_2013.getPROCMTH());
        update.setPODALTCODE(exp2012_2013.getPODALTCODE());
        update.setOLDCTRYCOD(exp2012_2013.getOLDCTRYCOD());
        update.setDESTCTRY(exp2012_2013.getDESTCTRY());
        update.setSITCCODE(exp2012_2013.getSITCCODE());
        update.setNETWTHS(exp2012_2013.getNETWTHS());
        update.setFOBHSUSD(exp2012_2013.getFOBHSUSD());
        return exp2012_2013_service.updateEXP2012_2013(update);
    }

    @RequestMapping(value = "/delete/{HSXCODE}", method = RequestMethod.DELETE)
    public void deleteEXP2012_2013ById(@PathVariable("HSXCODE")String HSXCODE){exp2012_2013_service.deleteEXP2012_2013ById(HSXCODE);}
}
