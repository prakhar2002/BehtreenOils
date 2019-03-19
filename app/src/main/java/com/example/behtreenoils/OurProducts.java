package com.example.behtreenoils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import java.util.ArrayList;

public class OurProducts extends Fragment {

    ArrayList<String> our_products_text = new ArrayList<>();
    ArrayList<Integer> our_products = new ArrayList<>();
    ArrayList<String>category = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        our_products_text.clear();
        our_products.clear();
        category.clear();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.our_range_fragment, container, false);
        behtreen_images_our_range();
        initRecyclerView_our_range(view);
        return view;
    }

    private void initRecyclerView_our_range(View vieww) {
        RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(), 2);
        RecyclerView view = vieww.findViewById(R.id.our_range__view);
        view.setHasFixedSize(true);
        view.setFocusable(false);
        view.setLayoutManager(manager);
        ProductsAdapter attributes = new ProductsAdapter(our_products, our_products_text,category, getContext());
        view.setAdapter(attributes);
    }

    private void behtreen_images_our_range() {
        our_products.add(R.drawable.image_2);
        our_products.add(R.drawable.image_3);
        our_products.add(R.drawable.image_6);
        our_products.add(R.drawable.image_5);
        our_products.add(R.drawable.image_4);
        our_products.add(R.drawable.image_14);
        our_products.add(R.drawable.image_11);
        our_products.add(R.drawable.image_12);
        our_products.add(R.drawable.image_37);
        our_products.add(R.drawable.image_35);
        our_products.add(R.drawable.image_15);
        our_products.add(R.drawable.image_25);
        our_products.add(R.drawable.image_29);
        our_products.add(R.drawable.image_31);
        our_products.add(R.drawable.image_10);
        our_products.add(R.drawable.image_24);
        our_products.add(R.drawable.image_39);
        our_products.add(R.drawable.image_34);
        our_products.add(R.drawable.image_33);
        our_products.add(R.drawable.image_17);
        our_products.add(R.drawable.image_18);
        our_products.add(R.drawable.image_28);
        our_products.add(R.drawable.image_20);
        our_products.add(R.drawable.image_23);
        our_products.add(R.drawable.image_36);
        our_products.add(R.drawable.image_37);
        our_products.add(R.drawable.image_16);
        our_products.add(R.drawable.image_19);
        our_products.add(R.drawable.image_38);
        our_products.add(R.drawable.image_26);
        our_products.add(R.drawable.image_32);
        our_products.add(R.drawable.image_22);


        our_products_text.add("EBehtreen Premium Kachi Ghani Mustard Oil 1 Liter");
        our_products_text.add("Behtreen Premium Yellow Mustard Oil 1 liter");
        our_products_text.add("Behtreen Premium Yellow Mustard Oil 200 ml");
        our_products_text.add("Behtreen Premium Yellow Mustard Oil Half Liter");
        our_products_text.add("Behtreen White Til Oil 1 Liter");
        our_products_text.add("Behtreen Premium Til Oil Half Liter");
        our_products_text.add("Almust Kachi Ghani Mustard Oil");
        our_products_text.add("Almust Kachi Ghani Mustard Oil");
        our_products_text.add("Almust Kachi Ghani Sarsu Oil 15 Liter");
        our_products_text.add("Almust Kachi Ghani Mustard Oil");
        our_products_text.add("Almust Kachi Ghani Mustard Oil");
        our_products_text.add("Almust kachi Ghani Mustard Oil");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Sehri Mustard Oil 15 kg");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Sehri Mustard Oil");
        our_products_text.add("Akarshan Blended Mustard Oil");
        our_products_text.add("Akarshan Blended Mustard Oil 1 Liter");
        our_products_text.add("Akarshan Blended Mustard Oil");
        our_products_text.add("Akarshan Blended Mustard Oil");
        our_products_text.add("Akarshan Blended Mustard Oil");
        our_products_text.add("Akarshan Blended Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");
        our_products_text.add("1-10 Mustard Oil");

        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 887");
        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 888");
        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 891");
        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 890");
        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 889");
        category.add("CATEGORY: behtreen\n" +
                "PRODUCT ID: 899");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 896");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 897");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 921");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 919");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 900");
        category.add("CATEGORY: almust\n" +
                "PRODUCT ID: 909");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 913");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 915");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 895");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 908");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 923");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 918");
        category.add("CATEGORY: sehri\n" +
                "PRODUCT ID: 917");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 902");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 903");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 912");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 905");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 907");
        category.add("CATEGORY: akarshan\n" +
                "PRODUCT ID: 920");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 911");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 901");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 904");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 922");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 910");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 916");
        category.add("CATEGORY: 1-10\n" +
                "PRODUCT ID: 906");

    }
}
