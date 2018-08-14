package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IMPHS10 {
    @Id
    private String HSXCODE;

    private String TAHUN;
    private String PODALTCODE;
    private String SITCCODE;
    private String CTRYORIG;
    private Double NETWTHS;
    private Double CIFHSUSD;
    private String OLDCTRYCOD;

    public IMPHS10() {
    }

    public IMPHS10(String HSXCODE, String TAHUN, String PODALTCODE, String SITCCODE, String CTRYORIG, Double NETWTHS, Double CIFHSUSD, String OLDCTRYCOD) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.PODALTCODE = PODALTCODE;
        this.SITCCODE = SITCCODE;
        this.CTRYORIG = CTRYORIG;
        this.NETWTHS = NETWTHS;
        this.CIFHSUSD = CIFHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
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

    public String getSITCCODE() {
        return SITCCODE;
    }

    public void setSITCCODE(String SITCCODE) {
        this.SITCCODE = SITCCODE;
    }

    public String getCTRYORIG() {
        return CTRYORIG;
    }

    public void setCTRYORIG(String CTRYORIG) {
        this.CTRYORIG = CTRYORIG;
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
}
