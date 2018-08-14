package com.kerjapraktek.paman.service;

import com.kerjapraktek.paman.entity.MST_NEG;

import java.util.List;

public interface MST_NEG_Service {
    public void addMST_NEG(MST_NEG mst_neg);
    public MST_NEG updateMST_NEG(MST_NEG mst_neg);
    public void deleteMST_NEGById(String NEG);
    public List<MST_NEG> getAllMST_NEG();
    public MST_NEG findMST_NEGById(String NEG);
}
