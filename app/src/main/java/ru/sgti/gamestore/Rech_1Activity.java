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

public class Rech_1Activity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    ArrayList<Integer> imgsRech1 = new ArrayList<Integer>();
    ArrayList<Integer> imgsRech2 = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rech_1);

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

        final ImageView imageView1 = findViewById(R.id.imageView1);
        final ImageView imageView2 = findViewById(R.id.imageView2);

        Button Btn1 = findViewById(R.id.Btn1);
        Button Btn2 = findViewById(R.id.Btn2);
        Button Btn3 = findViewById(R.id.Btn3);

        final TextView text1 = findViewById(R.id.text1);
        final TextView text2 = findViewById(R.id.text2);
        final TextView text3 = findViewById(R.id.text3);
        final TextView text4 = findViewById(R.id.text4);
        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);

        for(int i=1;i<=8;i++){
            imgsRech1.add(getResources().getIdentifier("rech_stran_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=40;i++){
            imgsRech2.add(getResources().getIdentifier("rech_"+i, "drawable", getPackageName()));
        }

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsRech1.get(imgs1[1]-1));
                imageView2.setTag(imgsRech1.get(imgs1[1]-1));
                textView3.setText(get_country(imgs1[1]));
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
                text1.setText("");
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsRech1.get(imgs1[2]-1));
                imageView2.setTag(imgsRech1.get(imgs1[2]-1));
                textView3.setText(get_country(imgs1[2]));
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
                text2.setText("");
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsRech1.get(imgs1[3]-1));
                imageView2.setTag(imgsRech1.get(imgs1[3]-1));
                textView3.setText(get_country(imgs1[3]));
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
                text3.setText("");
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(imgsRech1.get(imgs1[4]-1));
                imageView2.setTag(imgsRech1.get(imgs1[4]-1));
                textView3.setText(get_country(imgs1[4]));
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
                text4.setText("");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rech_1Activity.this, Rech_1SaveActivity.class);
                intent.putExtra("img1", (Integer)imageView1.getTag());
                intent.putExtra("img2", (Integer)imageView2.getTag());
                intent.putExtra("text1", textView1.getText());
                intent.putExtra("text2", textView2.getText());
                intent.putExtra("text3", textView3.getText());
                startActivity(intent);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs1();
                imBtn1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn1.requestLayout();
                imBtn2.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn2.requestLayout();
                imBtn3.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn3.requestLayout();
                imBtn4.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn4.requestLayout();
                _M.Toast(Rech_1Activity.this,"Страны обновлены");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs2();
                _M.Toast(Rech_1Activity.this,"Ситуация обновлена");
            }
        });

        rnd_imgs1();
        rnd_imgs2();
        textView3.setText("");
    }

    int [] imgs1 = new int[5];
    int [] imgs2 = new int[1];

    public void rnd_imgs1() {
        final ImageButton imBtn1 = findViewById(R.id.imBtn1);
        final ImageButton imBtn2 = findViewById(R.id.imBtn2);
        final ImageButton imBtn3 = findViewById(R.id.imBtn3);
        final ImageButton imBtn4 = findViewById(R.id.imBtn4);

        final TextView text1 = findViewById(R.id.text1);
        final TextView text2 = findViewById(R.id.text2);
        final TextView text3 = findViewById(R.id.text3);
        final TextView text4 = findViewById(R.id.text4);

        Random rnd = new Random(System.currentTimeMillis());

        imgs1[1] = 1 + rnd.nextInt(2 - 1 + 1);
        imgs1[2] = 3 + rnd.nextInt(4 - 3 + 1);
        imgs1[3] = 5 + rnd.nextInt(6 - 5 + 1);
        imgs1[4] = 7 + rnd.nextInt(8 - 7 + 1);

        imBtn1.setImageResource(imgsRech1.get(imgs1[1]-1));
        imBtn2.setImageResource(imgsRech1.get(imgs1[2]-1));
        imBtn3.setImageResource(imgsRech1.get(imgs1[3]-1));
        imBtn4.setImageResource(imgsRech1.get(imgs1[4]-1));

        text1.setText(get_country(imgs1[1]));
        text2.setText(get_country(imgs1[2]));
        text3.setText(get_country(imgs1[3]));
        text4.setText(get_country(imgs1[4]));
    }

    public void rnd_imgs2() {
        final ImageView imageView1 = findViewById(R.id.imageView1);

        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);

        int [] time = new int[2];

        Random rnd = new Random(System.currentTimeMillis());

        time[0] = rnd.nextInt(12 + 1);
        time[1] = 10 + rnd.nextInt(60 - 10 + 1);

        switch (rnd.nextInt(2)) {
            case 0:
                textView1.setText("Время: "+time[0]+":"+time[1]+" PM");
                if (time[0] < 6) {
                    textView2.setText("День");
                    imgs2[0] = 1 + rnd.nextInt(20 - 1 + 1);
                    imageView1.setImageResource(imgsRech2.get(imgs2[0]-1));
                    imageView1.setTag(imgsRech2.get(imgs2[0]-1));
                }
                else {
                    textView2.setText("Вечер");
                    imgs2[0] = 20 + rnd.nextInt(40 - 20 + 1);
                    imageView1.setImageResource(imgsRech2.get(imgs2[0]-1));
                    imageView1.setTag(imgsRech2.get(imgs2[0]-1));
                }
                break;
            case 1:
                textView1.setText("Время: "+time[0]+":"+time[1]+" AM");
                if (time[0] < 6) {
                    textView2.setText("Ночь");
                    imgs2[0] = 1 + rnd.nextInt(20 - 1 + 1);
                    imageView1.setImageResource(imgsRech2.get(imgs2[0]-1));
                    imageView1.setTag(imgsRech2.get(imgs2[0]-1));
                }
                else {
                    textView2.setText("Утро");
                    imgs2[0] = 20 + rnd.nextInt(40 - 20 + 1);
                    imageView1.setImageResource(imgsRech2.get(imgs2[0]-1));
                    imageView1.setTag(imgsRech2.get(imgs2[0]-1));
                }
                break;
        }
    }

    public String get_country(int Num) {
        if (Num == 1) {
            return "Франция";
        }
        else if (Num == 2) {
            return "Россия";
        }
        else if (Num == 3) {
            return "Германия";
        }
        else if (Num == 4) {
            return "США";
        }
        else if (Num == 5) {
            return "Италия";
        }
        else if (Num == 6) {
            return "Япония";
        }
        else if (Num == 7) {
            return "Канада";
        }
        else if (Num == 8) {
            return "Норвегия";
        }
        return "";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_game_menu, menu);
        MenuItem item = menu.findItem(R.id.action_hide);
        item.setVisible(false);
        item = menu.findItem(R.id.action_show);
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
                Intent tt = new Intent(Rech_1Activity.this, Rech_1Activity.class);
                startActivity(tt);
                finish();
                return true;

            case R.id.action_view:
                Intent intent = new Intent(Rech_1Activity.this, ViewResultsActivity.class);
                intent.putExtra("game", "rech");
                startActivity(intent);
                return true;

            case R.id.action_about:
                Intent about = new Intent(Rech_1Activity.this, AboutGameActivity.class);
                about.putExtra("game", "rech");
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
