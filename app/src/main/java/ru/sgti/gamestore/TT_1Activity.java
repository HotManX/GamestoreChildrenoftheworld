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

public class TT_1Activity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

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

        Button Btn1 = findViewById(R.id.Btn1);
        Button Btn2 = findViewById(R.id.Btn2);

        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);

        for(int i=1;i<=25;i++){
            imgsHeads.add(getResources().getIdentifier("tt_heads_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=25;i++){
            imgsBacks.add(getResources().getIdentifier("tt_backs_"+i, "drawable", getPackageName()));
        }

        final int[] current_img = new int[2];

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[1]-1));
                imageView1.setTag(imgsHeads.get(imgs1[1]-1));
                current_img[0] = imgs1[1];
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[2]-1));
                imageView1.setTag(imgsHeads.get(imgs1[2]-1));
                current_img[0] = imgs1[2];
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[3]-1));
                imageView1.setTag(imgsHeads.get(imgs1[3]-1));
                current_img[0] = imgs1[3];
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[4]-1));
                imageView1.setTag(imgsHeads.get(imgs1[4]-1));
                current_img[0] = imgs1[4];
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[5]-1));
                imageView1.setTag(imgsHeads.get(imgs1[5]-1));
                current_img[0] = imgs1[5];
                imBtn5.getLayoutParams().height = 0;
                imBtn5.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsHeads.get(imgs1[6]-1));
                imageView1.setTag(imgsHeads.get(imgs1[6]-1));
                current_img[0] = imgs1[6];
                imBtn6.getLayoutParams().height = 0;
                imBtn6.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[1]-1));
                imageView2.setTag(imgsBacks.get(imgs2[1]-1));
                current_img[1] = imgs1[1];
                imBtn7.getLayoutParams().height = 0;
                imBtn7.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[2]-1));
                imageView2.setTag(imgsBacks.get(imgs2[2]-1));
                current_img[1] = imgs1[2];
                imBtn8.getLayoutParams().height = 0;
                imBtn8.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[3]-1));
                imageView2.setTag(imgsBacks.get(imgs2[3]-1));
                current_img[1] = imgs1[3];
                imBtn9.getLayoutParams().height = 0;
                imBtn9.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[4]-1));
                imageView2.setTag(imgsBacks.get(imgs2[4]-1));
                current_img[1] = imgs1[4];
                imBtn10.getLayoutParams().height = 0;
                imBtn10.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[5]-1));
                imageView2.setTag(imgsBacks.get(imgs2[5]-1));
                current_img[1] = imgs1[5];
                imBtn11.getLayoutParams().height = 0;
                imBtn11.requestLayout();
                textView1.setText("");
                textView2.setText("");
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsBacks.get(imgs2[6]-1));
                imageView2.setTag(imgsBacks.get(imgs2[6]-1));
                current_img[1] = imgs1[6];
                imBtn12.getLayoutParams().height = 0;
                imBtn12.requestLayout();
                textView1.setText("");
                textView2.setText("");
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
                _M.Toast(TT_1Activity.this,"Верхний ряд обновлен");
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
                _M.Toast(TT_1Activity.this,"Нижний ряд обновлен");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_img[0] == 1) {
                    textView1.setText("Бегемот");
                }
                if (current_img[0] == 2) {
                    textView1.setText("Черепаха");
                }
                if (current_img[0] == 3) {
                    textView1.setText("Ёжик");
                }
                if (current_img[0] == 4) {
                    textView1.setText("Кит");
                }
                if (current_img[0] == 5) {
                    textView1.setText("Лошадь");
                }
                if (current_img[0] == 6) {
                    textView1.setText("Корова");
                }
                if (current_img[0] == 7) {
                    textView1.setText("Кошка");
                }
                if (current_img[0] == 8) {
                    textView1.setText("Крокодил");
                }
                if (current_img[0] == 9) {
                    textView1.setText("Лев");
                }
                if (current_img[0] == 10) {
                    textView1.setText("Лягушка");
                }
                if (current_img[0] == 11) {
                    textView1.setText("Медведь");
                }
                if (current_img[0] == 12) {
                    textView1.setText("Мышь");
                }
                if (current_img[0] == 13) {
                    textView1.setText("Петух");
                }
                if (current_img[0] == 14) {
                    textView1.setText("Пингвин");
                }
                if (current_img[0] == 15) {
                    textView1.setText("Собака");
                }
                if (current_img[0] == 16) {
                    textView1.setText("Ворона");
                }
                if (current_img[0] == 17) {
                    textView1.setText("Рыба");
                }
                if (current_img[0] == 18) {
                    textView1.setText("Слон");
                }
                if (current_img[0] == 19) {
                    textView1.setText("Свинья");
                }
                if (current_img[0] == 20) {
                    textView1.setText("Верблюд");
                }
                if (current_img[0] == 21) {
                    textView1.setText("Волк");
                }
                if (current_img[0] == 22) {
                    textView1.setText("Заяц");
                }
                if (current_img[0] == 23) {
                    textView1.setText("Зебра");
                }
                if (current_img[0] == 24) {
                    textView1.setText("Жираф");
                }
                if (current_img[0] == 25) {
                    textView1.setText("Попугай");
                }

                if (current_img[1] == 1) {
                    textView2.setText("Бегемот");
                }
                if (current_img[1] == 2) {
                    textView2.setText("Черепаха");
                }
                if (current_img[1] == 3) {
                    textView2.setText("Ёжик");
                }
                if (current_img[1] == 4) {
                    textView2.setText("Кит");
                }
                if (current_img[1] == 5) {
                    textView2.setText("Лошадь");
                }
                if (current_img[1] == 6) {
                    textView2.setText("Корова");
                }
                if (current_img[1] == 7) {
                    textView2.setText("Кошка");
                }
                if (current_img[1] == 8) {
                    textView2.setText("Крокодил");
                }
                if (current_img[1] == 9) {
                    textView2.setText("Лев");
                }
                if (current_img[1] == 10) {
                    textView2.setText("Лягушка");
                }
                if (current_img[1] == 11) {
                    textView2.setText("Медведь");
                }
                if (current_img[1] == 12) {
                    textView2.setText("Мышь");
                }
                if (current_img[1] == 13) {
                    textView2.setText("Петух");
                }
                if (current_img[1] == 14) {
                    textView2.setText("Пингвин");
                }
                if (current_img[1] == 15) {
                    textView2.setText("Собака");
                }
                if (current_img[1] == 16) {
                    textView2.setText("Ворона");
                }
                if (current_img[1] == 17) {
                    textView2.setText("Рыба");
                }
                if (current_img[1] == 18) {
                    textView2.setText("Слон");
                }
                if (current_img[1] == 19) {
                    textView2.setText("Свинья");
                }
                if (current_img[1] == 20) {
                    textView2.setText("Верблюд");
                }
                if (current_img[1] == 21) {
                    textView2.setText("Волк");
                }
                if (current_img[1] == 22) {
                    textView2.setText("Заяц");
                }
                if (current_img[1] == 23) {
                    textView2.setText("Зебра");
                }
                if (current_img[1] == 24) {
                    textView2.setText("Жираф");
                }
                if (current_img[1] == 25) {
                    textView2.setText("Попугай");
                }
            }

        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TT_1Activity.this, TT_1SaveActivity.class);
                intent.putExtra("img1", (Integer)imageView1.getTag());
                intent.putExtra("img2", (Integer)imageView2.getTag());
                startActivity(intent);
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
                Intent tt = new Intent(TT_1Activity.this, TT_1Activity.class);
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
                Intent intent = new Intent(TT_1Activity.this, ViewResultsActivity.class);
                intent.putExtra("game", "tt");
                startActivity(intent);
                return true;

            case R.id.action_about:
                Intent about = new Intent(TT_1Activity.this, AboutGameActivity.class);
                about.putExtra("game", "tt");
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
