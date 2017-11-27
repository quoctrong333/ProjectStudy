package com.quoctrongnguyen.giuaky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.quoctrongnguyen.giuaky.R;
import com.quoctrongnguyen.giuaky.model.LoaiSP;

import java.util.ArrayList;

/**
 * Created by quoct on 26/11/2017.
 */

public class adapterLoaiSP extends BaseAdapter {
    Context context;
    ArrayList<LoaiSP> loaiSanPhamArrayList;
    LayoutInflater inflater;

    //constructor
    public adapterLoaiSP(Context context, ArrayList<LoaiSP> loaiSanPhamArrayList) {
        this.context = context;
        this.loaiSanPhamArrayList = loaiSanPhamArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return loaiSanPhamArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return loaiSanPhamArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //inflater là ép layout lên view . như adapter ép dữ liệu list lên listview
        view = inflater.inflate(R.layout.item_sanpham, null);
        //anhxa
        TextView txtMaSo = view.findViewById(R.id.textviewmasolsp);
        TextView txtTen = view.findViewById(R.id.textviewtenlsp);
        //settext
        txtMaSo.setText(loaiSanPhamArrayList.get(i).getMaLoai());
        txtTen.setText(loaiSanPhamArrayList.get(i).getTenLoai());
        return view;
    }
}
