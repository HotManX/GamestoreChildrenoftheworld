package ru.sgti.gamestore;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;
import java.util.ArrayList;

public class ViewResultsActivity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    ArrayList<File> imgs = new ArrayList<File>();

    int[] current_img = new int[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_results);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},00);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ImageView imageView = findViewById(R.id.imageView);

        final ImageButton btnLeft = findViewById(R.id.btnLeft);
        final ImageButton btnRight = findViewById(R.id.btnRight);

        File mPath = new File("");
        Intent intent = getIntent();
        String temp = intent.getStringExtra("game");
        if (temp.equals("tt")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Тяни-толкай/");
        }
        if (temp.equals("pikt")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Пиктограф/");
        }
        if (temp.equals("pm")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Пойми-меня/");
        }
        if (temp.equals("mk")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Мульт-контак/");
        }
        if (temp.equals("rech")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Речедром/");
        }
        if (temp.equals("gen")) {
            mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Генератор историй/");
        }

        if (mPath.exists()) {
            File[] folderEntries = mPath.listFiles();
            for (File entry : folderEntries) {
                if (entry.isFile()) {
                    //_M.Toast(this, entry.toString());
                    imgs.add(entry);
                }
            }
            if (imgs.size() != 0) {
                imageView.setImageDrawable(Drawable.createFromPath(imgs.get(0).getAbsolutePath()));
                current_img[0] = 1;
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Сохранённые результаты отсутствуют");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Сохранённые результаты отсутствуют");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    finish();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_img[0] != 1) {
                    current_img[0]--;
                    imageView.setImageDrawable(Drawable.createFromPath(imgs.get(current_img[0]-1).getAbsolutePath()));
                }
                imgCheck();
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_img[0] != imgs.size()) {
                    current_img[0]++;
                    imageView.setImageDrawable(Drawable.createFromPath(imgs.get(current_img[0]-1).getAbsolutePath()));
                }
                imgCheck();
            }
        });

        imgCheck();
    }

    private void imgCheck() {
        final ImageButton btnLeft = findViewById(R.id.btnLeft);
        final ImageButton btnRight = findViewById(R.id.btnRight);

        if (current_img[0] == 1) {
            btnLeft.setBackgroundResource(R.drawable.cborder_left_disabled);
        }
        else {
            btnLeft.setBackgroundResource(R.drawable.cborder_left);
        }
        if (current_img[0] == imgs.size()) {
            btnRight.setBackgroundResource(R.drawable.cborder_right_disabled);
        }
        else {
            btnRight.setBackgroundResource(R.drawable.cborder_right);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
