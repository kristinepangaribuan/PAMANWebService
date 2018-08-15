package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.Impor;
import com.kerjapraktek.paman.service.Impor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/Impor" )
public class Impor_Controller {
    @Autowired
    private Impor_Service impor_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Impor> findAll() {
        return impor_service.getAllImpor();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addImpor(@RequestBody Impor impor){
        Impor add = new Impor();
        add.setId(impor.getId());
        add.setKD_PROP(impor.getKD_PROP());
        add.setPEL(impor.getPEL());
        add.setPODALTCODE(impor.getPODALTCODE());
        add.setHS(impor.getHS());
        add.setNEG(impor.getNEG());
        add.setN_04(impor.getN_04());
        add.setN_05(impor.getN_05());
        add.setN_06(impor.getN_06());
        add.setN_07(impor.getN_07());
        add.setN_08(impor.getN_08());
        add.setN_09(impor.getN_09());
        add.setN_10(impor.getN_10());
        add.setN_11(impor.getN_11());
        add.setN_12(impor.getN_12());
        add.setN_13(impor.getN_13());
        add.setN_14(impor.getN_14());
        add.setN_15(impor.getN_15());
        add.setN_16(impor.getN_16());
        add.setN_17(impor.getN_17());
        add.setNP_LALU(impor.getNP_LALU());
        add.setNP_SEKA(impor.getNP_SEKA());
        add.setV_04(impor.getV_04());
        add.setV_05(impor.getV_05());
        add.setV_06(impor.getV_06());
        add.setV_07(impor.getV_07());
        add.setV_08(impor.getV_08());
        add.setV_09(impor.getV_09());
        add.setV_10(impor.getV_10());
        add.setV_11(impor.getV_11());
        add.setV_12(impor.getV_12());
        add.setV_13(impor.getV_13());
        add.setV_14(impor.getV_14());
        add.setV_15(impor.getV_15());
        add.setV_16(impor.getV_16());
        add.setV_17(impor.getV_17());
        add.setVP_LALU(impor.getVP_LALU());
        add.setVP_SEKA(impor.getVP_SEKA());
        add.setPERIOD(impor.getPERIOD());
        add.setGAB(impor.getGAB());
        impor_service.addImpor(add);
    }

    @RequestMapping(value = "/update/{Id}", method = RequestMethod.PUT)
    public Impor updateImpor (@PathVariable("Id")Integer Id, @RequestBody Impor impor){
        Impor update = impor_service.findImporById(Id);
        update.setKD_PROP(impor.getKD_PROP());
        update.setPEL(impor.getPEL());
        update.setPODALTCODE(impor.getPODALTCODE());
        update.setHS(impor.getHS());
        update.setNEG(impor.getNEG());
        update.setN_04(impor.getN_04());
        update.setN_05(impor.getN_05());
        update.setN_06(impor.getN_06());
        update.setN_07(impor.getN_07());
        update.setN_08(impor.getN_08());
        update.setN_09(impor.getN_09());
        update.setN_10(impor.getN_10());
        update.setN_11(impor.getN_11());
        update.setN_12(impor.getN_12());
        update.setN_13(impor.getN_13());
        update.setN_14(impor.getN_14());
        update.setN_15(impor.getN_15());
        update.setN_16(impor.getN_16());
        update.setN_17(impor.getN_17());
        update.setNP_LALU(impor.getNP_LALU());
        update.setNP_SEKA(impor.getNP_SEKA());
        update.setV_04(impor.getV_04());
        update.setV_05(impor.getV_05());
        update.setV_06(impor.getV_06());
        update.setV_07(impor.getV_07());
        update.setV_08(impor.getV_08());
        update.setV_09(impor.getV_09());
        update.setV_10(impor.getV_10());
        update.setV_11(impor.getV_11());
        update.setV_12(impor.getV_12());
        update.setV_13(impor.getV_13());
        update.setV_14(impor.getV_14());
        update.setV_15(impor.getV_15());
        update.setV_16(impor.getV_16());
        update.setV_17(impor.getV_17());
        update.setVP_LALU(impor.getVP_LALU());
        update.setVP_SEKA(impor.getVP_SEKA());
        update.setPERIOD(impor.getPERIOD());
        update.setGAB(impor.getGAB());
        return impor_service.updateImpor(update);
    }

    @RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
    public void deleteImporById(@PathVariable("Id")Integer Id){impor_service.deleteImporById(Id);}
}
