package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EKSHS10 {
    @Id
    private String HSXCODE;

    private String TAHUN;
    private String PODALTCODE;
    private String OLDCTRYCOD;
    private String SITCCODE;
    private Double NETWTHS;
    private Double FOBHSUSD;
    private String DESTCTRY;
    private String PROV;

    public EKSHS10() {
    }

    public EKSHS10(String HSXCODE, String TAHUN, String PODALTCODE, String OLDCTRYCOD, String SITCCODE, Double NETWTHS, Double FOBHSUSD, String DESTCTRY, String PROV) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.PODALTCODE = PODALTCODE;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.SITCCODE = SITCCODE;
        this.NETWTHS = NETWTHS;
        this.FOBHSUSD = FOBHSUSD;
        this.DESTCTRY = DESTCTRY;
        this.PROV = PROV;
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

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }

    public String getOLDCTRYCOD() {
        return OLDCTRYCOD;
    }

    public void setOLDCTRYCOD(String OLDCTRYCOD) {
        this.OLDCTRYCOD = OLDCTRYCOD;
    }

    public String getSITCCODE() {
        return SITCCODE;
    }

    public void setSITCCODE(String SITCCODE) {
        this.SITCCODE = SITCCODE;
    }

    public Double getNETWTHS() {
        return NETWTHS;
    }

    public void setNETWTHS(Double NETWTHS) {
        this.NETWTHS = NETWTHS;
    }

    public Double getFOBHSUSD() {
        return FOBHSUSD;
    }

    public void setFOBHSUSD(Double FOBHSUSD) {
        this.FOBHSUSD = FOBHSUSD;
    }

    public String getDESTCTRY() {
        return DESTCTRY;
    }

    public void setDESTCTRY(String DESTCTRY) {
        this.DESTCTRY = DESTCTRY;
    }

    public String getPROV() {
        return PROV;
    }

    public void setPROV(String PROV) {
        this.PROV = PROV;
    }
}
