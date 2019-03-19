package com.example.behtreenoils;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

public class Branding extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    ArrayList<String> recipe_text = new ArrayList<>();
    ArrayList<Integer> mrecipe = new ArrayList<>();


    ImageView logo;
    int logo_id =R.drawable.behtreen_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branding);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        logo =findViewById(R.id.logo);
        logo.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),logo_id,150,50));

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        behtreen_images_what_we_do();
        initRecyclerView_what_we_do();
    }

    private void initRecyclerView_what_we_do() {
        RecyclerView.LayoutManager manager = new GridLayoutManager(Branding.this,2);
        RecyclerView view= findViewById(R.id.our_range__view);
        view.setHasFixedSize(true);
        view.setLayoutManager(manager);
        view.setFocusable(false);
        Branding_Adapter attributes= new Branding_Adapter(mrecipe,Branding.this);
        view.setAdapter(attributes);


    }

    private void behtreen_images_what_we_do() {
       mrecipe.add(R.drawable.brand_single_image_24);
        mrecipe.add(R.drawable.brand_single_image_26);
        mrecipe.add(R.drawable.brand_single_image_25);
         mrecipe.add(R.drawable.brand_single_image_1);
       mrecipe.add(R.drawable.brand_single_image_8);
        mrecipe.add(R.drawable.brand_single_image_22);
        mrecipe.add(R.drawable.brand_single_image_9);
        mrecipe.add(R.drawable.brand_single_image_10);
        mrecipe.add(R.drawable.brand_single_image_11);
        mrecipe.add(R.drawable.brand_single_image_15);
        mrecipe.add(R.drawable.brand_single_image_16);
        mrecipe.add(R.drawable.brand_single_image_17);
        mrecipe.add(R.drawable.brand_single_image_27);
       mrecipe.add(R.drawable.brand_single_image_12);
       mrecipe.add(R.drawable.brand_single_image_14);
        mrecipe.add(R.drawable.brand_single_image_23);
        recipe_text.add("");
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
      //  getMenuInflater().inflate(R.menu.branding, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the camera action
            Intent intent = new Intent(Branding.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.about_us) {
            Intent intent = new Intent(Branding.this,About_us.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.branding) {
            Intent intent = new Intent(Branding.this,Branding.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.product) {
            Intent intent = new Intent(Branding.this,MainActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
            finish();
        } else if (id == R.id.recipe) {
            Intent intent = new Intent(Branding.this,Recipe.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.career) {
            Intent intent = new Intent(Branding.this,Career.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Branding.this,Contact.class);
            startActivity(intent);
            finish();
        }

        else if (id == R.id.share) {
            try {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                String shareMessage= "\nLet me recommend you this application\n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));
            } catch(Exception e) {
                //e.toString();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
