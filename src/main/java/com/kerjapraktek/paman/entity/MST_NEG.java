package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MST_NEG {
    @Id
    private String NEG;

    private Boolean Kode;
    private String COUNTER;
    private String URUT;
    private String URAI_ASING;
    private String URAI_INDO;
    private String URAIAN;
    private String REGION;
    private String AA;
    private String KD_GNB;
    private String oki;
    private String apecaseannaftaeuokignb;
    private String eu;

    public MST_NEG() {
    }

    public MST_NEG(String NEG, Boolean kode, String COUNTER, String URUT, String URAI_ASING, String URAI_INDO, String URAIAN, String REGION, String AA, String KD_GNB, String oki, String apecaseannaftaeuokignb, String eu) {
        this.NEG = NEG;
        Kode = kode;
        this.COUNTER = COUNTER;
        this.URUT = URUT;
        this.URAI_ASING = URAI_ASING;
        this.URAI_INDO = URAI_INDO;
        this.URAIAN = URAIAN;
        this.REGION = REGION;
        this.AA = AA;
        this.KD_GNB = KD_GNB;
        this.oki = oki;
        this.apecaseannaftaeuokignb = apecaseannaftaeuokignb;
        this.eu = eu;
    }

    public String getNEG() {
        return NEG;
    }

    public void setNEG(String NEG) {
        this.NEG = NEG;
    }

    public Boolean getKode() {
        return Kode;
    }

    public void setKode(Boolean kode) {
        Kode = kode;
    }

    public String getCOUNTER() {
        return COUNTER;
    }

    public void setCOUNTER(String COUNTER) {
        this.COUNTER = COUNTER;
    }

    public String getURUT() {
        return URUT;
    }

    public void setURUT(String URUT) {
        this.URUT = URUT;
    }

    public String getURAI_ASING() {
        return URAI_ASING;
    }

    public void setURAI_ASING(String URAI_ASING) {
        this.URAI_ASING = URAI_ASING;
    }

    public String getURAI_INDO() {
        return URAI_INDO;
    }

    public void setURAI_INDO(String URAI_INDO) {
        this.URAI_INDO = URAI_INDO;
    }

    public String getURAIAN() {
        return URAIAN;
    }

    public void setURAIAN(String URAIAN) {
        this.URAIAN = URAIAN;
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    public String getAA() {
        return AA;
    }

    public void setAA(String AA) {
        this.AA = AA;
    }

    public String getKD_GNB() {
        return KD_GNB;
    }

    public void setKD_GNB(String KD_GNB) {
        this.KD_GNB = KD_GNB;
    }

    public String getOki() {
        return oki;
    }

    public void setOki(String oki) {
        this.oki = oki;
    }

    public String getApecaseannaftaeuokignb() {
        return apecaseannaftaeuokignb;
    }

    public void setApecaseannaftaeuokignb(String apecaseannaftaeuokignb) {
        this.apecaseannaftaeuokignb = apecaseannaftaeuokignb;
    }

    public String getEu() {
        return eu;
    }

    public void setEu(String eu) {
        this.eu = eu;
    }
}
