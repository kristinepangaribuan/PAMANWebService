package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.MSTPEBR;
import com.kerjapraktek.paman.service.MSTPEBR_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/MSTPEBR")
public class MSTPEBR_Controller {
    @Autowired
    private MSTPEBR_Service mstpebr_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<MSTPEBR> findAll() {
        return mstpebr_service.getAllMSTPEBR();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addMSTPEBR(@RequestBody MSTPEBR mstpebr){
        MSTPEBR add = new MSTPEBR();
        add.setKD_PEL(mstpebr.getKD_PEL());
        add.setNO(mstpebr.getNO());
        add.setKD_PROP(mstpebr.getKD_PROP());
        add.setNM_PROP(mstpebr.getNM_PROP());
        add.setKD_HURUF(mstpebr.getKD_HURUF());
        add.setPELABUHAN(mstpebr.getPELABUHAN());
        add.setPEL(mstpebr.getPEL());
        add.setMODE_TRANS(mstpebr.getMODE_TRANS());
        mstpebr_service.addMSTPEBR(add);
    }

    @RequestMapping(value = "/update/{KD_PEL}", method = RequestMethod.PUT)
    public MSTPEBR updateMSTPEBR (@PathVariable("KD_PEL")String KD_PEL, @RequestBody MSTPEBR mstpebr){
        MSTPEBR update = mstpebr_service.findMSTPEBRById(KD_PEL);
        update.setNO(mstpebr.getNO());
        update.setKD_PROP(mstpebr.getKD_PROP());
        update.setNM_PROP(mstpebr.getNM_PROP());
        update.setKD_HURUF(mstpebr.getKD_HURUF());
        update.setPELABUHAN(mstpebr.getPELABUHAN());
        update.setPEL(mstpebr.getPEL());
        update.setMODE_TRANS(mstpebr.getMODE_TRANS());
        return mstpebr_service.updateMSTPEBR(update);
    }

    @RequestMapping(value = "/delete/{KD_PEL}", method = RequestMethod.DELETE)
    public void deleteMSTPEBRById(@PathVariable("KD_PEL")String KD_PEL){mstpebr_service.deleteMSTPEBRById(KD_PEL);}
}
