package ru.sgti.gamestore;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MK_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk_1);

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

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn1.setImageResource(android.R.color.transparent);
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn2.setImageResource(android.R.color.transparent);
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn3.setImageResource(android.R.color.transparent);
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn4.setImageResource(android.R.color.transparent);
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn5.setImageResource(android.R.color.transparent);
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn6.setImageResource(android.R.color.transparent);
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn7.setImageResource(android.R.color.transparent);
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn8.setImageResource(android.R.color.transparent);
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn9.setImageResource(android.R.color.transparent);
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn10.setImageResource(android.R.color.transparent);
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn11.setImageResource(android.R.color.transparent);
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                imBtn12.setImageResource(android.R.color.transparent);
            }
        });
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
