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

public class Recipe extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList<String> recipe_text = new ArrayList<>();
    ArrayList<Integer> mrecipe = new ArrayList<>();
    ArrayList<String> recipe_recipes = new ArrayList<>();


    ImageView logo;
    int logo_id =R.drawable.behtreen_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
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

        recipe_text.clear();
        mrecipe.clear();
        recipe_recipes.clear();
        behtreen_images_what_we_do();
        initRecyclerView_what_we_do();
    }







    private void initRecyclerView_what_we_do() {
        RecyclerView.LayoutManager manager = new GridLayoutManager(Recipe.this,2);
        RecyclerView view= findViewById(R.id.our_range__view);
        view.setHasFixedSize(true);
        view.setLayoutManager(manager);
        view.setFocusable(false);
        Recipe_Adapter attributes= new Recipe_Adapter(mrecipe,recipe_text,recipe_recipes,Recipe.this);
        view.setAdapter(attributes);

    }

    private void behtreen_images_what_we_do() {
        mrecipe.add(R.drawable.paneer_butter_masala);
        mrecipe.add(R.drawable.veg_pulao_single_image);
        mrecipe.add(R.drawable.chicken_curry_single_image);
        mrecipe.add(R.drawable.dal_makhani_single_image);
        mrecipe.add(R.drawable.kheer_single_image);
        mrecipe.add(R.drawable.soya_corn_samosa_single_image);
        mrecipe.add(R.drawable.soya_chilli_single_image);
        recipe_text.add("Paneer Butter Masala");
        recipe_text.add("Veg Pulao");
        recipe_text.add("Chicken Curry");
        recipe_text.add("Dal Makhani");
        recipe_text.add("Kheer");
        recipe_text.add("Soya Corn Samosa");
        recipe_text.add("Soya Chilli");
        recipe_recipes.add("Ingredients" +
                "Paneer cubed (2 cups)\n\n" +
                "Onions sliced (1 cup)\n\n" +
                "Garam masala (1 tsp)\n\n" +
                "Tomato puree (1 cup)\n\n" +
                "Mustard Oil (2 tbsp + 1 tbsp)\n\n" +
                "Red chilli powder (adjust to your taste) (1 tsp)\n\n" +
                "Ginger–garlic paste (2 tsp)\n\n" +
                "Coriander powder (1 tbsp)\n\n" +
                "Milk (¾ cup)\n\n" +
                "Cream (¾ cup)\n\n" +
                "Dried fenugreek leaves (kasuri methi) (1 large pinch)\n\n" +
                "Method\n\n" +
                "Begin by heating 2 tbsp oil in a pan. Once it is hot, fry paneer cubes until golden brown. Drain and set aside.\n\n" +
                "In the same pan, add the remaining oil and sauté the onions until golden brown.\n\n" +
                "Add in ginger–garlic paste and fry for a minute then add dhaniya powder, garam masala, red chilli powder and salt as per taste. Sauté for a minute.\n\n" +
                "Now stir in tomato puree and kasuri methi then slowly add in milk.\n\n" +
                "Lower the heat, cover and cook for 5 mins.\n\n" +
                "Next, add in fried paneer along with cream. Mix well and simmer for about 3-4 mins.\n\n" +
                "Garnish with coriander and serve hot with naan.");
        recipe_recipes.add("Ingredients\n" +
                "Basmati rice cooked (2 cups)\n\n" +
                "Cauliflower separated into florets (1/2 medium)\n\n" +
                "Carrot chopped (1 medium)\n\n" +
                "French beans chopped (6-8)\n\n" +
                "Salt (as per the taste)\n\n" +
                "Peas (1/4 cup)\n\n" +
                "Clarified butter (ghee) (2 tsp)\n\n" +
                "Bay leaf (tejpatta) (2)\n\n" +
                "Cardamom (elaichi) (3â€“4)\n\n" +
                "Cloves (laung) (3-4)\n\n" +
                "Cumin (jeera) (1 tsp)\n\n" +
                "Peppercorns (7-8)\n\n" +
                "Cinnamon (dalchini) (1-inch stick)\n\n" +
                "Method\n" +
                "Let’s first cook the veggies. Heat around 4–5 cups of water in a deep pan, add cauliflower, carrot, beans and salt to it. Stir, cover and cook for about 2–3 mins, then add green peas, cover and cook further till the vegetables are almost done.\n\n" +
                "Heat ghee in another kadhai, add tejpatta, elaichi, cinnamon, cloves and cumin seeds. Sauté till the seeds splutter. Add peppercorns and mix.\n\n" +
                "Now stir in the cooked vegetables, cooked rice and salt. Gently mix, cover and cook for 2 mins.\n\n" +
                "Serve hot with some raita on the side.");
        recipe_recipes.add("Ingredients" +"Cleaned chicken (500 grams)\n\n" +
                "Mustard Oil (3 tbsp)\n\n" +
                "Sliced onions (3)\n\n" +
                "Green chillies vertically slit (3-4)\n\n" +
                "Beaten curd (1 cup)\n\n" +
                "Ginger-garlic paste (1 tbsp)\n\n" +
                "Haldi (½ tsp)\n\n" +
                "Red chilli powder (1 tsp)\n\n" +
                "Coriander seeds (1 tbsp)\n\n" +
                "Jeera (1 tsp)\n\n" +
                "Black peppercorns (3-4)\n\n" +
                "Khus khus (1 tbsp)\n\n" +
                "Cloves (2-3)\n\n" +
                "Cinnamon stick (1)\n\n" +
                "Chopped dhaniya (1 tbsp)\n\n" +
                "Salt (To taste)\n\n" +
                "Method\n\n" +
                "In a pan, dry roast jeera, cloves, coriander seeds, cinnamon stick, black peppercorns for 2–3 mins. Set aside.\n\n" +
                "Add khus khus to the same pan sauté for few seconds, allow it to cool.\n\n" +
                "Once cool, grind all the roasted ingredients to a powder, without using water.\n\n" +
                "Heat oil in a kadhai, add sliced onions, ginger–garlic paste and green chillies, sauté till the onions are transparent.\n\n" +
                "Time to add the chicken pieces. Fry till their colour changes then add red chilli powder, haldi and salt. Stir and cook for few minutes.\n\n" +
                "Now add the dry roasted spice powder and cook on low heat for about 5 mins.\n\n" +
                "Stir in the beaten curd at this stage, stir and cook covered until the chicken is tender. If needed, add water.\n\n" +
                "Garnish with coriander leaves and serve hot.");
        recipe_recipes.add("Ingredients" +
                "Whole black gram/sabut urad dal soaked overnight (1/2 cup)\n\n" +
                "Rajma (2 tbsp)\n\n" +
                "Onion (chopped) (1)\n\n" +
                "Salt to taste\n\n" +
                "Tomatoes (2)\n\n" +
                "Red chilli powder (1 tsp)\n\n" +
                "Ginger (chopped) (2-inch pieces)\n\n" +
                "Mustard Oil (3 tbsp)\n\n" +
                "Jeera (1 tsp)\n\n" +
                "Garlic chopped (6 cloves)\n\n" +
                "Green chillies slit (2)\n\n" +
                "Garam masala (1 tsp)\n\n" +
                "Method\n\n" +
                "Let’s pressure-cook urad dal and rajma together with 3 cups of water, salt and ½ tsp red chilli powder for 4–5 whistles (the rajma should be completely soft). Drain but reserve the water.\n\n" +
                "Heat oil in a pan, add jeera and when it splutters, add ginger, garlic and onion; sauté till the onion is translucent.\n\n" +
                "Time to add green chillies, tomatoes and the remaining red chilli powder. Fry till the tomatoes are mushy.\n\n" +
                "Now add dal and rajma along with the reserved water. If the gravy is still too thick, add some more water. Boil for 7–8 mins or until the dal is soft and has blended well.\n\n" +
                "Add garam masala, cook further for 2 mins and then switch off the heat.\n\n" +
                "Serve hot with rice or roti.");
        recipe_recipes.add("Ingredients" +
                "Soya Granules (½ cup)\n\n" +
                "Milk (500 ml)\n\n" +
                "Sugar (½ cup)\n\n" +
                "Cardamom powder (½ tsp)\n\n" +
                "Soaked saffron (few strands)\n\n" +
                "Warm Water\n\n" +
                "Method\n\n" +
                "In a bowl, pour a mug of hot water. Add Soya Granules to this and let it soak for 15 minutes.\n\n" +
                "Drain the water from this. Now pour some more water and drain once more.\n\n" +
                "In a separate pan, add milk, heat it and stir continuously. Follow it with soaked Soya Granules.\n\n" +
                "Next, goes in sugar followed with cardamom powder.\n\n" +
                "Pour in a few strands of soaked saffron and stir the mixture continuously.\n\n" +
                "Continue cooking on a medium flame till the kheer thickens.");
        recipe_recipes.add("Ingredients" +
                "Soya Granules (½ cup)\n\n" +
                "Maida (1 cup)\n\n" +
                "Ajwain (½ tsp)\n\n" +
                "Salt to taste\n\n" +
                "Ghee (2 tsp)\n\n" +
                "Boiled potatoes (½ cup)\n\n" +
                "Boiled sweet corn (¼ cup)\n\n" +
                "Boiled green peas (¼ cup)\n\n" +
                "Chopped green chilli (1 tsp)\n\n" +
                "Grated ginger (½ tsp)\n\n" +
                "Chopped mint leaves (1 tsp)\n\n" +
                "Jeera powder (½ tsp)\n\n" +
                "Garam masala (½ tsp)\n\n" +
                "Coriander powder (½ tsp)\n\n" +
                "Fortune Rice Bran Health oil\n\n" +
                "Water\n\n" +
                "Method\n\n" +
                "In a bowl, pour hot water and Soya Granules.\n\n" +
                "Soak it for 15 minutes and drain excess water.\n\n" +
                "In a separate bowl, add maida, ajwain, ghee, salt and mix this well.\n\n" +
                "Moisten this mixture with water and make a dough.\n\n" +
                "Take the soaked Soya Granules and let the boiled potatoes, sweet corn and green peas give it good company!\n\n" +
                "Then goes chopped green chilli, grated ginger, chopped mint leaves, and salt followed by jeera powder, garam masala and dhaniya powder.\n\n" +
                "Mix the components well and let it rest.\n\n" +
                "Now roll out the dough, cut it, place the stuffings and join the edges.\n\n" +
                "Shape your samosa well\n\n" +
                "Add Rice Bran Health Oil in a pan and deep fry the samosas till golden brown.");
        recipe_recipes.add("Ingredients" +
                "Soya Chunks (½ cup)\n\n" +
                "Rice Bran Health Oil (1 tbsp)\n\n" +
                "Chopped ginger-garlic-chilli (1 tbsp)\n\n" +
                "Salt to taste\n\n" +
                "Soya sauce (1 tsp)\n\n" +
                "Vinegar (1 tsp)\n\n" +
                "Corn flour slurry (¼ cup)\n\n" +
                "Diced onion (¼ cup)\n\n" +
                "Diced green capsicum (¼ cup)\n\n" +
                "Diced yellow capsicum (¼ cup)\n\n" +
                "Diced red capsicum (¼ cup)\n\n" +
                "Handful of spring onions\n\n" +
                "Water\n\n" +
                "Method\n\n" +
                "In a bowl, pour hot water and Soya Chunks\n\n" +
                "Soak it for 15 minutes and drain excess water. Then add some more water to soften\n\n" +
                "Pour Rice Bran Health oil and chopped ginger-garlic-chilli and stir it well.\n\n" +
                "Place the soaked Soya Chunks, add water and cook for a minute\n\n" +
                "Pinch some salt in to taste\n\n" +
                "Then goes in soya sauce, vinegar and corn flour slurry. Mix the contents well.\n\n" +
                "Throw in some diced onions and follow it up with diced green capsicum, diced yellow capsicum and diced red capsicum.\n\n" +
                "Cook for 2 minutes and garnish this by sprinkling spring onions on top.");

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
       // getMenuInflater().inflate(R.menu.recipe, menu);
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
            Intent intent = new Intent(Recipe.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.about_us) {
            Intent intent = new Intent(Recipe.this,About_us.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.branding) {
            Intent intent = new Intent(Recipe.this,Branding.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.product) {
            Intent intent = new Intent(Recipe.this,MainActivity.class);
            intent.putExtra("value",2);
            startActivity(intent);
        } else if (id == R.id.recipe) {
            Intent intent = new Intent(Recipe.this,Recipe.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.career) {
            Intent intent = new Intent(Recipe.this,Career.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Recipe.this,Contact.class);
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
