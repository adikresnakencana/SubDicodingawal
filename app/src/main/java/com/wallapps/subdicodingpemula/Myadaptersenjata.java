package com.wallapps.subdicodingpemula;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Myadaptersenjata  extends RecyclerView.Adapter<MysenjataHolder> {

    Context a;
    ArrayList<Modelsenjata> models;

    public Myadaptersenjata(Context a, ArrayList<Modelsenjata> models) {
        this.a = a;
        this.models = models;
    }

    @NonNull
    @Override
    public MysenjataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //convert xml to view objek

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.kotak_cardlayout, null);
        return new MysenjataHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull final MysenjataHolder holder, int position) {
        //bind data to our views
        holder.mjudusenjatalTv.setText(models.get(position).getJudulsenjata());
        holder.mdessenjataTv.setText(models.get(position).getDessenjata());
        holder.msenjataimageIv.setImageResource(models.get(position).getGmbrsenjata());



        //animation
        Animation animation = AnimationUtils.loadAnimation(a, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        //mengabil data dengan aktiti yang sama
        holder.setItemkliklistener(new Itemkliklistener() {
            @Override
            public void onItemklik(View v, int pos) {
                //ambil data dari klik item
                String title = models.get(pos).getJudulsenjata();
                String descr = models.get(pos).getDessenjata();
                BitmapDrawable bitmapDrawgmbr = (BitmapDrawable)holder.msenjataimageIv.getDrawable();
                //ambil bitam data dari drawable
                Bitmap bitmap = bitmapDrawgmbr.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                //compress gambar
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream );
                //convert to byte array
                byte[] bytes = stream.toByteArray();

                //inten ,mengambil data ke intent,start actiuvity

                Intent intent = new Intent(a, DetailActivity.class);
                intent.putExtra("iJudul", title);
                intent.putExtra("iDescr", descr);
                intent.putExtra("iImage", bytes);
                a.startActivity(intent);

                
            }
        });

        //jika kamu ingin menggunakan aktifitas lainnya menggunakan on klik item
       /* holder.setItemkliklistener(new Itemkliklistener() {
            @Override
            public void onItemklik(View v, int pos) {
                if (models.get(pos).getJudulsenjata().equals("SCAR-L")){
                 //jika kklik berjudul SCAR-L
                };

                if (models.get(pos).getJudulsenjata().equals("AK46")){
                    //jika kklik berjudul AK46
                };
                if (models.get(pos).getJudulsenjata().equals("M416")){
                    //jika kklik berjudul M416
                };
                if (models.get(pos).getJudulsenjata().equals("UMP")){
                    //jika kklik berjudul UMP
                };
                if (models.get(pos).getJudulsenjata().equals("QBZ")){
                    //jika kklik berjudul QBZ
                };
                if (models.get(pos).getJudulsenjata().equals("G36C")){
                    //jika kklik berjudul SG36C
                };
                if (models.get(pos).getJudulsenjata().equals("KAR98")){
                    //jika kklik berjudul KAR98
                };
                if (models.get(pos).getJudulsenjata().equals("AWM")){
                    //jika kklik berjudul AWM
                };
                if (models.get(pos).getJudulsenjata().equals("M249")){
                    //jika kklik berjudul M249
                };
                if (models.get(pos).getJudulsenjata().equals("PAN")){
                    //jika kklik berjudul PAN
                };

                if (models.get(pos).getJudulsenjata().equals("PISTOL")){
                    //jika kklik berjudul PISTOL
                };

            }
        });
        //kamu akan menggunakan 2 metode perekaman kila di butuhkan*/
    }


    @Override
    public int getItemCount() {
        return models.size();
    }
}


