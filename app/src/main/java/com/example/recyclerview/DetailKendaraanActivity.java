package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKendaraanActivity extends AppCompatActivity {

    ImageView imgKendaraan;
    TextView txtName, txtJenis, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kendaraan);

        imgKendaraan = findViewById(R.id.img_kendaraan1);
        txtName = findViewById(R.id.txt_name1);
        txtJenis = findViewById(R.id.txt_jenis1);
        txtDesc = findViewById(R.id.txt_desc1);

        Intent intent = getIntent();
        String name = intent.getStringExtra(KendaraanAdapter.NAMA_EXTRA);
        String jenis = intent.getStringExtra(KendaraanAdapter.JENIS_EXTRA);
        String desc = intent.getStringExtra(KendaraanAdapter.DESC_EXTRA);
        String img = intent.getStringExtra(KendaraanAdapter.IMG_EXTRA);

        imgKendaraan.setImageResource(Integer.parseInt(img));
        txtName.setText(name);
        txtJenis.setText(jenis);
        txtDesc.setText(desc);
    }
}