package com.quoctrongnguyen.giuaky.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.quoctrongnguyen.giuaky.R;
import com.quoctrongnguyen.giuaky.model.SanPham;
import com.quoctrongnguyen.giuaky.adapter.AdapterSP;
import com.quoctrongnguyen.giuaky.model.SanPham;
import java.util.ArrayList;
import  java.util.List;

public class SanPhamActivity extends AppCompatActivity {
    ArrayList<SanPham> sanPhamArrayList;
    AdapterSP adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);

        sanPhamArrayList = new ArrayList<>();
        ListView lstSanPham = findViewById(R.id.lvSP);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        sanPhamArrayList = (ArrayList<SanPham>) bundle.getSerializable("listsp");

        adapter = new AdapterSP(getApplicationContext(),sanPhamArrayList);
        lstSanPham.setAdapter(adapter);// quen , chim ko co data
    }
}
