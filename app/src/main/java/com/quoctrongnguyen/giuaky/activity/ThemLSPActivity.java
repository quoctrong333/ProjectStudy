package com.quoctrongnguyen.giuaky.activity;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

        import com.quoctrongnguyen.giuaky.R;
        import com.quoctrongnguyen.giuaky.adapter.adapterLoaiSP;
        import com.quoctrongnguyen.giuaky.model.LoaiSP;
        import com.quoctrongnguyen.giuaky.model.SanPham;

        import java.util.ArrayList;

public class ThemLSPActivity extends AppCompatActivity
{
        EditText edtMaLoai , edtTenLoai;
        Button btThem;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_them_loaisp);
                addEvents();
                addControls();
        }

        private void addControls() {
                edtMaLoai = findViewById(R.id.txtMaLoai);
                edtTenLoai = findViewById(R.id.txtTenLoai);
                btThem = findViewById(R.id.btnThemLoaiSP);
        }

        private void addEvents() {
                //them
                btThem.setOnClickListener(new View.OnClickListener()
                {
                        @Override
                        public void onClick(View view)
                        {
                                LoaiSP a= new LoaiSP();
                                a.setMaLoai(edtMaLoai.getText().toString());
                                a.setTenLoai(edtTenLoai.getText().toString());
                                a.setSanPhamArrayList(null);
                                Intent intent = new Intent();
                                intent.putExtra("lsp",a);//seriz
                                setResult(123,intent);
                                finish();
                        }
                });
        }


}
