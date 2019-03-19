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

public class Open_Our_Story extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    ImageView logo;
    int logo_id =R.drawable.behtreen_logo;
    String text_our_Story,text_our_Story1;
    String text_our_mission,text_our_mission1;
    String text_cap,text_cap1;
    String text_dis,text_dis1;
    Button story_view,mission_view,cap_view,dis_view;
    TextView mission_text,cap_text,dis_text;
   TextView story_text;
    int count=0,coun1=0,count2=0,count3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open__our__story);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        logo =findViewById(R.id.logo);
        logo.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),logo_id,150,50));

        story_view=findViewById(R.id.our_story_view);
        mission_view=findViewById(R.id.our_mission_view);
        cap_view = findViewById(R.id.capacity_view);
        dis_view= findViewById(R.id.distribution_view);

        story_text=findViewById(R.id.our_story_text);
        mission_text=findViewById(R.id.our_mission_text);
        cap_text=findViewById(R.id.capacity_text);
        dis_text=findViewById(R.id.distibution_text);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        text_our_Story="The Ess Tee Agro Oils Pvt Ltd, was founded in 2018 in Delhi by a group of successful entrepreneurs, corporate executives, and senior professionals. " +
                "\n"+"We aim to create healthy cooking medium category by focusing on Yellow mustard oil.\n" +
                "\n" +
                "Our country is in need of healthy natural edible oils & food products. We aim to deliver only the best quality, innovative packaging and better healthy solution. We believe in providing natural taste with healthy and economic solution to all. Safety, quality and wel" +
                "l-being is our number one priority. All our processes and actions are governed by strict government ethics and we follow all food safety norms. A high quality of product, packaging and equal standard is thoroughly maintained towards producing each and every unit of our offering.";

        text_our_mission="Being in a core agronomy sector, we work with a simple corporate objective to manufacture, process and market the " +
                "purest possible agro production." +
                "\n"+" we aimed towards delivering tastier and healthier food solution to our customers. We procure only the optimum best quality raw material, to ensure purity and healthy solution. The focus is laid upon ensuring healthier and budget-friendly solutions to all. We believe in creating a brand that provides improved, sustainable and healthier solution to the nation.\n" +
                "\n" +
                "“To position our flagship brand Behtreen as the most favourite among premium consumer focusing on health benefits." +
                " Assuring innovative packaging and world class quality of product. " +
                "Creating new category of yellow mustard oil, the healthiest cooking mustard oil in India.”";
        text_cap="Today, Ess Tee Agro Oils Pvt Ltd owns one crushing & one packaging units with capacity of 1500 ton per month finished " +
                "goods." +
                " We are at expansion mode to take the capacity to 5000 TPM very soon.";
        text_dis="Ess Tee Agro Oils Pvt Ltd has the distribution network at Delhi & " +
                "Haryana and spreading towards north region and looking forward all India operation in year to come." +
                " We have sufficient good distributors with us who want to grow with organization.";

        text_our_Story1 =before(text_our_Story,"\n");
        text_our_mission1=before(text_our_mission,"\n");
        text_cap1=before(text_cap,"\n");
        text_dis1=before(text_dis,"\n");

        story_text.setText(text_our_Story1);
        mission_text.setText(text_our_mission1);
        cap_text.setText(text_cap);
        dis_text.setText(text_dis);

        story_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    story_text.setText(text_our_Story);
                    story_view.setText("View Less");
                    count++;
                }else{
                    story_text.setText(text_our_Story1);
                    story_view.setText("View More");
                    count=0;
                }
            }
        });
        mission_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    mission_text.setText(text_our_mission);
                    mission_view.setText("View Less");
                    count++;
                }else{
                    mission_text.setText(text_our_mission1);
                    mission_view.setText("View More");
                    count=0;
                }
            }
        });


        cap_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    cap_view.setText("View Less");
                    count++;
                }else{
                    cap_view.setText("View More");
                    count=0;
                }
            }
        });

        dis_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){
                    dis_view.setText("View Less");
                    count++;
                }else{
                    dis_view.setText("View More");
                    count=0;
                }
            }
        });
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
      //  getMenuInflater().inflate(R.menu.open__our__story, menu);
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
            Intent intent = new Intent(Open_Our_Story.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.about_us) {
            Intent intent = new Intent(Open_Our_Story.this,About_us.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.branding) {
            Intent intent = new Intent(Open_Our_Story.this,Branding.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.product) {
            Intent intent = new Intent(Open_Our_Story.this,MainActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
        } else if (id == R.id.recipe) {
            Intent intent = new Intent(Open_Our_Story.this,Recipe.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.career) {
            Intent intent = new Intent(Open_Our_Story.this,Career.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Open_Our_Story.this,Contact.class);
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
