package ru.sgti.gamestore;

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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Pikt_1Activity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    ArrayList<Integer> imgsPikts1 = new ArrayList<Integer>();
    ArrayList<Integer> imgsPikts2 = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pikt_1);

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

        final ImageButton imBtnR1 = findViewById(R.id.imBtnR1);
        final ImageButton imBtnR2 = findViewById(R.id.imBtnR2);

        final ImageView imageView1 = findViewById(R.id.imageView1);

        Button Btn1 = findViewById(R.id.Btn1);

        for(int i=1;i<=21;i++){
            imgsPikts1.add(getResources().getIdentifier("pikt_pikts1_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=39;i++){
            imgsPikts2.add(getResources().getIdentifier("pikt_pikts2_"+i, "drawable", getPackageName()));
        }

        final int[] current_img = new int[1];

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[1]-1));
                current_img[0] = imgs1[1];
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[2]-1));
                current_img[0] = imgs1[2];
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[3]-1));
                current_img[0] = imgs1[3];
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[4]-1));
                current_img[0] = imgs1[4];
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[5]-1));
                current_img[0] = imgs1[5];
                imBtn5.getLayoutParams().height = 0;
                imBtn5.requestLayout();
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts1.get(imgs1[6]-1));
                current_img[0] = imgs1[6];
                imBtn6.getLayoutParams().height = 0;
                imBtn6.requestLayout();
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[1]-1));
                current_img[0] = imgs2[1];
                imBtn7.getLayoutParams().height = 0;
                imBtn7.requestLayout();
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[2]-1));
                current_img[0] = imgs2[2];
                imBtn8.getLayoutParams().height = 0;
                imBtn8.requestLayout();
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[3]-1));
                current_img[0] = imgs2[3];
                imBtn9.getLayoutParams().height = 0;
                imBtn9.requestLayout();
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[4]-1));
                current_img[0] = imgs2[4];
                imBtn10.getLayoutParams().height = 0;
                imBtn10.requestLayout();
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[5]-1));
                current_img[0] = imgs2[5];
                imBtn11.getLayoutParams().height = 0;
                imBtn11.requestLayout();
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsPikts2.get(imgs2[6]-1));
                current_img[0] = imgs2[6];
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
                _M.Toast(Pikt_1Activity.this,"Верхний ряд обновлен");
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
                _M.Toast(Pikt_1Activity.this,"Нижний ряд обновлен");
            }
        });

        rnd_imgs1();
        rnd_imgs2();
    }

    int [] imgs1 = new int[7];
    int [] imgs2 = new int[7];

    public void rnd_imgs1() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs1[1] = 1 + rnd.nextInt(2 - 1 + 1);
        imgs1[2] = 3 + rnd.nextInt(6 - 3 + 1);
        imgs1[3] = 7 + rnd.nextInt(10 - 7 + 1);
        imgs1[4] = 11 + rnd.nextInt(14 - 11 + 1);
        imgs1[5] = 15 + rnd.nextInt(18 - 15 + 1);
        imgs1[6] = 19 + rnd.nextInt(21 - 19 + 1);
    }

    public void rnd_imgs2() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs2[1] = 1 + rnd.nextInt(5 - 1 + 1);
        imgs2[2] = 6 + rnd.nextInt(12 - 6 + 1);
        imgs2[3] = 13 + rnd.nextInt(19 - 13 + 1);
        imgs2[4] = 20 + rnd.nextInt(26 - 20 + 1);
        imgs2[5] = 32 + rnd.nextInt(35 - 32 + 1);
        imgs2[6] = 36 + rnd.nextInt(39 - 36 + 1);
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

        imBtn1.setImageResource(imgsPikts1.get(imgs1[1]-1));
        imBtn2.setImageResource(imgsPikts1.get(imgs1[2]-1));
        imBtn3.setImageResource(imgsPikts1.get(imgs1[3]-1));
        imBtn4.setImageResource(imgsPikts1.get(imgs1[4]-1));
        imBtn5.setImageResource(imgsPikts1.get(imgs1[5]-1));
        imBtn6.setImageResource(imgsPikts1.get(imgs1[6]-1));
        imBtn7.setImageResource(imgsPikts2.get(imgs2[1]-1));
        imBtn8.setImageResource(imgsPikts2.get(imgs2[2]-1));
        imBtn9.setImageResource(imgsPikts2.get(imgs2[3]-1));
        imBtn10.setImageResource(imgsPikts2.get(imgs2[4]-1));
        imBtn11.setImageResource(imgsPikts2.get(imgs2[5]-1));
        imBtn12.setImageResource(imgsPikts2.get(imgs2[6]-1));

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
                finish();
                return true;

            case R.id.action_new:
                Intent tt = new Intent(Pikt_1Activity.this, Pikt_1Activity.class);
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

            case R.id.action_about:
                Intent intent = new Intent(Pikt_1Activity.this, AboutGameActivity.class);
                intent.putExtra("game", "pikt");
                startActivity(intent);
                return true;

            case R.id.action_exit:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
