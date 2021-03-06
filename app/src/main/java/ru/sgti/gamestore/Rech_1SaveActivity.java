package ru.sgti.gamestore;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Rech_1SaveActivity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rech_1_save);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},00);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ImageView imageView1 = findViewById(R.id.imageView1);
        final ImageView imageView2 = findViewById(R.id.imageView2);
        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);

        Intent intent = getIntent();
        int img1 = intent.getIntExtra("img1", 0);
        int img2 = intent.getIntExtra("img2", 0);
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");
        String text3 = intent.getStringExtra("text3");

        imageView1.setImageResource(img1);
        imageView2.setImageResource(img2);

        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_save_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_save:
                takeScreenshot();
                _M.Toast(this,"Результат сохранен");
                //finish();
                return true;
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void takeScreenshot() {
        String now = DateFormat.format("yyyy-MM-dd_hhmmss", new  java.util.Date()).toString();
        File mPath = new File (Environment.getExternalStorageDirectory() + "/Дети мира/Речедром/");
        mPath.mkdirs();
        File imageFile = new File(mPath + "/" + now + ".jpg") ;

        LinearLayout v = findViewById(R.id.linearLayout);
        v.setDrawingCacheEnabled(true);
        Bitmap bmp = Bitmap.createBitmap(v.getDrawingCache());
        v.setDrawingCacheEnabled(false);
        try {
            FileOutputStream outputStream = new FileOutputStream(imageFile);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            _M.Toast(this,"Ошибка доступа");
        } catch (IOException e) {
            e.printStackTrace();
            _M.Toast(this,"Ошибка доступа");
        }
        //_M.Toast(this,imageFile.toString());
    }
}
