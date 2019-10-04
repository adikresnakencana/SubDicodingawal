package com.wallapps.subdicodingpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
        ///menu bar action code
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        {

        if (id == R.id.tombol_about) {
            Intent myaboutintent = new Intent(MainActivity.this,
                    about_profil.class);

            startActivity(myaboutintent);
            return  true;
        }

                return super.onOptionsItemSelected(item);
        }
    }

    //about
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }

    //add models to arraylist
    private ArrayList<Modelsenjata> getPlayers (){
        ArrayList<Modelsenjata> models = new ArrayList<>();

        Modelsenjata o = new Modelsenjata();
        o.setJudulsenjata("SCAR-L");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "SCAR-L adalah jenis ringan dari FN SCAR (Special Operations Forces Combat Assault Rifle)," +
                "sebuah senapan gas-pendek yang dioperasikan dengan gas senapan otomatis yang dibekali ke berbagai kartrid.\n" +
                "Scar sendiri awalnya dikembangkan oleh FN Herstal untuk Komando Operasi Khusus Amerika Serikat (SOCOM) sebagai entri ke Kompetisi SCAR," +
                "kompetisi untuk menemukan senapan servis baru untuk SOCOM.\n" +
                "Pada 2015, keluarga senapan SCAR beroperasi di lebih dari 20 negara. \n" +
                "DAMAGE             = 41 \n" +
                "ZERO RANGE        = 100 - 600 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 5.56 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_one);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("AKM");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "AKM didesain oleh seorang insinyur sekaligus investor yang bernama Mikhail Kalashnikov yang memiliki jasa besar di bidang pengembangan seri AK-47.\n" +
                "AKM pertama kali bertugas dalam Perang Dunia ke-2 bersama pasukan tentara Soviet pada tahun 1959.\n" +
                "Dikarenakan desain AKM yang solid dan tidak membutuhkan banyak aksesoris membuatnya tahan terhadap kondisi ekstrim, seperti terendam air maupun setelah dipendam di dalam tanah dalam waktu yang cukup lama. \n" +
                "Dengan barel yang berisikan 7.62mm kaliber membuat damage AKM cukup besar dan sangat cocok untuk digunakan saat pertempuran jarak dekat.\n" +
                "DAMAGE              = 48 \n" +
                "ZERO RANGE          = 100 - 400 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 7.62 \n" +
                "ATTACHMENTS         = 3");
        o.setGmbrsenjata(R.drawable.senjata_two);
        models.add(o);


        o = new Modelsenjata();
        o.setJudulsenjata("M416");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "M416 atau yang memiliki nama lain HK416 merupakan jenis senapan Assault Rifle yang dirancang dan diproduksi oleh sebuah perusahaan asal Jerman pada tahun 2004 hingga sekarang. \n" +
                "Sebuah model senapan taktis berdasarkan proyek XM8 yang dihentikan sebagai perbaikan dari kedua M16 / AR-15 dan M4 Carbine, M416 juga merupakan senjata tempur standar dari Angkatan Bersenjata Norwegia, dan juga menjadi senjata yang digunakan oleh SEAL Team Six untuk membunuh Osama Bin Laden pada tahun 2011 lalu.\n" +
                "DAMAGE              = 41 \n" +
                "ZERO RANGE          = 100 - 600 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 5.56 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_three);
        models.add(o);


        o = new Modelsenjata();
        o.setJudulsenjata("AUG");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "teyr AUG adalah rangkaian senapan yang pertama kali diperkenalkan pada tahun 1977 oleh perusahaan senjata Austria Steyr Mannlicher.\n" +
                "AUG adalah singkatan dari Armee Universal Gewehr, yang berarti \"Senapan Tentara Universal\"\n. " +
                "Nama Steyr AUG sendiri lebih sering digunakan untuk menyebut versi yang spesifik, yaitu varian senapan serbu bullpup kaliber 5.56 mm NATO, dengan warna hijau dan teleskop yang terintegrasi.\n" +
                "Senapan ini sebenarnya telah memiliki banyak varian, mulai dari senapan submesin, senapan penembak jitu, sampai senapan mesin ringan.\n" +
                "DAMAGE              = 44 \n" +
                "ZERO RANGE          = - \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 5.56 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_five);
        models.add(o);


