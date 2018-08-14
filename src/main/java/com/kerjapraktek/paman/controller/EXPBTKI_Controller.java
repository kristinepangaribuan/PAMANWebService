package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.EXPBTKI;
import com.kerjapraktek.paman.service.EXPBTKI_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/EXPBTKI")
public class EXPBTKI_Controller {
    @Autowired
    private EXPBTKI_Service expbtki_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<EXPBTKI> findAll() {
        return expbtki_service.getAllEXPBTKI();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEXPBTKI(@RequestBody EXPBTKI expbtki){
        EXPBTKI add = new EXPBTKI();
        add.setHSXCODE(expbtki.getHSXCODE());
        add.setGAB(expbtki.getGAB());
        add.setKD(expbtki.getKD());
        add.setPODALTCODE(expbtki.getPODALTCODE());
        add.setOLDCTRYCOD(expbtki.getOLDCTRYCOD());
        add.setN12(expbtki.getN12());
        add.setN13(expbtki.getN13());
        add.setN14(expbtki.getN14());
        add.setN15(expbtki.getN15());
        add.setN16(expbtki.getN16());
        add.setN17(expbtki.getN17());
        add.setNLALU(expbtki.getNLALU());
        add.setNSEKA(expbtki.getNSEKA());
        add.setV12(expbtki.getV12());
        add.setV13(expbtki.getV13());
        add.setV14(expbtki.getV14());
        add.setV15(expbtki.getV15());
        add.setV16(expbtki.getV16());
        add.setV17(expbtki.getV17());
        add.setVLALU(expbtki.getVLALU());
        add.setVSEKA(expbtki.getVSEKA());
        add.setPERIOD(expbtki.getPERIOD());
        expbtki_service.addEXPBTKI(add);
    }

    @RequestMapping(value = "/update/{HSXCODE}", method = RequestMethod.PUT)
    public EXPBTKI updateEXPBTKI (@PathVariable("HSXCODE")String HSXCODE, @RequestBody EXPBTKI expbtki){
        EXPBTKI update = expbtki_service.findEXPBTKIById(HSXCODE);
        update.setGAB(expbtki.getGAB());
        update.setKD(expbtki.getKD());
        update.setPODALTCODE(expbtki.getPODALTCODE());
        update.setOLDCTRYCOD(expbtki.getOLDCTRYCOD());
        update.setN12(expbtki.getN12());
        update.setN13(expbtki.getN13());
        update.setN14(expbtki.getN14());
        update.setN15(expbtki.getN15());
        update.setN16(expbtki.getN16());
        update.setN17(expbtki.getN17());
        update.setNLALU(expbtki.getNLALU());
        update.setNSEKA(expbtki.getNSEKA());
        update.setV12(expbtki.getV12());
        update.setV13(expbtki.getV13());
        update.setV14(expbtki.getV14());
        update.setV15(expbtki.getV15());
        update.setV16(expbtki.getV16());
        update.setV17(expbtki.getV17());
        update.setVLALU(expbtki.getVLALU());
        update.setVSEKA(expbtki.getVSEKA());
        update.setPERIOD(expbtki.getPERIOD());
        return expbtki_service.updateEXPBTKI(update);
    }

    @RequestMapping(value = "/delete/{HSXCODE}", method = RequestMethod.DELETE)
    public void deleteEXPBTKIById(@PathVariable("HSXCODE")String HSXCODE){expbtki_service.deleteEXPBTKIById(HSXCODE);}
}
