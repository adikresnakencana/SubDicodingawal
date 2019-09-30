package com.wallapps.subdicodingpemula;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView mJudulTv, mdesTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //actionbar
        ActionBar actionBar = getSupportActionBar();

        mJudulTv = findViewById(R.id.djudulsenjata);
        mdesTv = findViewById(R.id.ddes_senjata);
        mImageTv = findViewById(R.id.dlgmbr_senjata);

        //intent
        Intent intent =  getIntent();
        String mJudul = intent.getStringExtra("iJudul");
        String mDescr = intent.getStringExtra("iDescr");
        byte[] mBytes = getIntent().getByteArrayExtra("iImage");
        //bytes ke bitmap
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);


        //setting judul ke actionbar
        actionBar.setTitle(mJudul);

        //setting data untuk di lihat
        mJudulTv.setText(mJudul);
        mImageTv.setImageBitmap(bitmap);
        mdesTv.setText(mDescr);




    }
}
