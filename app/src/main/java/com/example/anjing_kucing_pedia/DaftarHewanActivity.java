package com.example.anjing_kucing_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anjing_kucing_pedia.model.Anjing;
import com.example.anjing_kucing_pedia.model.Hewan;
import com.example.anjing_kucing_pedia.model.Kucing;
import com.example.anjing_kucing_pedia.model.Sapi;

import java.util.List;

public class DaftarHewanActivity extends AppCompatActivity {
    public final static String HEWAN_TERPILIH ="hewan_obj_key";
    List<Hewan> hewans;
    ListView ListView;
    String jenisHewan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hewan);
        Intent intent = getIntent();
        jenisHewan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        hewans = DataProvider.getHewansByTipe(this,jenisHewan);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        String judul="";
        if(hewans.get(0) instanceof Anjing) {
            judul = getString(R.string.judul_list_anjing);
        }else if (hewans.get(0) instanceof Sapi){
            judul = getString(R.string.judul_list_sapi);
        }else if (hewans.get(0) instanceof Kucing){
            judul = getString(R.string.judul_list_kucing);
        }
        txJudul.setText(judul);
        setuplistview();
    }

    private void setuplistview(){
        ListView =findViewById(R.id.ListView_daftar_hewan);
        DaftarHewanAdapter adapter = new DaftarHewanAdapter(this,hewans);
        ListView.setAdapter(adapter);
        ListView.setOnItemClickListener(onListClick);

    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
            Hewan terpilih = hewans.get(position);
            bukaProfilHewan(terpilih);
        }
    };
     private void bukaProfilHewan(Hewan hewanTerpilih){
         Log.d("MAIN","Buka acitivity galeri");
         Intent intent = new Intent(this,ProfilActivity.class);
         intent.putExtra(HEWAN_TERPILIH, hewanTerpilih);
         startActivity(intent);
     }

}
