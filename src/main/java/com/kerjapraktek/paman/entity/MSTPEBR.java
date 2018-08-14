package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MSTPEBR {
    @Id
    private  String KD_PEL;

    private Double NO;
    private String KD_PROP;
    private String NM_PROP;
    private String KD_HURUF;
    private String PELABUHAN;
    private String PEL;
    private String MODE_TRANS;

    public MSTPEBR() {
    }

    public MSTPEBR(String KD_PEL, Double NO, String KD_PROP, String NM_PROP, String KD_HURUF, String PELABUHAN, String PEL, String MODE_TRANS) {
        this.KD_PEL = KD_PEL;
        this.NO = NO;
        this.KD_PROP = KD_PROP;
        this.NM_PROP = NM_PROP;
        this.KD_HURUF = KD_HURUF;
        this.PELABUHAN = PELABUHAN;
        this.PEL = PEL;
        this.MODE_TRANS = MODE_TRANS;
    }

    public String getKD_PEL() {
        return KD_PEL;
    }

    public void setKD_PEL(String KD_PEL) {
        this.KD_PEL = KD_PEL;
    }

    public Double getNO() {
        return NO;
    }

    public void setNO(Double NO) {
        this.NO = NO;
    }

    public String getKD_PROP() {
        return KD_PROP;
    }

    public void setKD_PROP(String KD_PROP) {
        this.KD_PROP = KD_PROP;
    }

    public String getNM_PROP() {
        return NM_PROP;
    }

    public void setNM_PROP(String NM_PROP) {
        this.NM_PROP = NM_PROP;
    }

    public String getKD_HURUF() {
        return KD_HURUF;
    }

    public void setKD_HURUF(String KD_HURUF) {
        this.KD_HURUF = KD_HURUF;
    }

    public String getPELABUHAN() {
        return PELABUHAN;
    }

    public void setPELABUHAN(String PELABUHAN) {
        this.PELABUHAN = PELABUHAN;
    }

    public String getPEL() {
        return PEL;
    }

    public void setPEL(String PEL) {
        this.PEL = PEL;
    }

    public String getMODE_TRANS() {
        return MODE_TRANS;
    }

    public void setMODE_TRANS(String MODE_TRANS) {
        this.MODE_TRANS = MODE_TRANS;
    }
}
