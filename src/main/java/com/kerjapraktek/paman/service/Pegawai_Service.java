package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.Pegawai;

import java.util.List;

public interface Pegawai_Service {
    public void addPegawai(Pegawai pegawai);
    public Pegawai updatePegawai(Pegawai pegawai);
    public void deletePegawaiById(String Nip);
    public List<Pegawai> getAllPegawai();
    public Pegawai findPegawaiById(String Nip);
}
