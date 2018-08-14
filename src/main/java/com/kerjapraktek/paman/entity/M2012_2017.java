package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class M2012_2017 {
    @Id
    private String BTKI_2012;

    private String BTKI_2017;

    public M2012_2017() {
    }

    public M2012_2017(String BTKI_2012, String BTKI_2017) {
        this.BTKI_2012 = BTKI_2012;
        this.BTKI_2017 = BTKI_2017;
    }

    public String getBTKI_2012() {
        return BTKI_2012;
    }

    public void setBTKI_2012(String BTKI_2012) {
        this.BTKI_2012 = BTKI_2012;
    }

    public String getBTKI_2017() {
        return BTKI_2017;
    }

    public void setBTKI_2017(String BTKI_2017) {
        this.BTKI_2017 = BTKI_2017;
    }
}
