package com.kerjapraktek.paman.controller;

import com.kerjapraktek.paman.entity.Pegawai;
import com.kerjapraktek.paman.service.Pegawai_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pegawai")
public class Pegawai_Controller {
    @Autowired
    private Pegawai_Service pegawai_service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Pegawai> findAll() {
        return pegawai_service.getAllPegawai();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPegawai(@RequestBody Pegawai pegawai){
        Pegawai add = new Pegawai();
        add.setNip((pegawai.getNip()));
        add.setNAMA(pegawai.getNAMA());
        add.setUNIT_ESELON_I(pegawai.getUNIT_ESELON_I());
        add.setUNIT_ESELON_II(pegawai.getUNIT_ESELON_II());
        add.setJabatan(pegawai.getJabatan());
        pegawai_service.addPegawai(add);
    }

    @RequestMapping(value = "/update/{Nip}", method = RequestMethod.PUT)
    public Pegawai updatePegawai (@PathVariable("Nip")String Nip, @RequestBody Pegawai pegawai){
        Pegawai update = pegawai_service.findPegawaiById(Nip);
        update.setNAMA(pegawai.getNAMA());
        update.setUNIT_ESELON_I(pegawai.getUNIT_ESELON_I());
        update.setUNIT_ESELON_II(pegawai.getUNIT_ESELON_II());
        update.setJabatan(pegawai.getJabatan());
        return pegawai_service.updatePegawai(update);
    }

    @RequestMapping(value = "/delete/{Nip}", method = RequestMethod.DELETE)
    public void deletePegawaiById(@PathVariable("Nip")String Nip){pegawai_service.deletePegawaiById(Nip);}
}
