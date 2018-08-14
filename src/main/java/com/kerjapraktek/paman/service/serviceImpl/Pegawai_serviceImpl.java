package com.kerjapraktek.paman.service.serviceImpl;

import com.kerjapraktek.paman.entity.Pegawai;
import com.kerjapraktek.paman.repository.Pegawai_Repository;
import com.kerjapraktek.paman.service.Pegawai_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pegawai_serviceImpl implements Pegawai_Service {
    @Autowired
    private Pegawai_Repository pegawai_repository;

    @Override
    public void addPegawai(Pegawai pegawai) {
        pegawai_repository.save(pegawai);
    }

    @Override
    public Pegawai updatePegawai(Pegawai pegawai) {
        return pegawai_repository.save(pegawai);
    }

    @Override
    public void deletePegawaiById(String Nip) {
        pegawai_repository.deleteById(Nip);
    }

    @Override
    public List<Pegawai> getAllPegawai() {
        return pegawai_repository.findAll();
    }

    @Override
    public Pegawai findPegawaiById(String Nip) {
        return pegawai_repository.getOne(Nip);
    }
}
