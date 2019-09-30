package com.wallapps.subdicodingpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    Myadaptersenjata myadaptersenjata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //recyckeview
        mRecyclerView = findViewById(R.id.recycle_senjata);
        //set its properties
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this)); //Linearlayout
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2)); //gridlayout, 2 kolom
        //adapter
        myadaptersenjata = new Myadaptersenjata(this,getPlayers());
        mRecyclerView.setAdapter(myadaptersenjata);
    }

    //add models to arraylist
    private ArrayList<Modelsenjata> getPlayers (){
        ArrayList<Modelsenjata> models = new ArrayList<>();

        Modelsenjata o = new Modelsenjata();
        o.setJudulsenjata("SCAR-L");
        o.setDessenjata("senjtata des akasdawdawdasdawdawwwwwwwwwwwwwwwwww" +
                "asdawdawdawd" +
                "asdawdawdawsd");
        o.setGmbrsenjata(R.drawable.senjata_one);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("AK46");
        o.setDessenjata("senjtata des ak46 asdawdawdawdawdawdasdawdwdadasdawdawdasdawdasdawdasdawdasdawd");
        o.setGmbrsenjata(R.drawable.senjata_two);
        models.add(o);


        o = new Modelsenjata();
        o.setJudulsenjata("M416");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_three);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("UMP");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_four);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("QBZ");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_five);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("G36C");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_six);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("KAR98");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_seven);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("AWM");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_eight);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("M249");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_nine);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("PAN");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjata_ten);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("PISTOL");
        o.setDessenjata("senjtata des M16 asdawdasdawdawsdawdawdasdawdawdasdawdawdawdawdasdawdawdasd");
        o.setGmbrsenjata(R.drawable.senjtata_11);
        models.add(o);


        return models;
    }
}
