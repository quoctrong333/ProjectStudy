package com.quoctrongnguyen.giuaky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.quoctrongnguyen.giuaky.R;
import com.quoctrongnguyen.giuaky.model.SanPham;
import com.quoctrongnguyen.giuaky.model.SanPham;

import java.util.ArrayList;

/**
 * Created by thaim on 20/11/2017.
 */

public class AdapterSP extends BaseAdapter
{
    Context context;
    ArrayList<SanPham> sanPhamArrayList;
    LayoutInflater inflater;

    //constructor
    public AdapterSP(Context context , ArrayList<SanPham> sanPhamArrayList)
    {
        this.context = context;
        this.sanPhamArrayList = sanPhamArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return sanPhamArrayList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return sanPhamArrayList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        //inflater là ép layout lên view . như adapter ép dữ liệu list lên listview
        view = inflater.inflate(R.layout.item_sanpham,null);
        //anhxa
        TextView txtMaSo = view.findViewById(R.id.txtMaSP);
        TextView txtTen = view.findViewById(R.id.txtTenSP);
        ImageView imgAnh = view.findViewById(R.id.imgSP);
        //settext
        txtMaSo.setText(sanPhamArrayList.get(i).getMaSP());
        txtTen.setText(sanPhamArrayList.get(i).getTenSP());
        imgAnh.setImageResource(sanPhamArrayList.get(i).getHinhSP());
        return view;
    }
}
