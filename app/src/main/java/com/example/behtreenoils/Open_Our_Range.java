package com.example.behtreenoils;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Open_Our_Range extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ImageView logo,range_image;
    int logo_id =R.drawable.behtreen_logo,count=0;
    TextView range_text;
    TextView range_inside_text;
    Button view_more;
    String smallinsidetext_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open__our__range);
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
        range_image = findViewById(R.id.range_image);
        range_text = findViewById(R.id.range_text_);
        range_inside_text = findViewById(R.id.range_inside_text_);
        view_more = findViewById(R.id.view_more_);
        range_image.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources()
                ,getIntent().getIntExtra("image",00),400,200));
        range_text.setText(getIntent().getStringExtra("range_text"));
        String smallinsidetext = getIntent().getStringExtra("inside_range_text");
        smallinsidetext_= before(smallinsidetext,"\n");
        if(smallinsidetext_.equals("")){
            range_inside_text.setText(getIntent().getStringExtra("inside_range_text"));
        }else {
            range_inside_text.setText(smallinsidetext_);
        }
        view_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    range_inside_text.setText(getIntent().getStringExtra("inside_range_text"));
                    view_more.setText("View Less");
                    count++;
                }
                else {
                    range_inside_text.setText(smallinsidetext_);
                    if(smallinsidetext_.equals("")){
                        range_inside_text.setText(getIntent().getStringExtra("inside_range_text"));
                    }
                    count =0;
                    view_more.setText("View More");
                }
            }
        });
        //
    }

    static String before(String value, String a) {
        // Return substring containing all characters before a string.
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        return value.substring(0, posA);
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
      //  getMenuInflater().inflate(R.menu.open__our__range, menu);
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
            Intent intent = new Intent(Open_Our_Range.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.about_us) {
            Intent intent = new Intent(Open_Our_Range.this,About_us.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.branding) {
            Intent intent = new Intent(Open_Our_Range.this,Branding.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.product) {
            Intent intent = new Intent(Open_Our_Range.this,MainActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
        } else if (id == R.id.recipe) {
            Intent intent = new Intent(Open_Our_Range.this,Recipe.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.career) {
            Intent intent = new Intent(Open_Our_Range.this,Career.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Open_Our_Range.this,Contact.class);
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
