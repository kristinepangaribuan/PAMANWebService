package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BTKI2017 {

    @Id
    private String BTKI_2017;

    private String DESKR_HS;
    private String BEC;
    private String SITCREV4;
    private String ISICREV4;
    private String OILGRPCODE;
    private String OILGRDESC;
    private String SECCODE;
    private String SECDESC;
    private String SECTORCODE;
    private String SECTORDESC;
    private String BRSCODE;
    private String BRSDESC;
    private String COMMGRPCOD;
    private String COMGRPDESC;
    private String COMMCODE;
    private String COMMDESC;
    private String KBLI2015;
    private String DESKKBLI20;

    public BTKI2017() {
    }

    public BTKI2017(String BTKI_2017, String DESKR_HS, String BEC, String SITCREV4, String ISICREV4, String OILGRPCODE, String OILGRDESC, String SECCODE, String SECDESC, String SECTORCODE, String SECTORDESC, String BRSCODE, String BRSDESC, String COMMGRPCOD, String COMGRPDESC, String COMMCODE, String COMMDESC, String KBLI2015, String DESKKBLI20) {
        this.BTKI_2017 = BTKI_2017;
        this.DESKR_HS = DESKR_HS;
        this.BEC = BEC;
        this.SITCREV4 = SITCREV4;
        this.ISICREV4 = ISICREV4;
        this.OILGRPCODE = OILGRPCODE;
        this.OILGRDESC = OILGRDESC;
        this.SECCODE = SECCODE;
        this.SECDESC = SECDESC;
        this.SECTORCODE = SECTORCODE;
        this.SECTORDESC = SECTORDESC;
        this.BRSCODE = BRSCODE;
        this.BRSDESC = BRSDESC;
        this.COMMGRPCOD = COMMGRPCOD;
        this.COMGRPDESC = COMGRPDESC;
        this.COMMCODE = COMMCODE;
        this.COMMDESC = COMMDESC;
        this.KBLI2015 = KBLI2015;
        this.DESKKBLI20 = DESKKBLI20;
    }

    public String getBTKI_2017() {
        return BTKI_2017;
    }

    public void setBTKI_2017(String BTKI_2017) {
        this.BTKI_2017 = BTKI_2017;
    }

    public String getDESKR_HS() {
        return DESKR_HS;
    }

    public void setDESKR_HS(String DESKR_HS) {
        this.DESKR_HS = DESKR_HS;
    }

    public String getBEC() {
        return BEC;
    }

    public void setBEC(String BEC) {
        this.BEC = BEC;
    }

    public String getSITCREV4() {
        return SITCREV4;
    }

    public void setSITCREV4(String SITCREV4) {
        this.SITCREV4 = SITCREV4;
    }

    public String getISICREV4() {
        return ISICREV4;
    }

    public void setISICREV4(String ISICREV4) {
        this.ISICREV4 = ISICREV4;
    }

    public String getOILGRPCODE() {
        return OILGRPCODE;
    }

    public void setOILGRPCODE(String OILGRPCODE) {
        this.OILGRPCODE = OILGRPCODE;
    }

    public String getOILGRDESC() {
        return OILGRDESC;
    }

    public void setOILGRDESC(String OILGRDESC) {
        this.OILGRDESC = OILGRDESC;
    }

    public String getSECCODE() {
        return SECCODE;
    }

    public void setSECCODE(String SECCODE) {
        this.SECCODE = SECCODE;
    }

    public String getSECDESC() {
        return SECDESC;
    }

    public void setSECDESC(String SECDESC) {
        this.SECDESC = SECDESC;
    }

    public String getSECTORCODE() {
        return SECTORCODE;
    }

    public void setSECTORCODE(String SECTORCODE) {
        this.SECTORCODE = SECTORCODE;
    }

    public String getSECTORDESC() {
        return SECTORDESC;
    }

    public void setSECTORDESC(String SECTORDESC) {
        this.SECTORDESC = SECTORDESC;
    }

    public String getBRSCODE() {
        return BRSCODE;
    }

    public void setBRSCODE(String BRSCODE) {
        this.BRSCODE = BRSCODE;
    }

    public String getBRSDESC() {
        return BRSDESC;
    }

    public void setBRSDESC(String BRSDESC) {
        this.BRSDESC = BRSDESC;
    }

    public String getCOMMGRPCOD() {
        return COMMGRPCOD;
    }

    public void setCOMMGRPCOD(String COMMGRPCOD) {
        this.COMMGRPCOD = COMMGRPCOD;
    }

    public String getCOMGRPDESC() {
        return COMGRPDESC;
    }

    public void setCOMGRPDESC(String COMGRPDESC) {
        this.COMGRPDESC = COMGRPDESC;
    }

    public String getCOMMCODE() {
        return COMMCODE;
    }

    public void setCOMMCODE(String COMMCODE) {
        this.COMMCODE = COMMCODE;
    }

    public String getCOMMDESC() {
        return COMMDESC;
    }

    public void setCOMMDESC(String COMMDESC) {
        this.COMMDESC = COMMDESC;
    }

    public String getKBLI2015() {
        return KBLI2015;
    }

    public void setKBLI2015(String KBLI2015) {
        this.KBLI2015 = KBLI2015;
    }

    public String getDESKKBLI20() {
        return DESKKBLI20;
    }

    public void setDESKKBLI20(String DESKKBLI20) {
        this.DESKKBLI20 = DESKKBLI20;
    }
}