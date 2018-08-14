package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.ms_hs12;
import com.kerjapraktek.paman.service.ms_hs12_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ms_hs12")
public class ms_hs12_Controller {
    @Autowired
    private ms_hs12_Service ms_hs12_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ms_hs12> findAll() {
        return ms_hs12_service.getAllms_hs12();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addms_hs12(@RequestBody ms_hs12 msHs12){
        ms_hs12 add = new ms_hs12();
        add.setHS12_OK(msHs12.getHS12_OK());
        add.setNO(msHs12.getNO());
        add.setHS12(msHs12.getHS12());
        add.setDESK1(msHs12.getDESK1());
        add.setDESK2(msHs12.getDESK2());
        add.setSEKTOR(msHs12.getSEKTOR());
        ms_hs12_service.addms_hs12(add);
    }

    @RequestMapping(value = "/update/{HS12_OK}", method = RequestMethod.PUT)
    public ms_hs12 updatems_hs12 (@PathVariable("HS12_OK")String HS12_OK, @RequestBody ms_hs12 msHs12){
        ms_hs12 update = ms_hs12_service.findms_hs12ById(HS12_OK);
        update.setNO(msHs12.getNO());
        update.setHS12(msHs12.getHS12());
        update.setDESK1(msHs12.getDESK1());
        update.setDESK2(msHs12.getDESK2());
        update.setSEKTOR(msHs12.getSEKTOR());
        return ms_hs12_service.updatems_hs12(update);
    }

    @RequestMapping(value = "/delete/{HS12_OK}", method = RequestMethod.DELETE)
    public void deletems_hs12ById(@PathVariable("HS12_OK")String HS12_OK){ms_hs12_service.deletems_hs12ById(HS12_OK);}
}
