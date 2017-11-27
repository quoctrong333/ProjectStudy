package com.quoctrongnguyen.giuaky.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.quoctrongnguyen.giuaky.R;
import com.quoctrongnguyen.giuaky.adapter.adapterLoaiSP;
import com.quoctrongnguyen.giuaky.model.LoaiSP;
import com.quoctrongnguyen.giuaky.model.SanPham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvLoaiSP;
    adapterLoaiSP adapter;
    ArrayList<LoaiSP> loaiSanPhamArrayList;
    ArrayList<SanPham> sanPhamArrayList;
    Button btnThem,btnDangNhap,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        Data();


    }

    private void Data() {

    }

    private void addEvents() {
        //dangnhap
            btnDangNhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivityForResult(new Intent(MainActivity.this,dangnhap.class),111);
                }
            });

        //them
        btnThem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //có nhan du lieu tra ve -> startactivityforresult .
                startActivityForResult(new Intent(MainActivity.this,ThemLSPActivity.class),123);
            }
        });

    }

    private void addControls() {
        loaiSanPhamArrayList = new ArrayList<>();
        sanPhamArrayList = new ArrayList<>();
        //add data
        sanPhamArrayList.add(new SanPham("nc01","Hồng sâm đóng chai",R.drawable.avatar_sv));
        sanPhamArrayList.add(new SanPham("nc02","Bò Cụng",R.drawable.avatar_sv));
        loaiSanPhamArrayList.add(new LoaiSP("nc","Nước giải khát",sanPhamArrayList));
        loaiSanPhamArrayList.add(new LoaiSP("ra","Rau ",null));
        //adapter
        adapter = new adapterLoaiSP(getApplicationContext(),loaiSanPhamArrayList);
        //set adapter
        lvLoaiSP.setAdapter(adapter);

    }
}
