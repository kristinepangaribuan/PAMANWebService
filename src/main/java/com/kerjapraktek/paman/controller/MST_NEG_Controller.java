package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.MST_NEG;
import com.kerjapraktek.paman.service.MST_NEG_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/MST_NEG")
public class MST_NEG_Controller {
    @Autowired
    private MST_NEG_Service mst_neg_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<MST_NEG> findAll() {
        return mst_neg_service.getAllMST_NEG();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addMST_NEG(@RequestBody MST_NEG mst_neg){
        MST_NEG add = new MST_NEG();
        add.setNEG(mst_neg.getNEG());
        add.setKode(mst_neg.getKode());
        add.setCOUNTER(mst_neg.getCOUNTER());
        add.setURUT(mst_neg.getURUT());
        add.setURAI_ASING(mst_neg.getURAI_ASING());
        add.setURAI_INDO(mst_neg.getURAI_INDO());
        add.setURAIAN(mst_neg.getURAIAN());
        add.setREGION(mst_neg.getREGION());
        add.setAA(mst_neg.getAA());
        add.setKD_GNB(mst_neg.getKD_GNB());
        add.setOki(mst_neg.getOki());
        add.setApecaseannaftaeuokignb(mst_neg.getApecaseannaftaeuokignb());
        add.setEu(mst_neg.getEu());
        mst_neg_service.addMST_NEG(add);
    }

    @RequestMapping(value = "/update/{NEG}", method = RequestMethod.PUT)
    public MST_NEG updateMST_NEG (@PathVariable("NEG")String NEG, @RequestBody MST_NEG mst_neg){
        MST_NEG update = mst_neg_service.findMST_NEGById(NEG);
        update.setKode(mst_neg.getKode());
        update.setCOUNTER(mst_neg.getCOUNTER());
        update.setURUT(mst_neg.getURUT());
        update.setURAI_ASING(mst_neg.getURAI_ASING());
        update.setURAI_INDO(mst_neg.getURAI_INDO());
        update.setURAIAN(mst_neg.getURAIAN());
        update.setREGION(mst_neg.getREGION());
        update.setAA(mst_neg.getAA());
        update.setKD_GNB(mst_neg.getKD_GNB());
        update.setOki(mst_neg.getOki());
        update.setApecaseannaftaeuokignb(mst_neg.getApecaseannaftaeuokignb());
        update.setEu(mst_neg.getEu());
        return mst_neg_service.updateMST_NEG(update);
    }

    @RequestMapping(value = "/delete/{NEG}", method = RequestMethod.DELETE)
    public void deleteMST_NEGById(@PathVariable("NEG")String NEG){mst_neg_service.deleteMST_NEGById(NEG);}
}
