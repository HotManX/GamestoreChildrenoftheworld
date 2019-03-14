package ru.sgti.gamestore;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class _MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        ImageButton ttBtn = (ImageButton) findViewById(R.id.imageButtonTt);
        ImageButton piktBtn = (ImageButton) findViewById(R.id.imageButtonPikt);
        ImageButton pmBtn = (ImageButton) findViewById(R.id.imageButtonPm);
        ImageButton mkBtn = (ImageButton) findViewById(R.id.imageButtonMk);
        ImageButton rechBtn = (ImageButton) findViewById(R.id.imageButtonRech);
        ImageButton genBtn = (ImageButton) findViewById(R.id.imageButtonGen);

        buttonEffect(ttBtn);
        buttonEffect(piktBtn);
        buttonEffect(pmBtn);
        buttonEffect(mkBtn);
        buttonEffect(rechBtn);
        buttonEffect(genBtn);

        ttBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tt();
            }
        });

        piktBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pikt();
            }
        });

        pmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pm();
            }
        });

        mkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mk();
            }
        });

        rechBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rech();
            }
        });

        genBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gen();
            }
        });
    }

    private void tt() {
        Intent tt = new Intent(_MainActivity.this, TT_1Activity.class);
        startActivity(tt);
    }

    private void pikt() {
        Intent pikt = new Intent(_MainActivity.this, Pikt_1Activity.class);
        startActivity(pikt);
    }

    private void pm() {
        Intent pm = new Intent(_MainActivity.this, PM_1Activity.class);
        startActivity(pm);
    }

    private void mk() {
        Intent mk = new Intent(_MainActivity.this, MK_1Activity.class);
        startActivity(mk);
    }

    private void rech() {
        Intent rech = new Intent(_MainActivity.this, Rech_1Activity.class);
        startActivity(rech);
    }

    private void gen() {
        Intent gen = new Intent(_MainActivity.this, Gen_1Activity.class);
        startActivity(gen);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {

            //noinspection SimplifiableIfStatement
            case R.id.action_exit:
                Toast.makeText(this, "Yep", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {

            case R.id.nav_tt:
                tt();
                break;
            case R.id.nav_pikt:
                pikt();
                break;
            case R.id.nav_pm:
                pm();
                break;
            case R.id.nav_mk:
                mk();
                break;
            case R.id.nav_rech:
                rech();
                break;
            case R.id.nav_gen:
                gen();
                break;
            case R.id.nav_about:
                Intent about = new Intent(_MainActivity.this, AboutActivity.class);
                startActivity(about);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public static void buttonEffect(View button){
        button.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        view.getBackground().setColorFilter(0x7f05002a,PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_MOVE: {
                        view.getBackground().setColorFilter(0x7f05002a,PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    default: {
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }
}
