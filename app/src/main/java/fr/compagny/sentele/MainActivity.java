package fr.compagny.sentele;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    //VideoView video;
    ImageView rts, tv2, tfm, sentv, walf, fr24, makkah, medina, africable, africa, ortm;
    ImageView alquran, theatre, aljajeera, arte;
    TextView text_rts, text_tv2, text_tfm, text_sentv, text_walf, text_fr24, text_makkah;
    TextView text_medina, text_africa, text_africable, text_ortm, text_alquran, text_theatre, text_aljajeera, text_arte;
    ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Thread t= new Thread() {
        //  public void run() {
        rts = (ImageView) findViewById(R.id.circle_rts);
        text_rts = (TextView) findViewById(R.id.text_rts);
        tv2 = (ImageView) findViewById(R.id.circle_tv2);
        text_tv2 = (TextView) findViewById(R.id.text_2s);
        tfm = (ImageView) findViewById(R.id.circle_tfm);
        text_tfm = (TextView) findViewById(R.id.text_tfm);
        sentv = (ImageView) findViewById(R.id.circle_sentv);
        text_sentv = (TextView) findViewById(R.id.text_sentv);
        walf = (ImageView) findViewById(R.id.circle_walf);
        text_walf = (TextView) findViewById(R.id.text_walf);
        fr24 = (ImageView) findViewById(R.id.circle_fr24);
        text_fr24 = (TextView) findViewById(R.id.text_fr24);
        africa = (ImageView) findViewById(R.id.circle_africa);
        text_africa = (TextView) findViewById(R.id.text_africa);
        africable = (ImageView) findViewById(R.id.circle_africable);
        text_africable = (TextView) findViewById(R.id.text_africable);
        ortm = (ImageView) findViewById(R.id.circle_ortm);
        text_ortm = (TextView) findViewById(R.id.text_ortm);
        makkah = (ImageView) findViewById(R.id.circle_makkah);
        text_makkah = (TextView) findViewById(R.id.text_makkah);
        medina = (ImageView) findViewById(R.id.circle_medina);
        text_medina = (TextView) findViewById(R.id.text_medina);
        alquran = (ImageView) findViewById(R.id.circle_quran);
        text_alquran = (TextView) findViewById(R.id.text_quran);
        theatre = (ImageView) findViewById(R.id.circle_theatre);
        text_theatre = (TextView) findViewById(R.id.text_theatre);
        aljajeera = (ImageView) findViewById(R.id.circle_aljajeera);
        text_aljajeera = (TextView) findViewById(R.id.text_aljajeera);
        arte = (ImageView) findViewById(R.id.circle_arte);
        text_arte = (TextView) findViewById(R.id.text_arte);


    }

    public void choixTv(View v) {
        Intent iii = new Intent(this, Live.class);
        Toast t = Toast.makeText(this, "Sen Télé : Démarrage en cours..." , Toast.LENGTH_LONG);
        t.show();
        startActivity(iii);
    }
}
