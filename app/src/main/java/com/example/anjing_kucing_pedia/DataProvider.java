package com.example.anjing_kucing_pedia;

import android.content.Context;

import com.example.anjing_kucing_pedia.model.Anjing;
import com.example.anjing_kucing_pedia.model.Hewan;
import com.example.anjing_kucing_pedia.model.Kucing;
import com.example.anjing_kucing_pedia.model.Sapi;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.buldog_nama), ctx.getString(R.string.buldog_asal),
                ctx.getString(R.string.buldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Sapi> initDataSapi(Context ctx){
        List <Sapi> sapis =new ArrayList<>();
        sapis.add(new Sapi(ctx.getString(R.string.holstein_nama), ctx.getString(R.string.holstein_asal),
                ctx.getString(R.string.holstein_deskripsi), R.drawable.sapi_holesien));
        sapis.add(new Sapi(ctx.getString(R.string.brahman_nama), ctx.getString(R.string.brahman_asal),
                ctx.getString(R.string.brahman_deskripsi), R.drawable.sapi_brahman));
        sapis.add(new Sapi(ctx.getString(R.string.madura_nama), ctx.getString(R.string.madura_asal),
                ctx.getString(R.string.madura_deskripsi), R.drawable.sapi_madura));
        sapis.add(new Sapi(ctx.getString(R.string.limuosin_nama), ctx.getString(R.string.limuosin_asal),
                ctx.getString(R.string.limuosin_deskripsi), R.drawable.sapi_limison));
        return sapis;
    }

    private static List<Kucing> initDataKucing2(Context context){
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(context.getString(R.string.angora_nama), context.getString(R.string.angora_asal),
                context.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(context.getString(R.string.bengal_nama), context.getString(R.string.bengal_asal),
                context.getString(R.string.bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(context.getString(R.string.birmani_nama), context.getString(R.string.birmani_asal),
                context.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(context.getString(R.string.persia_nama), context.getString(R.string.persia_asal),
                context.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(context.getString(R.string.siam_nama), context.getString(R.string.siam_asal),
                context.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(context.getString(R.string.siberia_nama), context.getString(R.string.siberia_asal),
                context.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
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