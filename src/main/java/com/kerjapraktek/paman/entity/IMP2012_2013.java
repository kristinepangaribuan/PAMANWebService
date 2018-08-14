package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IMP2012_2013 {
    @Id
    private String PODALTCODE;

    private String GAB;
    private String TAHUN;
    private String HSXCODE;
    private String SITCCODE;
    private Double QTY;
    private Double GROSSWTHS;
    private Double NETWTHS;
    private Double CIFHSUSD;
    private String OLDCTRYCOD;
    private String CTRYORIG;

    public IMP2012_2013() {
    }

    public IMP2012_2013(String PODALTCODE, String GAB, String TAHUN, String HSXCODE, String SITCCODE, Double QTY, Double GROSSWTHS, Double NETWTHS, Double CIFHSUSD, String OLDCTRYCOD, String CTRYORIG) {
        this.PODALTCODE = PODALTCODE;
        this.GAB = GAB;
        this.TAHUN = TAHUN;
        this.HSXCODE = HSXCODE;
        this.SITCCODE = SITCCODE;
        this.QTY = QTY;
        this.GROSSWTHS = GROSSWTHS;
        this.NETWTHS = NETWTHS;
        this.CIFHSUSD = CIFHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.CTRYORIG = CTRYORIG;
    }

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }

    public String getGAB() {
        return GAB;
    }

    public void setGAB(String GAB) {
        this.GAB = GAB;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
    }

    public String getHSXCODE() {
        return HSXCODE;
    }

    public void setHSXCODE(String HSXCODE) {
        this.HSXCODE = HSXCODE;
    }

    public String getSITCCODE() {
        return SITCCODE;
    }

    public void setSITCCODE(String SITCCODE) {
        this.SITCCODE = SITCCODE;
    }

    public Double getQTY() {
        return QTY;
    }

    public void setQTY(Double QTY) {
        this.QTY = QTY;
    }

    public Double getGROSSWTHS() {
        return GROSSWTHS;
    }

    public void setGROSSWTHS(Double GROSSWTHS) {
        this.GROSSWTHS = GROSSWTHS;
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

    public String getCTRYORIG() {
        return CTRYORIG;
    }

    public void setCTRYORIG(String CTRYORIG) {
        this.CTRYORIG = CTRYORIG;
    }
}
