package ru.sgti.gamestore;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Gen_1Activity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    ArrayList<Integer> imgsPikts1 = new ArrayList<Integer>();
    ArrayList<Integer> imgsPikts2 = new ArrayList<Integer>();
    ArrayList<Integer> imgsPM = new ArrayList<Integer>();
    ArrayList<Integer> imgsMK1 = new ArrayList<Integer>();
    ArrayList<Integer> imgsMK2 = new ArrayList<Integer>();
    ArrayList<Integer> imgsRech = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ImageButton imBtn1 = findViewById(R.id.imBtn1);
        final ImageButton imBtn2 = findViewById(R.id.imBtn2);
        final ImageButton imBtn3 = findViewById(R.id.imBtn3);
        final ImageButton imBtn4 = findViewById(R.id.imBtn4);
        final ImageButton imBtn5 = findViewById(R.id.imBtn5);
        final ImageButton imBtn6 = findViewById(R.id.imBtn6);
        final ImageButton imBtn7 = findViewById(R.id.imBtn7);
        final ImageButton imBtn8 = findViewById(R.id.imBtn8);
        final ImageButton imBtn9 = findViewById(R.id.imBtn9);
        final ImageButton imBtn10 = findViewById(R.id.imBtn10);
        final ImageButton imBtn11 = findViewById(R.id.imBtn11);
        final ImageButton imBtn12 = findViewById(R.id.imBtn12);

        final ImageButton imBtnR1 = findViewById(R.id.imBtnR1);
        final ImageButton imBtnR2 = findViewById(R.id.imBtnR2);

        final ImageView imageView1 = findViewById(R.id.imageView1);
        final ImageView imageView2 = findViewById(R.id.imageView2);
        final ImageView imageView3 = findViewById(R.id.imageView3);
        final ImageView imageView4 = findViewById(R.id.imageView4);
        final ImageView imageView5 = findViewById(R.id.imageView5);
        final ImageView imageView6 = findViewById(R.id.imageView6);

        Button Btn2 = findViewById(R.id.Btn2);

        final TextView textView5 = findViewById(R.id.textView5);
        final TextView textView6 = findViewById(R.id.textView6);

        for(int i=1;i<=21;i++){
            imgsPikts1.add(getResources().getIdentifier("pikt_pikts1_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=39;i++){
            imgsPikts2.add(getResources().getIdentifier("pikt_pikts2_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=27;i++){
            imgsPM.add(getResources().getIdentifier("pm_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=12;i++){
            imgsMK1.add(getResources().getIdentifier("mk_fentezy_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=15;i++){
            imgsMK2.add(getResources().getIdentifier("mk_skazka_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=40;i++){
            imgsRech.add(getResources().getIdentifier("rech_"+i, "drawable", getPackageName()));
        }

        final int[] idView = {1};

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView1.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView2.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView3.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView4.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView5.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
                    imageView6.setTag(imgsPikts1.get(imgs1[1][1] - 1));
                    idView[0] = 1;
                }
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView1.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView2.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView3.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView4.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView5.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
                    imageView6.setTag(imgsPikts1.get(imgs1[1][2] - 1));
                    idView[0] = 1;
                }
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView1.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView2.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView3.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView4.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView5.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
                    imageView6.setTag(imgsPikts2.get(imgs1[2][1] - 1));
                    idView[0] = 1;
                }
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView1.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView2.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView3.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView4.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView5.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
                    imageView6.setTag(imgsPikts2.get(imgs1[2][2] - 1));
                    idView[0] = 1;
                }
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView1.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView2.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView3.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView4.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView5.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPM.get(imgs1[3][1] - 1));
                    imageView6.setTag(imgsPM.get(imgs1[3][1] - 1));
                    idView[0] = 1;
                }
                imBtn5.getLayoutParams().height = 0;
                imBtn5.requestLayout();
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView1.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView2.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView3.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView4.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView5.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsPM.get(imgs1[3][2] - 1));
                    imageView6.setTag(imgsPM.get(imgs1[3][2] - 1));
                    idView[0] = 1;
                }
                imBtn6.getLayoutParams().height = 0;
                imBtn6.requestLayout();
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView1.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView2.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView3.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView4.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView5.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
                    imageView6.setTag(imgsMK1.get(imgs2[1][1] - 1));
                    idView[0] = 1;
                }
                imBtn7.getLayoutParams().height = 0;
                imBtn7.requestLayout();
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView1.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView2.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView3.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView4.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView5.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
                    imageView6.setTag(imgsMK1.get(imgs2[1][2] - 1));
                    idView[0] = 1;
                }
                imBtn8.getLayoutParams().height = 0;
                imBtn8.requestLayout();
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView1.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView2.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView3.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView4.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView5.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
                    imageView6.setTag(imgsMK2.get(imgs2[2][1] - 1));
                    idView[0] = 1;
                }
                imBtn9.getLayoutParams().height = 0;
                imBtn9.requestLayout();
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView1.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView2.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView3.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView4.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView5.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
                    imageView6.setTag(imgsMK2.get(imgs2[2][2] - 1));
                    idView[0] = 1;
                }
                imBtn10.getLayoutParams().height = 0;
                imBtn10.requestLayout();
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView1.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView2.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView3.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView4.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView5.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsRech.get(imgs2[3][1] - 1));
                    imageView6.setTag(imgsRech.get(imgs2[3][1] - 1));
                    idView[0] = 1;
                }
                imBtn11.getLayoutParams().height = 0;
                imBtn11.requestLayout();
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idView[0] == 1) {
                    imageView1.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView1.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 2) {
                    imageView2.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView2.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 3) {
                    imageView3.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView3.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 4) {
                    imageView4.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView4.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] ++;
                }
                else if (idView[0] == 5) {
                    imageView5.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView5.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] ++;
                }
                else {
                    imageView6.setImageResource(imgsRech.get(imgs2[3][2] - 1));
                    imageView6.setTag(imgsRech.get(imgs2[3][2] - 1));
                    idView[0] = 1;
                }
                imBtn12.getLayoutParams().height = 0;
                imBtn12.requestLayout();
            }
        });

        imBtnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs1();
                if (!hide) {show_cards();}
                imBtn1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn1.requestLayout();
                imBtn2.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn2.requestLayout();
                imBtn3.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn3.requestLayout();
                imBtn4.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn4.requestLayout();
                imBtn5.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn5.requestLayout();
                imBtn6.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn6.requestLayout();
                _M.Toast(Gen_1Activity.this,"Верхний ряд обновлен");
            }
        });

        imBtnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs2();
                if (!hide) {show_cards();}
                imBtn7.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn7.requestLayout();
                imBtn8.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn8.requestLayout();
                imBtn9.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn9.requestLayout();
                imBtn10.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn10.requestLayout();
                imBtn11.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn11.requestLayout();
                imBtn12.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn12.requestLayout();
                _M.Toast(Gen_1Activity.this,"Нижний ряд обновлен");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gen_1Activity.this, Gen_1SaveActivity.class);
                intent.putExtra("img1", (Integer)imageView1.getTag());
                intent.putExtra("img2", (Integer)imageView2.getTag());
                intent.putExtra("img3", (Integer)imageView3.getTag());
                intent.putExtra("img4", (Integer)imageView4.getTag());
                intent.putExtra("img5", (Integer)imageView5.getTag());
                intent.putExtra("img6", (Integer)imageView6.getTag());
                startActivity(intent);
            }
        });

        Random rnd = new Random(System.currentTimeMillis());
        switch (rnd.nextInt(4 + 1)) {
            case 0: textView5.setText("Что делал?"); break;
            case 1: textView5.setText("Что сделал?"); break;
            case 2: textView5.setText("Что делает?"); break;
            case 3: textView5.setText("Что будет делать?"); break;
            case 4: textView5.setText("Что сделает?"); break;
        }
        switch (rnd.nextInt(2 + 1)) {
            case 0: textView6.setText("Где?"); break;
            case 1: textView6.setText("Куда?"); break;
        }

        rnd_imgs1();
        rnd_imgs2();
    }

    int [][] imgs1 = new int[4][3];
    int [][] imgs2 = new int[4][3];

    public void rnd_imgs1() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs1[1][1] = 1 + rnd.nextInt(11 - 1 + 1);
        imgs1[1][2] = 12 + rnd.nextInt(21 - 12 + 1);
        imgs1[2][1] = 1 + rnd.nextInt(20 - 1 + 1);
        imgs1[2][2] = 21 + rnd.nextInt(39 - 21 + 1);
        imgs1[3][1] = 1 + rnd.nextInt(16 - 1 + 1);
        imgs1[3][2] = 17 + rnd.nextInt(27 - 17 + 1);
    }

    public void rnd_imgs2() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs2[1][1] = 1 + rnd.nextInt(6 - 1 + 1);
        imgs2[1][2] = 7 + rnd.nextInt(12 - 7 + 1);
        imgs2[2][1] = 1 + rnd.nextInt(7 - 1 + 1);
        imgs2[2][2] = 8 + rnd.nextInt(15 - 8 + 1);
        imgs2[3][1] = 1 + rnd.nextInt(20 - 1 + 1);
        imgs2[3][2] = 21 + rnd.nextInt(40 - 21 + 1);
    }

    boolean hide = true;

    public void show_cards() {
        ImageButton imBtn1 = findViewById(R.id.imBtn1);
        ImageButton imBtn2 = findViewById(R.id.imBtn2);
        ImageButton imBtn3 = findViewById(R.id.imBtn3);
        ImageButton imBtn4 = findViewById(R.id.imBtn4);
        ImageButton imBtn5 = findViewById(R.id.imBtn5);
        ImageButton imBtn6 = findViewById(R.id.imBtn6);
        ImageButton imBtn7 = findViewById(R.id.imBtn7);
        ImageButton imBtn8 = findViewById(R.id.imBtn8);
        ImageButton imBtn9 = findViewById(R.id.imBtn9);
        ImageButton imBtn10 = findViewById(R.id.imBtn10);
        ImageButton imBtn11 = findViewById(R.id.imBtn11);
        ImageButton imBtn12 = findViewById(R.id.imBtn12);

        imBtn1.setImageResource(imgsPikts1.get(imgs1[1][1] - 1));
        imBtn2.setImageResource(imgsPikts1.get(imgs1[1][2] - 1));
        imBtn3.setImageResource(imgsPikts2.get(imgs1[2][1] - 1));
        imBtn4.setImageResource(imgsPikts2.get(imgs1[2][2] - 1));
        imBtn5.setImageResource(imgsPM.get(imgs1[3][1] - 1));
        imBtn6.setImageResource(imgsPM.get(imgs1[3][2] - 1));
        imBtn7.setImageResource(imgsMK1.get(imgs2[1][1] - 1));
        imBtn8.setImageResource(imgsMK1.get(imgs2[1][2] - 1));
        imBtn9.setImageResource(imgsMK2.get(imgs2[2][1] - 1));
        imBtn10.setImageResource(imgsMK2.get(imgs2[2][2] - 1));
        imBtn11.setImageResource(imgsRech.get(imgs2[3][1] - 1));
        imBtn12.setImageResource(imgsRech.get(imgs2[3][2] - 1));

        hide = false;
    }

    public void hide_cards() {
        ImageButton imBtn1 = findViewById(R.id.imBtn1);
        ImageButton imBtn2 = findViewById(R.id.imBtn2);
        ImageButton imBtn3 = findViewById(R.id.imBtn3);
        ImageButton imBtn4 = findViewById(R.id.imBtn4);
        ImageButton imBtn5 = findViewById(R.id.imBtn5);
        ImageButton imBtn6 = findViewById(R.id.imBtn6);
        ImageButton imBtn7 = findViewById(R.id.imBtn7);
        ImageButton imBtn8 = findViewById(R.id.imBtn8);
        ImageButton imBtn9 = findViewById(R.id.imBtn9);
        ImageButton imBtn10 = findViewById(R.id.imBtn10);
        ImageButton imBtn11 = findViewById(R.id.imBtn11);
        ImageButton imBtn12 = findViewById(R.id.imBtn12);

        imBtn1.setImageResource(R.drawable.rubb);
        imBtn2.setImageResource(R.drawable.rubb);
        imBtn3.setImageResource(R.drawable.rubb);
        imBtn4.setImageResource(R.drawable.rubb);
        imBtn5.setImageResource(R.drawable.rubb);
        imBtn6.setImageResource(R.drawable.rubb);
        imBtn7.setImageResource(R.drawable.rub);
        imBtn8.setImageResource(R.drawable.rub);
        imBtn9.setImageResource(R.drawable.rub);
        imBtn10.setImageResource(R.drawable.rub);
        imBtn11.setImageResource(R.drawable.rub);
        imBtn12.setImageResource(R.drawable.rub);

        hide = true;
    }

    private Menu menu=null;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_game_menu, menu);
        this.menu=menu;
        MenuItem item = menu.findItem(R.id.action_hide);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                _finish();
                return true;

            case R.id.action_new:
                Intent tt = new Intent(Gen_1Activity.this, Gen_1Activity.class);
                startActivity(tt);
                finish();
                return true;

            case R.id.action_show:
                show_cards();
                _M.Toast(this,"Картинки открыты");
                item.setVisible(false);
                menu.findItem(R.id.action_hide).setVisible(true);
                return true;

            case R.id.action_hide:
                hide_cards();
                _M.Toast(this,"Картинки скрыты");
                item.setVisible(false);
                menu.findItem(R.id.action_show).setVisible(true);
                return true;

            case R.id.action_view:
                Intent intent = new Intent(Gen_1Activity.this, ViewResultsActivity.class);
                intent.putExtra("game", "gen");
                startActivity(intent);
                return true;

            case R.id.action_about:
                Intent about = new Intent(Gen_1Activity.this, AboutGameActivity.class);
                about.putExtra("game", "gen");
                startActivity(about);
                return true;

            case R.id.action_exit:
                _finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void _finish() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Вы действительно хотите выйти из игры?");
        builder.setPositiveButton("Нет", null);
        builder.setNegativeButton("Да", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
