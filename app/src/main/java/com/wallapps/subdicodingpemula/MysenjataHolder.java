package com.wallapps.subdicodingpemula;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MysenjataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    //view
    ImageView msenjataimageIv;
    TextView mjudusenjatalTv, mdessenjataTv;
    Itemkliklistener itemkliklistener;



    public MysenjataHolder(@NonNull View itemView) {
        super(itemView);
        this.msenjataimageIv = itemView.findViewById(R.id.modelgmbr_senjata);
        this.mjudusenjatalTv = itemView.findViewById(R.id.modeljudulsenjata);
        this.mdessenjataTv = itemView.findViewById(R.id.modeldes_senjata);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemkliklistener.onItemklik(v, getLayoutPosition());
    }
    public void  setItemkliklistener(Itemkliklistener ic){
        this.itemkliklistener = ic;
    }
}
