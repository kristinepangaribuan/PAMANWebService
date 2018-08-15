package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.Ekspor;
import com.kerjapraktek.paman.service.Ekspor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ekspor")
public class Ekspor_Controller {
    @Autowired
    private Ekspor_Service ekspor_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Ekspor> findAll() {
        return ekspor_service.getAllEkspor();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEkspor(@RequestBody Ekspor ekspor){
        Ekspor add = new Ekspor();
        add.setKD_PROP(ekspor.getKD_PROP());
        add.setPEL(ekspor.getPEL());
        add.setPODALTCODE(ekspor.getPODALTCODE());
        add.setHS(ekspor.getHS());
        add.setNEG(ekspor.getNEG());
        add.setN_04(ekspor.getN_04());
        add.setN_05(ekspor.getN_05());
        add.setN_06(ekspor.getN_06());
        add.setN_07(ekspor.getN_07());
        add.setN_08(ekspor.getN_08());
        add.setN_09(ekspor.getN_09());
        add.setN_10(ekspor.getN_10());
        add.setN_11(ekspor.getN_11());
        add.setN_12(ekspor.getN_12());
        add.setN_13(ekspor.getN_13());
        add.setN_14(ekspor.getN_14());
        add.setN_15(ekspor.getN_15());
        add.setN_16(ekspor.getN_16());
        add.setN_17(ekspor.getN_17());
        add.setNP_LALU(ekspor.getNP_LALU());
        add.setNP_SEKA(ekspor.getNP_SEKA());
        add.setV_04(ekspor.getV_04());
        add.setV_05(ekspor.getV_05());
        add.setV_06(ekspor.getV_06());
        add.setV_07(ekspor.getV_07());
        add.setV_08(ekspor.getV_08());
        add.setV_09(ekspor.getV_09());
        add.setV_10(ekspor.getV_10());
        add.setV_11(ekspor.getV_11());
        add.setV_12(ekspor.getV_12());
        add.setV_13(ekspor.getV_13());
        add.setV_14(ekspor.getV_14());
        add.setV_15(ekspor.getV_15());
        add.setV_16(ekspor.getV_16());
        add.setV_17(ekspor.getV_17());
        add.setVP_LALU(ekspor.getVP_LALU());
        add.setVP_SEKA(ekspor.getVP_SEKA());
        add.setPERIOD(ekspor.getPERIOD());
        ekspor_service.addEkspor(add);
    }

    @RequestMapping(value = "/update/{Id}", method = RequestMethod.PUT)
    public Ekspor updateEksporById(@PathVariable("Id")Integer Id, @RequestBody Ekspor ekspor){
        Ekspor update = ekspor_service.findEksporById(Id);
        update.setKD_PROP(ekspor.getKD_PROP());
        update.setPEL(ekspor.getPEL());
        update.setPODALTCODE(ekspor.getPODALTCODE());
        update.setHS(ekspor.getHS());
        update.setNEG(ekspor.getNEG());
        update.setN_04(ekspor.getN_04());
        update.setN_05(ekspor.getN_05());
        update.setN_06(ekspor.getN_06());
        update.setN_07(ekspor.getN_07());
        update.setN_08(ekspor.getN_08());
        update.setN_09(ekspor.getN_09());
        update.setN_10(ekspor.getN_10());
        update.setN_11(ekspor.getN_11());
        update.setN_12(ekspor.getN_12());
        update.setN_13(ekspor.getN_13());
        update.setN_14(ekspor.getN_14());
        update.setN_15(ekspor.getN_15());
        update.setN_16(ekspor.getN_16());
        update.setN_17(ekspor.getN_17());
        update.setNP_LALU(ekspor.getNP_LALU());
        update.setNP_SEKA(ekspor.getNP_SEKA());
        update.setV_04(ekspor.getV_04());
        update.setV_05(ekspor.getV_05());
        update.setV_06(ekspor.getV_06());
        update.setV_07(ekspor.getV_07());
        update.setV_08(ekspor.getV_08());
        update.setV_09(ekspor.getV_09());
        update.setV_10(ekspor.getV_10());
        update.setV_11(ekspor.getV_11());
        update.setV_12(ekspor.getV_12());
        update.setV_13(ekspor.getV_13());
        update.setV_14(ekspor.getV_14());
        update.setV_15(ekspor.getV_15());
        update.setV_16(ekspor.getV_16());
        update.setV_17(ekspor.getV_17());
        update.setVP_LALU(ekspor.getVP_LALU());
        update.setVP_SEKA(ekspor.getVP_SEKA());
        update.setPERIOD(ekspor.getPERIOD());
        return ekspor_service.updateEkspor(update);
    }

    @RequestMapping(value = "delete/{Id}" , method = RequestMethod.DELETE)
    public void deleteEksporById(@PathVariable("Id")Integer Id){
        ekspor_service.deleteEksporById(Id);
    }
}
