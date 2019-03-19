package com.example.behtreenoils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Vector;

public class Contact extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ImageView logo;
    int logo_id =R.drawable.behtreen_logo;
    EditText name,phnno,email,details;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        logo =findViewById(R.id.logo);
        logo.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),logo_id,150,50));


       name=findViewById(R.id.username);
       phnno=findViewById(R.id.phonenumber);
       email=findViewById(R.id.email);
       details=findViewById(R.id.details);
       send=findViewById(R.id.btn_Register);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       myImageList.clear();
       mIconText.clear();
       Behtreen_icons();
        intiRecyclerView();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send_email();
            }
        });
    }


    private void send_email() {
        String getname= String.valueOf(name.getText());
        String getphnno= String.valueOf(phnno.getText());
        String getemail = String.valueOf(email.getText());

        String getdetails = String.valueOf(details.getText());

        String emailreciver = "behtreenoil@gmail.com";
        String emailreciver1 ="admin@behtreen.in";

        String[]reciveremail ={emailreciver,emailreciver1};

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,reciveremail);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback of the product");
        intent.putExtra(Intent.EXTRA_TEXT,"\t\t\t"+getname+"\n\n"+getphnno+"\t\t"+getemail+"\n\n"+getdetails);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose email option"));



    }

    private void Behtreen_icons(){
        myImageList.add(R.drawable.black_home_image);
        myImageList.add(R.drawable.black_phone_image);
        myImageList.add(R.drawable.black_email_image);
        mIconText.add("Address\n" +
                "Plot No. 2, KH. No. 92/93, Jharoda Kalan, South West Delhi");
        mIconText.add("Phone\n" +
                "+91-9588015189");
        mIconText.add("Email\n" +
                "essteeagro@gmail.com");
    }
    private void intiRecyclerView(){
        RecyclerView.LayoutManager manager = new GridLayoutManager(Contact.this,3);
        RecyclerView vieww= findViewById(R.id.icon_behtreen_oil);
        vieww.setHasFixedSize(true);
        vieww.setLayoutManager(manager);
        Contact_Adapter attributes= new Contact_Adapter(myImageList,mIconText,Contact.this);
        vieww.setAdapter(attributes);

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
      //  getMenuInflater().inflate(R.menu.contact, menu);
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
            Intent intent = new Intent(Contact.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.about_us) {
            Intent intent = new Intent(Contact.this,About_us.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.branding) {
            Intent intent = new Intent(Contact.this,Branding.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.product) {
            Intent intent = new Intent(Contact.this,MainActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
        } else if (id == R.id.recipe) {
            Intent intent = new Intent(Contact.this,Recipe.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.career) {
            Intent intent = new Intent(Contact.this,Career.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Contact.this,Contact.class);
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
