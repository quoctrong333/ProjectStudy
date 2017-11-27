package com.quoctrongnguyen.giuaky.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by quoct on 26/11/2017.
 */

public class LoaiSP implements Serializable {
    private String maLoai;
    private  String tenLoai;
    private ArrayList<SanPham> sanPhamArrayList;


    public LoaiSP() {
    }


    public LoaiSP(String maLoai, String tenLoai, ArrayList<SanPham> sanPhamArrayList) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.sanPhamArrayList = sanPhamArrayList;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public ArrayList<SanPham> getSanPhamArrayList() {
        return sanPhamArrayList;
    }

    public void setSanPhamArrayList(ArrayList<SanPham> sanPhamArrayList) {
        this.sanPhamArrayList = sanPhamArrayList;
    }
}
