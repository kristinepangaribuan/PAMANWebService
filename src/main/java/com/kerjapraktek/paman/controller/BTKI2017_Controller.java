package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.BTKI2017;
import com.kerjapraktek.paman.service.BTKI2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/BTKI2017")
public class BTKI2017_Controller {
    @Autowired
    private BTKI2017_Service btki2017_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<BTKI2017> findAll() {
        return btki2017_service.getAllBTKI2017();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addBTKI2017(@RequestBody BTKI2017 btki2017){
        BTKI2017 add = new BTKI2017();
        add.setBTKI_2017((btki2017.getBTKI_2017()));
        add.setDESKR_HS(btki2017.getDESKR_HS());
        add.setBEC(btki2017.getBEC());
        add.setSITCREV4(btki2017.getSITCREV4());
        add.setISICREV4(btki2017.getISICREV4());
        add.setOILGRPCODE(btki2017.getOILGRPCODE());
        add.setOILGRDESC(btki2017.getOILGRDESC());
        add.setSECCODE(btki2017.getSECCODE());
        add.setSECDESC(btki2017.getSECDESC());
        add.setSECTORCODE(btki2017.getSECTORCODE());
        add.setSECTORDESC(btki2017.getSECTORDESC());
        add.setBRSCODE(btki2017.getBRSCODE());
        add.setBRSDESC(btki2017.getBRSDESC());
        add.setCOMMGRPCOD(btki2017.getCOMMGRPCOD());
        add.setCOMGRPDESC(btki2017.getCOMGRPDESC());
        add.setCOMMCODE(btki2017.getCOMMCODE());
        add.setCOMMDESC(btki2017.getCOMMDESC());
        add.setKBLI2015(btki2017.getKBLI2015());
        add.setDESKKBLI20(btki2017.getDESKKBLI20());
        btki2017_service.addBTKI2017(add);
    }

    @RequestMapping(value = "/update/{BTKI_2017}", method = RequestMethod.PUT)
    public BTKI2017 updateBTKI2017ById(@PathVariable("BTKI_2017")String BTKI_2017, @RequestBody BTKI2017 btki2017){
        BTKI2017 update = btki2017_service.findBTKI2017ById(BTKI_2017);
        update.setDESKR_HS(btki2017.getDESKR_HS());
        update.setBEC(btki2017.getBEC());
        update.setSITCREV4(btki2017.getSITCREV4());
        update.setISICREV4(btki2017.getISICREV4());
        update.setOILGRPCODE(btki2017.getOILGRPCODE());
        update.setOILGRDESC(btki2017.getOILGRDESC());
        update.setSECCODE(btki2017.getSECCODE());
        update.setSECDESC(btki2017.getSECDESC());
        update.setSECTORCODE(btki2017.getSECTORCODE());
        update.setSECTORDESC(btki2017.getSECTORDESC());
        update.setBRSCODE(btki2017.getBRSCODE());
        update.setBRSDESC(btki2017.getBRSDESC());
        update.setCOMMGRPCOD(btki2017.getCOMMGRPCOD());
        update.setCOMGRPDESC(btki2017.getCOMGRPDESC());
        update.setCOMMCODE(btki2017.getCOMMCODE());
        update.setCOMMDESC(btki2017.getCOMMDESC());
        update.setKBLI2015(btki2017.getKBLI2015());
        update.setDESKKBLI20(btki2017.getDESKKBLI20());
        return btki2017_service.updateBTKI2017(update);
    }

    @RequestMapping(value = "delete/{BTKI_2017}" , method = RequestMethod.DELETE)
    public void deleteBTKI2017ById(@PathVariable("BTKI_2017")String BTKI_2017){
        btki2017_service.deleteBTKI2017ById(BTKI_2017);
    }
}
