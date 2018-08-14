package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.IMPOR2017;
import com.kerjapraktek.paman.service.IMPOR2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/IMPOR2017")
public class IMPOR2017_Controller {
    @Autowired
    private IMPOR2017_Service impor2017_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<IMPOR2017> findAll() {
        return impor2017_service.getAllIMPOR2017();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addIMPOR2017(@RequestBody IMPOR2017 impor2017){
        IMPOR2017 add = new IMPOR2017();
        add.setHSXCODE(impor2017.getHSXCODE());
        add.setTAHUN(impor2017.getTAHUN());
        add.setJENIS(impor2017.getJENIS());
        add.setNETWTHS(impor2017.getNETWTHS());
        add.setCIFHSUSD(impor2017.getCIFHSUSD());
        add.setOLDCTRYCOD(impor2017.getOLDCTRYCOD());
        add.setPODALTCODE(impor2017.getPODALTCODE());
        impor2017_service.addIMPOR2017(add);
    }

    @RequestMapping(value = "/update/{HSXCODE}", method = RequestMethod.PUT)
    public IMPOR2017 updateIMPOR2017 (@PathVariable("HSXCODE")String HSXCODE, @RequestBody IMPOR2017 impor2017){
        IMPOR2017 update = impor2017_service.findIMPOR2017ById(HSXCODE);
        update.setTAHUN(impor2017.getTAHUN());
        update.setJENIS(impor2017.getJENIS());
        update.setNETWTHS(impor2017.getNETWTHS());
        update.setCIFHSUSD(impor2017.getCIFHSUSD());
        update.setPODALTCODE(impor2017.getPODALTCODE());
        return impor2017_service.updateIMPOR2017(update);
    }

    @RequestMapping(value = "/delete/{HSXCODE}", method = RequestMethod.DELETE)
    public void deleteIMPOR2017ById(@PathVariable("HSXCODE")String HSXCODE){impor2017_service.deleteIMPOR2017ById(HSXCODE);}
}
