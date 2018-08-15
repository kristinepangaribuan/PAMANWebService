package com.kerjapraktek.paman.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class M2012_2017 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String BTKI_2012;
    private String BTKI_2017;

    public M2012_2017() {
    }

    public M2012_2017(int id, String BTKI_2012, String BTKI_2017) {
        Id = id;
        this.BTKI_2012 = BTKI_2012;
        this.BTKI_2017 = BTKI_2017;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
