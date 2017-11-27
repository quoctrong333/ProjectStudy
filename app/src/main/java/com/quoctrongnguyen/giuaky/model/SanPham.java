package com.quoctrongnguyen.giuaky.model;

import java.io.Serializable;

/**
 * Created by quoct on 26/11/2017.
 */

public class SanPham implements Serializable {
    private String maSP;
    private String tenSP;
    private int hinhSP;

    public SanPham(String maSP, String tenSP, int hinhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hinhSP = hinhSP;
    }

    public SanPham() {

    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getHinhSP() {
        return hinhSP;
    }

    public void setHinhSP(int hinhSP) {
        this.hinhSP = hinhSP;
    }
}