//        o = new Modelsenjata();
//        o.setJudulsenjata("QBZ");
//        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
//                "QBZ (Q?ngwuqi Bùqi?ng–Zìdòng), secara harfiah berarti “Senapan serbu otomatis ringan” diproduksi di China pada tahun 1995 oleh perusahaan bernama Arsenal 266, yang mana merupakan bagian dari Norinco dan Arsenal 296. Senapan ini menggunakan peluru buatan Cina yaitu 5,8 x 42 mm DBP87. \n" +
//                "QBZ-95 terdiri dari beberapa jenis varian, yaitu varian karabin, standar, dan varian Senjata otomatis regu (Squad automatic weapon).\n" +
//                "DAMAGE              = 43 \n" +
//                "ZERO RANGE          = 100 - 600 \n" +
//                "MAGAZINE SIZE       = 30 \n" +
//                "MODE TEMBAK         = SINGLE, AUTO \n" +
//                "TIPE PELURU         = 5.56 \n" +
//                "ATTACHMENTS         = 4");
//        o.setGmbrsenjata(R.drawable.qbz);
//        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("G36C");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "Heckler & Koch G36 adalah senapan serbu yang dirancang pada tahun 1990-an oleh perusahaan senjata Jerman Heckler & Koch.\n " +
                "Senapan ini sesuai namanya yaitu G36 Bundeswehr awalnya hanya diperuntukkan bagi Bundeswehr (Angkatan Bersenjata Jerman) dan kemudian akhirnya bisa dibeli dan digunakan oleh negara-negara lain. Heckler & Koch G36 merupakan senapan utama Angkatan Bersenjata Jerman, dan varian-variannya juga digunakan oleh satuan kepolisian dan militer lainnya.\n" +
                "DAMAGE              = 43 \n" +
                "ZERO RANGE          = 100 - 600 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 7.62 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_six);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("KAR98");
        o.setDessenjata("TYPE Senjata Sniper Rifle\n\n" +
                "karabiner 98 kurz adalah jenis senapan sniper bolt-action rifle asal Jerman yang diproduksi pada 21 Juni 1935. \n" +
                "Dalam sejarah penggunaannya, kar98k juga pernah menjadi senjata servis utama bagi Jerman hingga akhir perang pada 1945 dan sempat digunakan oleh nenek moyang kita untuk mengusir penjajah para penjajah\n" +
                "DAMAGE              = 72 \n" +
                "ZERO RANGE          = 100 - 600 \n" +
                "MAGAZINE SIZE       = 5 \n" +
                "MODE TEMBAK         = SINGLE\n" +
                "TIPE PELURU         = 7.62 \n" +
                "ATTACHMENTS         = 3");
        o.setGmbrsenjata(R.drawable.senjata_seven);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("AWM");
        o.setDessenjata("TYPE Senjata Sniper Rifle\n\n" +
                "Senapan runduk AWM (Arctic Warfare Magnum) diproduksi oleh Accuracy International sebuah perusahan senjata Inggris tepatnya di Portsmouth, Hampshire, England.\n " +
                "Senapan ini juga dikenal dengan nama AWSM (Arctic Warfare Super Magnum) menggunakan peluru .\n" +
                ".338 Lapua Magnum dan .300 Winchester Magnum\n" +
                "DAMAGE              = 132 \n" +
                "ZERO RANGE          = 100 - 1000 \n" +
                "MAGAZINE SIZE       = 5 \n" +
                "MODE TEMBAK         = SINGLE\n" +
                "TIPE PELURU         = .300 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_eight);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("VSS");
        o.setDessenjata("TYPE Senjata Sniper Rifle\n\n" +
                "VSS Vintorez (bahasa Rusia: Винтовка Снайперская Специальная, Vintovka Snayperskaya Spetsialnaya, bahasa Inggris: Special Sniper Rifle, biasa disingkat Vintorez) adalah senapan runduk (sniper rifle) berperedam suara yang dikembangkan pada akhir tahun 1980-an oleh TsNIITochMash dan diproduksi oleh Tula Arms Plant.\n" +
                "Senapan ini secara khusus diperuntukan untuk operasi rahasia Spetsnaz, kemampuan lain senapan ini adalah dapat dibongkar pasang dan dimasukan ke dalam tas khusus untuk memudahkan mobilitasnya.\n" +
                "DAMAGE              = 38 \n" +
                "ZERO RANGE          = 100 - 100 \n" +
                "MAGAZINE SIZE       = 5 \n" +
                "MODE TEMBAK         = SINGLE, AUTO\n" +
                "TIPE PELURU         = 9mm \n" +
                "ATTACHMENTS         = 1");
        o.setGmbrsenjata(R.drawable.vss);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("Mk47");
        o.setDessenjata("TYPE Senjata Sniper Rifle\n\n" +
                "CMMG MK47 Mutant adalah senapan jenis semi otomatis yang didesain menggunakan 7.62mm kaliber.\n" +
                "Dibuat oleh perusahaan asal Amerika Serikat bernama CMMG Inc pada tahun 2014. Untuk serinya sendiri, produk Mk memiliki berbagai varian yaitu: Mk47 K Pistol, Mk47 K Short Barrel Rifle, Mk47 Mutant AKM, Mk47 Mutant AKM CA, Mk47 Mutant AKM 2 CA, Mk47 Mutant T CA, Mk47 AKS8, Mk47 AKS13.\n" +
                "DAMAGE              = 49 \n" +
                "ZERO RANGE          = 100 - 500 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO\n" +
                "TIPE PELURU         = 7.62 \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.mutant);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("M249");
        o.setDessenjata("TYPE Light Machine Gun\n\n" +
                "Senapan mesin ringan M249 (Inggris: M249 light machine gun (LMG), sebelumnya bernama M249 Squad Automatic Weapon (SAW) (Senjata Otomatis Regu), secara resmi bernama Light Machine Gun, 5.56 mm, M249 adalah senapan mesin operasi gas berpendingin udara menggunakan amunisi kaliber 5,56 mm varian FN Minimi buatan FN Herstal asal Belgia versi Amerika yang digunakan oleh Angkatan Bersenjata Amerika Serikat.\n"+
                "DAMAGE              = 44 \n" +
                "ZERO RANGE          = 100 - 500 \n" +
                "MAGAZINE SIZE       = 100 \n" +
                "MODE TEMBAK         = AUTO \n" +
                "TIPE PELURU         = 5.56 \n" +
                "ATTACHMENTS         = 1");
        o.setGmbrsenjata(R.drawable.senjata_nine);
        models.add(o);



        o = new Modelsenjata();
        o.setJudulsenjata("GROZA");
        o.setDessenjata("TYPE Senjata Assault Rifle\n\n" +
                "OTs-14 Groza atau yang biasa disebut Groza merupakan senapan otomatis.\n" +
                "Groza pertama kali dibuat di Russia pada tahun 1990’an menggunakan peluru kaliber 7.62×39mm dan disebut juga “Thunderstorm” atau “Terror”.\n" +
                "DAMAGE              = 48 \n" +
                "ZERO RANGE          = 100 - 400 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, AUTO \n" +
                "TIPE PELURU         = 7.62 \n" +
                "ATTACHMENTS         = 3");
        o.setGmbrsenjata(R.drawable.senjata_12);
        models.add(o);

        o = new Modelsenjata();
        o.setJudulsenjata("UMP");
        o.setDessenjata("TYPE Senjata Submachine Gun\n\n" +
                "Pistol mitraliur UMP dalam bahasa Jerman berarti Universale Maschinenpistole, atau \"Universal Machine Pistol\" dalam bahasa Inggris atau dapat diartikan \"Pistol Mesin Universal\" dalam bahasa Indonesia, adalah pistol mitraliur yang dikembangkan dan dibuat oleh Heckler & Koch.\n" +
                " Heckler & Koch mengembangkan UMP sebagai penerus dari pistol mitraliur MP5, baik UMP maupun MP5 masih diproduksi sampai sekarang\n" +
                "DAMAGE              = 35 \n" +
                "ZERO RANGE          = 100 - 300 \n" +
                "MAGAZINE SIZE       = 30 \n" +
                "MODE TEMBAK         = SINGLE, BURST, AUTO \n" +
                "TIPE PELURU         = 9mm \n" +
                "ATTACHMENTS         = 4");
        o.setGmbrsenjata(R.drawable.senjata_four);
        models.add(o);


        return models;
    }
}
