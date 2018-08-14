package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.EKSHS10;
import com.kerjapraktek.paman.service.EKSHS10_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/EKSHS10")
public class EKSHS10_Controller {
    @Autowired
    private EKSHS10_Service ekshs10_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<EKSHS10> findAll() {
        return ekshs10_service.getAllEKSHS10();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEKSHS10(@RequestBody EKSHS10 ekshs10){
        EKSHS10 add = new EKSHS10();
        add.setHSXCODE(ekshs10.getHSXCODE());
        add.setTAHUN(ekshs10.getTAHUN());
        add.setPODALTCODE(ekshs10.getPODALTCODE());
        add.setOLDCTRYCOD(ekshs10.getOLDCTRYCOD());
        add.setSITCCODE(ekshs10.getSITCCODE());
        add.setNETWTHS(ekshs10.getNETWTHS());
        add.setFOBHSUSD(ekshs10.getFOBHSUSD());
        add.setDESTCTRY(ekshs10.getDESTCTRY());
        add.setPROV(ekshs10.getPROV());
        ekshs10_service.addEKSHS10(add);
    }

    @RequestMapping(value = "/update/{HSXCODE}", method = RequestMethod.PUT)
    public EKSHS10 updateEKSHS10 (@PathVariable("HSXCODE")String HSXCODE, @RequestBody EKSHS10 ekshs10){
        EKSHS10 update = ekshs10_service.findEKSHS10ById(HSXCODE);
        update.setTAHUN(ekshs10.getTAHUN());
        update.setPODALTCODE(ekshs10.getPODALTCODE());
        update.setOLDCTRYCOD(ekshs10.getOLDCTRYCOD());
        update.setSITCCODE(ekshs10.getSITCCODE());
        update.setNETWTHS(ekshs10.getNETWTHS());
        update.setFOBHSUSD(ekshs10.getFOBHSUSD());
        update.setDESTCTRY(ekshs10.getDESTCTRY());
        update.setPROV(ekshs10.getPROV());
        return ekshs10_service.updateEKSHS10(update);
    }

    @RequestMapping(value = "/delete/{HSXCODE}", method = RequestMethod.DELETE)
    public void deleteEKSHS10ById(@PathVariable("HSXCODE")String HSXCODE){ekshs10_service.deleteEKSHS10ById(HSXCODE);}
}
