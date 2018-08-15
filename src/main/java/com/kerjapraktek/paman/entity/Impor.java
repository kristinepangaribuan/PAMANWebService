package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Impor {
    @Id
    private int Id;

    private String KD_PROP;
    private String PEL;
    private String PODALTCODE;
    private String HS;
    private String NEG;
    private Double N_04;
    private Double N_05;
    private Double N_06;
    private Double N_07;
    private Double N_08;
    private Double N_09;
    private Double N_10;
    private Double N_11;
    private Double N_12;
    private Double N_13;
    private Double N_14;
    private Double N_15;
    private Double N_16;
    private Double N_17;
    private Double NP_LALU;
    private Double NP_SEKA;
    private Double V_04;
    private Double V_05;
    private Double V_06;
    private Double V_07;
    private Double V_08;
    private Double V_09;
    private Double V_10;
    private Double V_11;
    private Double V_12;
    private Double V_13;
    private Double V_14;
    private Double V_15;
    private Double V_16;
    private Double V_17;
    private Double VP_LALU;
    private Double VP_SEKA;
    private String PERIOD;
    private String GAB;

    public Impor() {
    }

    public Impor(int id, String KD_PROP, String PEL, String PODALTCODE, String HS, String NEG, Double n_04, Double n_05, Double n_06, Double n_07, Double n_08, Double n_09, Double n_10, Double n_11, Double n_12, Double n_13, Double n_14, Double n_15, Double n_16, Double n_17, Double NP_LALU, Double NP_SEKA, Double v_04, Double v_05, Double v_06, Double v_07, Double v_08, Double v_09, Double v_10, Double v_11, Double v_12, Double v_13, Double v_14, Double v_15, Double v_16, Double v_17, Double VP_LALU, Double VP_SEKA, String PERIOD, String GAB) {
        Id = id;
        this.KD_PROP = KD_PROP;
        this.PEL = PEL;
        this.PODALTCODE = PODALTCODE;
        this.HS = HS;
        this.NEG = NEG;
        N_04 = n_04;
        N_05 = n_05;
        N_06 = n_06;
        N_07 = n_07;
        N_08 = n_08;
        N_09 = n_09;
        N_10 = n_10;
        N_11 = n_11;
        N_12 = n_12;
        N_13 = n_13;
        N_14 = n_14;
        N_15 = n_15;
        N_16 = n_16;
        N_17 = n_17;
        this.NP_LALU = NP_LALU;
        this.NP_SEKA = NP_SEKA;
        V_04 = v_04;
        V_05 = v_05;
        V_06 = v_06;
        V_07 = v_07;
        V_08 = v_08;
        V_09 = v_09;
        V_10 = v_10;
        V_11 = v_11;
        V_12 = v_12;
        V_13 = v_13;
        V_14 = v_14;
        V_15 = v_15;
        V_16 = v_16;
        V_17 = v_17;
        this.VP_LALU = VP_LALU;
        this.VP_SEKA = VP_SEKA;
        this.PERIOD = PERIOD;
        this.GAB = GAB;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getKD_PROP() {
        return KD_PROP;
    }

    public void setKD_PROP(String KD_PROP) {
        this.KD_PROP = KD_PROP;
    }

    public String getPEL() {
        return PEL;
    }

    public void setPEL(String PEL) {
        this.PEL = PEL;
    }

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }

    public String getHS() {
        return HS;
    }

    public void setHS(String HS) {
        this.HS = HS;
    }

    public String getNEG() {
        return NEG;
    }

    public void setNEG(String NEG) {
        this.NEG = NEG;
    }

    public Double getN_04() {
        return N_04;
    }

    public void setN_04(Double n_04) {
        N_04 = n_04;
    }

    public Double getN_05() {
        return N_05;
    }

    public void setN_05(Double n_05) {
        N_05 = n_05;
    }

    public Double getN_06() {
        return N_06;
    }

    public void setN_06(Double n_06) {
        N_06 = n_06;
    }

    public Double getN_07() {
        return N_07;
    }

    public void setN_07(Double n_07) {
        N_07 = n_07;
    }

    public Double getN_08() {
        return N_08;
    }

    public void setN_08(Double n_08) {
        N_08 = n_08;
    }

    public Double getN_09() {
        return N_09;
    }

    public void setN_09(Double n_09) {
        N_09 = n_09;
    }

    public Double getN_10() {
        return N_10;
    }

    public void setN_10(Double n_10) {
        N_10 = n_10;
    }

    public Double getN_11() {
        return N_11;
    }

    public void setN_11(Double n_11) {
        N_11 = n_11;
    }

    public Double getN_12() {
        return N_12;
    }

    public void setN_12(Double n_12) {
        N_12 = n_12;
    }

    public Double getN_13() {
        return N_13;
    }

    public void setN_13(Double n_13) {
        N_13 = n_13;
    }

    public Double getN_14() {
        return N_14;
    }

    public void setN_14(Double n_14) {
        N_14 = n_14;
    }

    public Double getN_15() {
        return N_15;
    }

    public void setN_15(Double n_15) {
        N_15 = n_15;
    }

    public Double getN_16() {
        return N_16;
    }

    public void setN_16(Double n_16) {
        N_16 = n_16;
    }

    public Double getN_17() {
        return N_17;
    }

    public void setN_17(Double n_17) {
        N_17 = n_17;
    }

    public Double getNP_LALU() {
        return NP_LALU;
    }

    public void setNP_LALU(Double NP_LALU) {
        this.NP_LALU = NP_LALU;
    }

    public Double getNP_SEKA() {
        return NP_SEKA;
    }

    public void setNP_SEKA(Double NP_SEKA) {
        this.NP_SEKA = NP_SEKA;
    }

    public Double getV_04() {
        return V_04;
    }

    public void setV_04(Double v_04) {
        V_04 = v_04;
    }

    public Double getV_05() {
        return V_05;
    }

    public void setV_05(Double v_05) {
        V_05 = v_05;
    }

    public Double getV_06() {
        return V_06;
    }

    public void setV_06(Double v_06) {
        V_06 = v_06;
    }

    public Double getV_07() {
        return V_07;
    }

    public void setV_07(Double v_07) {
        V_07 = v_07;
    }

    public Double getV_08() {
        return V_08;
    }

    public void setV_08(Double v_08) {
        V_08 = v_08;
    }

    public Double getV_09() {
        return V_09;
    }

    public void setV_09(Double v_09) {
        V_09 = v_09;
    }

    public Double getV_10() {
        return V_10;
    }

    public void setV_10(Double v_10) {
        V_10 = v_10;
    }

    public Double getV_11() {
        return V_11;
    }

    public void setV_11(Double v_11) {
        V_11 = v_11;
    }

    public Double getV_12() {
        return V_12;
    }

    public void setV_12(Double v_12) {
        V_12 = v_12;
    }

    public Double getV_13() {
        return V_13;
    }

    public void setV_13(Double v_13) {
        V_13 = v_13;
    }

    public Double getV_14() {
        return V_14;
    }

    public void setV_14(Double v_14) {
        V_14 = v_14;
    }

    public Double getV_15() {
        return V_15;
    }

    public void setV_15(Double v_15) {
        V_15 = v_15;
    }

    public Double getV_16() {
        return V_16;
    }

    public void setV_16(Double v_16) {
        V_16 = v_16;
    }

    public Double getV_17() {
        return V_17;
    }

    public void setV_17(Double v_17) {
        V_17 = v_17;
    }

    public Double getVP_LALU() {
        return VP_LALU;
    }

    public void setVP_LALU(Double VP_LALU) {
        this.VP_LALU = VP_LALU;
    }

    public Double getVP_SEKA() {
        return VP_SEKA;
    }

    public void setVP_SEKA(Double VP_SEKA) {
        this.VP_SEKA = VP_SEKA;
    }

    public String getPERIOD() {
        return PERIOD;
    }

    public void setPERIOD(String PERIOD) {
        this.PERIOD = PERIOD;
    }

    public String getGAB() {
        return GAB;
    }

    public void setGAB(String GAB) {
        this.GAB = GAB;
    }
}
