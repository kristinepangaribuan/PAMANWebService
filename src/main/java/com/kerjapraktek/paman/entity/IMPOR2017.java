package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IMPOR2017 {
    @Id
    private String HSXCODE;

    private String TAHUN;
    private String JENIS;
    private Double NETWTHS;
    private Double CIFHSUSD;
    private String OLDCTRYCOD;
    private String PODALTCODE;

    public IMPOR2017() {
    }

    public IMPOR2017(String HSXCODE, String TAHUN, String JENIS, Double NETWTHS, Double CIFHSUSD, String OLDCTRYCOD, String PODALTCODE) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.JENIS = JENIS;
        this.NETWTHS = NETWTHS;
        this.CIFHSUSD = CIFHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.PODALTCODE = PODALTCODE;
    }

    public String getHSXCODE() {
        return HSXCODE;
    }

    public void setHSXCODE(String HSXCODE) {
        this.HSXCODE = HSXCODE;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
    }

    public String getJENIS() {
        return JENIS;
    }

    public void setJENIS(String JENIS) {
        this.JENIS = JENIS;
    }

    public Double getNETWTHS() {
        return NETWTHS;
    }

    public void setNETWTHS(Double NETWTHS) {
        this.NETWTHS = NETWTHS;
    }

    public Double getCIFHSUSD() {
        return CIFHSUSD;
    }

    public void setCIFHSUSD(Double CIFHSUSD) {
        this.CIFHSUSD = CIFHSUSD;
    }

    public String getOLDCTRYCOD() {
        return OLDCTRYCOD;
    }

    public void setOLDCTRYCOD(String OLDCTRYCOD) {
        this.OLDCTRYCOD = OLDCTRYCOD;
    }

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }
}
