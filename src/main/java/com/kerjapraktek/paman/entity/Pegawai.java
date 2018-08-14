package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pegawai {
    @Id
    private String Nip;

    private String NAMA;
    private String UNIT_ESELON_I;
    private String UNIT_ESELON_II;
    private String Jabatan;

    public Pegawai() {
    }

    public Pegawai(String nip, String NAMA, String UNIT_ESELON_I, String UNIT_ESELON_II, String jabatan) {
        Nip = nip;
        this.NAMA = NAMA;
        this.UNIT_ESELON_I = UNIT_ESELON_I;
        this.UNIT_ESELON_II = UNIT_ESELON_II;
        Jabatan = jabatan;
    }

    public String getNip() {
        return Nip;
    }

    public void setNip(String nip) {
        Nip = nip;
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getUNIT_ESELON_I() {
        return UNIT_ESELON_I;
    }

    public void setUNIT_ESELON_I(String UNIT_ESELON_I) {
        this.UNIT_ESELON_I = UNIT_ESELON_I;
    }

    public String getUNIT_ESELON_II() {
        return UNIT_ESELON_II;
    }

    public void setUNIT_ESELON_II(String UNIT_ESELON_II) {
        this.UNIT_ESELON_II = UNIT_ESELON_II;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }
}
