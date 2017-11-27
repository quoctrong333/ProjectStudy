package com.quoctrongnguyen.giuaky.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.quoctrongnguyen.giuaky.R;

public class dangnhap extends AppCompatActivity {

    EditText txtUserName,txtPassWord;
    Button btnDangNhap,btnThoat;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        addEvents();
        addControls();

    }

    private void addEvents() {
        //thoat hoac dang nhap
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnDangNhap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if("admin".compareTo(txtUserName.getText().toString())==0 && "123".compareTo(txtPassWord.getText().toString())==0)
                {
                    Intent intent = new Intent();
                    setResult(111,intent);
                    startActivity(intent);
                    Toast.makeText(dangnhap.this,"ĐĂNG NHẬP THÀNH CÔNG",Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    Toast.makeText(dangnhap.this,"ĐĂNG NHẬP KHÔNG THÀNH CÔNG",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void addControls() {
        txtUserName = (EditText) findViewById(R.id.txtUserName);
        txtPassWord = (EditText) findViewById(R.id.txtPassWord);
        btnDangNhap = (Button)    findViewById(R.id.btnDangNhap);
        btnThoat    = (Button) findViewById(R.id.btnThoat);
    }
}
