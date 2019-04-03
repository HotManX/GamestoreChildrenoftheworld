package ru.sgti.gamestore;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class TT_1Activity extends AppCompatActivity {

    ArrayList<Integer> imgsHeads = new ArrayList<Integer>();
    ArrayList<Integer> imgsBacks = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tt_1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ImageButton imBtn1 = (ImageButton) findViewById(R.id.imBtn1);
        final ImageButton imBtn2 = (ImageButton) findViewById(R.id.imBtn2);
        final ImageButton imBtn3 = (ImageButton) findViewById(R.id.imBtn3);
        final ImageButton imBtn4 = (ImageButton) findViewById(R.id.imBtn4);
        final ImageButton imBtn5 = (ImageButton) findViewById(R.id.imBtn5);
        final ImageButton imBtn6 = (ImageButton) findViewById(R.id.imBtn6);
        final ImageButton imBtn7 = (ImageButton) findViewById(R.id.imBtn7);
        final ImageButton imBtn8 = (ImageButton) findViewById(R.id.imBtn8);
        final ImageButton imBtn9 = (ImageButton) findViewById(R.id.imBtn9);
        final ImageButton imBtn10 = (ImageButton) findViewById(R.id.imBtn10);
        final ImageButton imBtn11 = (ImageButton) findViewById(R.id.imBtn11);
        final ImageButton imBtn12 = (ImageButton) findViewById(R.id.imBtn12);

        final ImageButton imBtnR1 = (ImageButton) findViewById(R.id.imBtnR1);
        final ImageButton imBtnR2 = (ImageButton) findViewById(R.id.imBtnR2);

        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        for(int i=1;i<=25;i++){
            imgsHeads.add(getResources().getIdentifier("tt_heads_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=25;i++){
            imgsBacks.add(getResources().getIdentifier("tt_backs_"+i, "drawable", getPackageName()));
        }

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[1]-1));
                //imBtn1.setImageResource(android.R.color.transparent);
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[2]-1));
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[3]-1));
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[4]-1));
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[5]-1));
                imBtn5.getLayoutParams().height = 0;
                imBtn5.requestLayout();
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[6]-1));
                imBtn6.getLayoutParams().height = 0;
                imBtn6.requestLayout();
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[1]-1));
                imBtn7.getLayoutParams().height = 0;
                imBtn7.requestLayout();
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[2]-1));
                imBtn8.getLayoutParams().height = 0;
                imBtn8.requestLayout();
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[3]-1));
                imBtn9.getLayoutParams().height = 0;
                imBtn9.requestLayout();
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[4]-1));
                imBtn10.getLayoutParams().height = 0;
                imBtn10.requestLayout();
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[5]-1));
                imBtn11.getLayoutParams().height = 0;
                imBtn11.requestLayout();
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[6]-1));
                imBtn12.getLayoutParams().height = 0;
                imBtn12.requestLayout();
            }
        });

        imBtnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs1();
                if (!hide) {show_cards();}
                Toast.makeText(TT_1Activity.this, "Верхний ряд обновлен", Toast.LENGTH_SHORT).show();
            }
        });

        imBtnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs2();
                if (!hide) {show_cards();}
                Toast.makeText(TT_1Activity.this, "Нижний ряд обновлен", Toast.LENGTH_SHORT).show();
            }
        });

        rnd_imgs1();
        rnd_imgs2();
    }

    int [] imgs1 = new int[7];
    int [] imgs2 = new int[7];

    public void rnd_imgs1() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs1[1] = 1 + rnd.nextInt(4 - 1 + 1);
        imgs1[2] = 5 + rnd.nextInt(9 - 5 + 1);
        imgs1[3] = 10 + rnd.nextInt(13 - 10 + 1);
        imgs1[4] = 14 + rnd.nextInt(18 - 14 + 1);
        imgs1[5] = 19 + rnd.nextInt(22 - 19 + 1);
        imgs1[6] = 23 + rnd.nextInt(25 - 23 + 1);
    }

    public void rnd_imgs2() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs2[1] = 1 + rnd.nextInt(4 - 1 + 1);
        imgs2[2] = 5 + rnd.nextInt(9 - 5 + 1);
        imgs2[3] = 10 + rnd.nextInt(13 - 10 + 1);
        imgs2[4] = 14 + rnd.nextInt(18 - 14 + 1);
        imgs2[5] = 19 + rnd.nextInt(22 - 19 + 1);
        imgs2[6] = 23 + rnd.nextInt(25 - 23 + 1);
    }

    boolean hide = true;

    public void show_cards() {
        ImageButton imBtn1 = (ImageButton) findViewById(R.id.imBtn1);
        ImageButton imBtn2 = (ImageButton) findViewById(R.id.imBtn2);
        ImageButton imBtn3 = (ImageButton) findViewById(R.id.imBtn3);
        ImageButton imBtn4 = (ImageButton) findViewById(R.id.imBtn4);
        ImageButton imBtn5 = (ImageButton) findViewById(R.id.imBtn5);
        ImageButton imBtn6 = (ImageButton) findViewById(R.id.imBtn6);
        ImageButton imBtn7 = (ImageButton) findViewById(R.id.imBtn7);
        ImageButton imBtn8 = (ImageButton) findViewById(R.id.imBtn8);
        ImageButton imBtn9 = (ImageButton) findViewById(R.id.imBtn9);
        ImageButton imBtn10 = (ImageButton) findViewById(R.id.imBtn10);
        ImageButton imBtn11 = (ImageButton) findViewById(R.id.imBtn11);
        ImageButton imBtn12 = (ImageButton) findViewById(R.id.imBtn12);

        imBtn1.setImageResource(imgsHeads.get(imgs1[1]-1));
        imBtn2.setImageResource(imgsHeads.get(imgs1[2]-1));
        imBtn3.setImageResource(imgsHeads.get(imgs1[3]-1));
        imBtn4.setImageResource(imgsHeads.get(imgs1[4]-1));
        imBtn5.setImageResource(imgsHeads.get(imgs1[5]-1));
        imBtn6.setImageResource(imgsHeads.get(imgs1[6]-1));
        imBtn7.setImageResource(imgsBacks.get(imgs2[1]-1));
        imBtn8.setImageResource(imgsBacks.get(imgs2[2]-1));
        imBtn9.setImageResource(imgsBacks.get(imgs2[3]-1));
        imBtn10.setImageResource(imgsBacks.get(imgs2[4]-1));
        imBtn11.setImageResource(imgsBacks.get(imgs2[5]-1));
        imBtn12.setImageResource(imgsBacks.get(imgs2[6]-1));

        hide = false;
    }

    public void hide_cards() {
        ImageButton imBtn1 = (ImageButton) findViewById(R.id.imBtn1);
        ImageButton imBtn2 = (ImageButton) findViewById(R.id.imBtn2);
        ImageButton imBtn3 = (ImageButton) findViewById(R.id.imBtn3);
        ImageButton imBtn4 = (ImageButton) findViewById(R.id.imBtn4);
        ImageButton imBtn5 = (ImageButton) findViewById(R.id.imBtn5);
        ImageButton imBtn6 = (ImageButton) findViewById(R.id.imBtn6);
        ImageButton imBtn7 = (ImageButton) findViewById(R.id.imBtn7);
        ImageButton imBtn8 = (ImageButton) findViewById(R.id.imBtn8);
        ImageButton imBtn9 = (ImageButton) findViewById(R.id.imBtn9);
        ImageButton imBtn10 = (ImageButton) findViewById(R.id.imBtn10);
        ImageButton imBtn11 = (ImageButton) findViewById(R.id.imBtn11);
        ImageButton imBtn12 = (ImageButton) findViewById(R.id.imBtn12);

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
        // Inflate the menu; this adds items to the action bar if it is present.
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
                finish();
                return true;

            case R.id.action_new:
                Intent tt = new Intent(TT_1Activity.this, TT_1Activity.class);
                startActivity(tt);
                finish();
                return true;

            case R.id.action_show:
                show_cards();
                Toast.makeText(this, "Картинки открыты", Toast.LENGTH_SHORT).show();
                item.setVisible(false);
                menu.findItem(R.id.action_hide).setVisible(true);
                return true;

            case R.id.action_hide:
                hide_cards();
                Toast.makeText(this, "Картинки скрыты", Toast.LENGTH_SHORT).show();
                item.setVisible(false);
                menu.findItem(R.id.action_show).setVisible(true);
                return true;

            case R.id.action_about:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("This is my message.");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return true;

            case R.id.action_exit:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
