package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.M2012_2017;
import com.kerjapraktek.paman.service.M2012_2017_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/M2012_2017")
public class M2012_2017_Controller {
    @Autowired
    private M2012_2017_Service m2012_2017_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<M2012_2017> findAll() {
        return m2012_2017_service.getAllM2012_2017();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPegawai(@RequestBody M2012_2017 m2012_2017){
        M2012_2017 add = new M2012_2017();
        add.setBTKI_2012(m2012_2017.getBTKI_2012());
        add.setBTKI_2017(m2012_2017.getBTKI_2017());
        m2012_2017_service.addM2012_2017(add);
    }

    @RequestMapping(value = "/update/{Id}", method = RequestMethod.PUT)
    public M2012_2017 updateM2012_2017 (@PathVariable("Id")Integer Id, @RequestBody M2012_2017 m2012_2017){
        M2012_2017 update = m2012_2017_service.findM2012_2017ById(Id);
        update.setBTKI_2012(m2012_2017.getBTKI_2012());
        update.setBTKI_2017(m2012_2017.getBTKI_2017());
        return m2012_2017_service.updateM2012_2017(update);
    }

    @RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
    public void deleteM2012_2017ById(@PathVariable("Id")Integer Id){m2012_2017_service.deleteM2012_2017ById(Id);}
}
