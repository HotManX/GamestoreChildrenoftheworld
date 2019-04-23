package ru.sgti.gamestore;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;

public class AboutGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView imageView1 = findViewById(R.id.imageView1);

        Intent intent = getIntent();
        String temp = intent.getStringExtra("game");

        if (temp.equals("tt")) {
            imageView1.setImageResource(R.drawable.about_tt);
        }
        if (temp.equals("pikt")) {
            imageView1.setImageResource(R.drawable.about_pikt);
        }
        if (temp.equals("pm")) {
            imageView1.setImageResource(R.drawable.about_pm);
        }
        if (temp.equals("mk")) {
            imageView1.setImageResource(R.drawable.about_mk);
        }
        if (temp.equals("rech")) {
            imageView1.setImageResource(R.drawable.about_rech);
        }
        if (temp.equals("gen")) {
            imageView1.setImageResource(R.drawable.about_gen);
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
