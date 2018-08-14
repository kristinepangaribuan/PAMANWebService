package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.IMPOR2017;
import com.kerjapraktek.paman.entity.MstHS2007;
import com.kerjapraktek.paman.service.MstHS2007_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/MstHS2007")
public class MstHS2007_Controller {
    @Autowired
    private MstHS2007_Service mstHS2007_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<MstHS2007> findAll() {
        return mstHS2007_service.getAllMstHS2007();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addMstHS2007(@RequestBody MstHS2007 mstHS2007){
        MstHS2007 add = new MstHS2007();
        add.setHs07(mstHS2007.getHs07());
        add.setDesk(mstHS2007.getDesk());
        add.setBec(mstHS2007.getBec());
        add.setSitc(mstHS2007.getSitc());
        add.setOilgrpcode(mstHS2007.getOilgrpcode());
        add.setSoilgrpcod(mstHS2007.getSoilgrpcod());
        add.setSector_cod(mstHS2007.getSector_cod());
        add.setSector_desk(mstHS2007.getSector_desk());
        add.setKet(mstHS2007.getKet());
        mstHS2007_service.addMstHS2007(add);
    }

    @RequestMapping(value = "/update/{hs07}", method = RequestMethod.PUT)
    public MstHS2007 updateMstHS2007 (@PathVariable("hs07")String hs07, @RequestBody MstHS2007 mstHS2007){
        MstHS2007 update = mstHS2007_service.findMstHS2007ById(hs07);
        update.setDesk(mstHS2007.getDesk());
        update.setBec(mstHS2007.getBec());
        update.setSitc(mstHS2007.getSitc());
        update.setOilgrpcode(mstHS2007.getOilgrpcode());
        update.setSoilgrpcod(mstHS2007.getSoilgrpcod());
        update.setSector_cod(mstHS2007.getSector_cod());
        update.setSector_desk(mstHS2007.getSector_desk());
        update.setKet(mstHS2007.getKet());
        return mstHS2007_service.updateMstHS2007(update);
    }

    @RequestMapping(value = "/delete/{hs07}", method = RequestMethod.DELETE)
    public void deleteMstHS2007ById(@PathVariable("hs07")String hs07){mstHS2007_service.deleteMstHS2007ById(hs07);}
}
