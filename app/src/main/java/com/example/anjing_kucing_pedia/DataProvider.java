package com.example.anjing_kucing_pedia;

import android.content.Context;

import com.example.anjing_kucing_pedia.model.Anjing;
import com.example.anjing_kucing_pedia.model.Hewan;
import com.example.anjing_kucing_pedia.model.Kucing;
import com.example.anjing_kucing_pedia.model.Sapi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Sapi> initDataSapi(Context ctx){
        List <Sapi> sapis =new ArrayList<>();
        sapis.add(new Sapi(" holstein","Jerman",
                " dikenal dengan ciri warna bulu belang hitam dan putih, mempunyai ukuran tubuh besar dan beratnya hampir sama dengan sapi FH.",R.drawable.sapi_holesien));
        sapis.add(new Sapi("Brahman","India",
                "Sapi brahman adalah keturunan sapi Zebu atau Boss Indiscuss. Aslinya berasal dari India kemudia masuk ke Amerika pada tahun 1849 berkembang pesat di Amerika, Di AS, sapi Brahman dikembangkan untuk diseleksi dan ditingkatkan mutu genetiknya. ", R.drawable.sapi_brahman));
        sapis.add(new Sapi("Madura","Madura",
                "Sapi madura adalah sapi potong hibrida lokal asli Indonesia hasil persilangan antara banteng dengan bos indicus yang secara genetik memiliki sifat toleran terhadap iklim panas dan lingkungan marginal serta tahan terhadap serangan penyakit.", R.drawable.sapi_madura));
        sapis.add(new Sapi("limuosin","Prancis",
                "Sapi limousin adalah sapi yang pertama kali dikembangkan di Prancis. Sapi limousin merupakan tipe sapi potong dengan perototan yang lebih baik dari Sapi Simmental. Sapi limousin memiliki bulu berwarna coklat tua kecuali di sekitar ambing berwarna putih serta lutut kebawah dan sekitar mata berwarna lebih muda.", R.drawable.sapi_limison));
        return sapis;
    }

    private static List<Kucing> initDataKucing2(Context context){
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static void intAllHewans(Context ctx){
        hewans.addAll(initDataKucing2(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataSapi(ctx));
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size()==0){
            intAllHewans(ctx);
        }
        for (Hewan h : hewans){
            if (h.getJenis().equals(jenis)){
                hewansByType.add(h);
            }
        }
    return hewansByType;
   }
}