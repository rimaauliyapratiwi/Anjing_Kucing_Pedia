package com.example.anjing_kucing_pedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

import java.net.InterfaceAddress;

public class MainActivity extends AppCompatActivity {
    ImageButton btnAnjing,btnKucing,btnSapi;
    Button btnBiodata;

    public static final String JENIS_GALERI_KEY ="JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisaiView();
    }

    private void inisialisaiView() {
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnSapi = findViewById(R.id.btn_ras_sapi);
        btnBiodata = findViewById(R.id.btn_Biodata);
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnSapi.setOnClickListener(view -> bukaGaleri("Sapi"));
        btnBiodata.setOnClickListener(view -> bukaBiodataActivity());
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this,DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    private void bukaBiodataActivity(){
        Log.d("MAIN","Buka activity Biodata");
        Intent intent = new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}