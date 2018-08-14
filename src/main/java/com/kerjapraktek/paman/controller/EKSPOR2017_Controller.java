package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.EKSPOR2017;
import com.kerjapraktek.paman.service.EKSPOR2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/EKSPOR2017")
public class EKSPOR2017_Controller {
    @Autowired
    private EKSPOR2017_Service ekspor2017_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<EKSPOR2017> findAll() {
        return ekspor2017_service.getAllEKSPOR2017();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEKSPOR2017(@RequestBody EKSPOR2017 ekspor2017){
        EKSPOR2017 add = new EKSPOR2017();
        add.setHS2017(ekspor2017.getHS2017());
        add.setTAHUN(ekspor2017.getTAHUN());
        add.setBLN_PROSES(ekspor2017.getBLN_PROSES());
        add.setTHN_PROSES(ekspor2017.getTHN_PROSES());
        add.setNGR_TUJUAN(ekspor2017.getNGR_TUJUAN());
        add.setNETWTHS(ekspor2017.getNETWTHS());
        add.setFOBHSUSD(ekspor2017.getFOBHSUSD());
        add.setOLDCTRYCOD(ekspor2017.getOLDCTRYCOD());
        add.setPODALTCODE(ekspor2017.getPODALTCODE());
        ekspor2017_service.addEKSPOR2017(add);
    }

    @RequestMapping(value = "/update/{HS2017}", method = RequestMethod.PUT)
    public EKSPOR2017 updateEKSPOR2017 (@PathVariable("HS2017")String HS2017, @RequestBody EKSPOR2017 ekspor2017){
        EKSPOR2017 update = ekspor2017_service.findEKSPOR2017ById(HS2017);
        update.setTAHUN(ekspor2017.getTAHUN());
        update.setBLN_PROSES(ekspor2017.getBLN_PROSES());
        update.setTHN_PROSES(ekspor2017.getTHN_PROSES());
        update.setNGR_TUJUAN(ekspor2017.getNGR_TUJUAN());
        update.setNETWTHS(ekspor2017.getNETWTHS());
        update.setFOBHSUSD(ekspor2017.getFOBHSUSD());
        update.setOLDCTRYCOD(ekspor2017.getOLDCTRYCOD());
        update.setPODALTCODE(ekspor2017.getPODALTCODE());
        return ekspor2017_service.updateEKSPOR2017(update);
    }

    @RequestMapping(value = "/delete/{HS2017}", method = RequestMethod.DELETE)
    public void deleteEKSPOR2017ById(@PathVariable("HS2017")String HS2017){ekspor2017_service.deleteEKSPOR2017ById(HS2017);}
}
