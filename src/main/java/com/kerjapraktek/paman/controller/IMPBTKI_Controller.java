package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.IMPBTKI;
import com.kerjapraktek.paman.service.IMPBTKI_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/IMPBTKI")
public class IMPBTKI_Controller {
    @Autowired
    private IMPBTKI_Service impbtki_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<IMPBTKI> findAll() {
        return impbtki_service.getAllIMPBTKI();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addIMPBTKI(@RequestBody IMPBTKI impbtki){
        IMPBTKI add = new IMPBTKI();
        add.setPODALTCODE(impbtki.getPODALTCODE());
        add.setOLDCTRYCOD(impbtki.getOLDCTRYCOD());
        add.setHSXCODE(impbtki.getHSXCODE());
        add.setN12(impbtki.getN12());
        add.setN13(impbtki.getN13());
        add.setN14(impbtki.getN14());
        add.setN15(impbtki.getN15());
        add.setN16(impbtki.getN16());
        add.setN17(impbtki.getN17());
        add.setNLALU(impbtki.getNLALU());
        add.setNSEKA(impbtki.getNSEKA());
        add.setV12(impbtki.getV12());
        add.setV13(impbtki.getV13());
        add.setV14(impbtki.getV14());
        add.setV15(impbtki.getV15());
        add.setV16(impbtki.getV16());
        add.setV17(impbtki.getV17());
        add.setVLALU(impbtki.getVLALU());
        add.setVSEKA(impbtki.getVSEKA());
        add.setPERIOD(impbtki.getPERIOD());
        impbtki_service.addIMPBTKI(add);
    }

    @RequestMapping(value = "/update/{Id}", method = RequestMethod.PUT)
    public IMPBTKI updateIMPBTKI (@PathVariable("Id")Integer Id, @RequestBody IMPBTKI impbtki){
        IMPBTKI update = impbtki_service.findIMPBTKIById(Id);
        update.setPODALTCODE(impbtki.getPODALTCODE());
        update.setOLDCTRYCOD(impbtki.getOLDCTRYCOD());
        update.setHSXCODE(impbtki.getHSXCODE());
        update.setN12(impbtki.getN12());
        update.setN13(impbtki.getN13());
        update.setN14(impbtki.getN14());
        update.setN15(impbtki.getN15());
        update.setN16(impbtki.getN16());
        update.setN17(impbtki.getN17());
        update.setNLALU(impbtki.getNLALU());
        update.setNSEKA(impbtki.getNSEKA());
        update.setV12(impbtki.getV12());
        update.setV13(impbtki.getV13());
        update.setV14(impbtki.getV14());
        update.setV15(impbtki.getV15());
        update.setV16(impbtki.getV16());
        update.setV17(impbtki.getV17());
        update.setVLALU(impbtki.getVLALU());
        update.setVSEKA(impbtki.getVSEKA());
        update.setPERIOD(impbtki.getPERIOD());
        return impbtki_service.updateIMPBTKI(update);
    }

    @RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
    public void deleteIMPBTKIById(@PathVariable("Id")Integer Id){impbtki_service.deleteIMPBTKIById(Id);}
}
