package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.IMPHS10;
import com.kerjapraktek.paman.service.IMPHS10_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/IMPHS10")
public class IMPHS10_Controller {
    @Autowired
    private IMPHS10_Service imphs10_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<IMPHS10> findAll() {
        return imphs10_service.getAllIMPHS10();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addIMPHS10(@RequestBody IMPHS10 imphs10){
        IMPHS10 add = new IMPHS10();
        add.setHSXCODE(imphs10.getHSXCODE());
        add.setTAHUN(imphs10.getTAHUN());
        add.setPODALTCODE(imphs10.getPODALTCODE());
        add.setSITCCODE(imphs10.getSITCCODE());
        add.setCTRYORIG(imphs10.getCTRYORIG());
        add.setNETWTHS(imphs10.getNETWTHS());
        add.setCIFHSUSD(imphs10.getCIFHSUSD());
        add.setOLDCTRYCOD(imphs10.getOLDCTRYCOD());
        imphs10_service.addIMPHS10(add);
    }

    @RequestMapping(value = "/update/{HSXCODE}", method = RequestMethod.PUT)
    public IMPHS10 updateIMPHS10 (@PathVariable("HSXCODE")String HSXCODE, @RequestBody IMPHS10 imphs10){
        IMPHS10 update = imphs10_service.findIMPHS10ById(HSXCODE);
        update.setTAHUN(imphs10.getTAHUN());
        update.setPODALTCODE(imphs10.getPODALTCODE());
        update.setSITCCODE(imphs10.getSITCCODE());
        update.setCTRYORIG(imphs10.getCTRYORIG());
        update.setNETWTHS(imphs10.getNETWTHS());
        update.setCIFHSUSD(imphs10.getCIFHSUSD());
        update.setOLDCTRYCOD(imphs10.getOLDCTRYCOD());
        return imphs10_service.updateIMPHS10(update);
    }

    @RequestMapping(value = "/delete/{HSXCODE}", method = RequestMethod.DELETE)
    public void deleteIMPHS10ById(@PathVariable("HSXCODE")String HSXCODE){imphs10_service.deleteIMPHS10ById(HSXCODE);}
}
