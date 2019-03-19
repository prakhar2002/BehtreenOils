package com.example.behtreenoils;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.tomer.fadingtextview.FadingTextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Home extends Fragment implements View.OnTouchListener {

    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ArrayList<String> what_we_do_text = new ArrayList<>();
    ArrayList<String>what_we_do_inside_text = new ArrayList<>();
    ArrayList<Integer> mWhat_we_do = new ArrayList<>();
    Button viewmore;
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();
    ImageView slide_1,slide_2,slide_3;
    int one=R.drawable.slide;
    int two=R.drawable.slide_2_1;
    int three =R.drawable.slide_3_1;
    private ViewFlipper TruitonFlipper;
    private float initialX;
    FadingTextView ftext;
    ImageButton leftflipper,rightflipper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myImageList.clear();
        mIconText.clear();
        what_we_do_text.clear();
        mWhat_we_do.clear();
        youtubeVideos.clear();
        View view = inflater.inflate(R.layout.fragment_home, container, false);
         Behtreen_icons();
        intiRecyclerView(view);
        behtreen_images_what_we_do();
        initRecyclerView_what_we_do(view);
        viewmore = view.findViewById(R.id.view_more_button);
        ftext = view.findViewById(R.id.fading_text);
        viewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Recipe.class);
                startActivity(intent);
            }
        });


        slide_1= view.findViewById(R.id.slide1);
        slide_2=view.findViewById(R.id.slide2);
        slide_3=view.findViewById(R.id.slide3);
        leftflipper = view.findViewById(R.id.left);
        rightflipper= view.findViewById(R.id.right);

        slide_1.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),one,400,200));
        slide_2.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),two,400,200));
        slide_3.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(getResources(),three,400,200));

        recyclerView = view.findViewById(R.id.youtubeRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()));

        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6iuV0sfJXmM\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
        TruitonFlipper = (ViewFlipper)view.findViewById(R.id.images);
        TruitonFlipper.setInAnimation(getContext(), android.R.anim.fade_in);
        TruitonFlipper.setOutAnimation(getContext(), android.R.anim.fade_out);
       rightflipper.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TruitonFlipper.showNext();
           }
       });

       leftflipper.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TruitonFlipper.showPrevious();
           }
       });
        return view;
    }


    private void Behtreen_icons(){
        myImageList.add(R.drawable.first_web);
        myImageList.add(R.drawable.second_web);
        myImageList.add(R.drawable.thrid_web);
        myImageList.add(R.drawable.fourth_web);
        mIconText.add("Gourmet Flavour");
        mIconText.add("Special Oils");
        mIconText.add("Health Benefits");
        mIconText.add("Extraordinary Taste");
    }
    private void intiRecyclerView(View view){
        RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(),4);
        RecyclerView vieww= view.findViewById(R.id.icon_behtreen_oil);
        vieww.setHasFixedSize(true);
        vieww.setLayoutManager(manager);
        behtreen_icons_attributes attributes= new behtreen_icons_attributes(myImageList,mIconText,getContext());
        vieww.setAdapter(attributes);

    }


    private void initRecyclerView_what_we_do(View vieww) {
        RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(),3);
        RecyclerView view= vieww.findViewById(R.id.what_we_do_recyclerview);
        view.setHasFixedSize(true);
        view.setLayoutManager(manager);
        what_we_do_Adapter attributes= new what_we_do_Adapter(mWhat_we_do,what_we_do_text,what_we_do_inside_text,getContext());
        view.setAdapter(attributes);

    }

    private void behtreen_images_what_we_do() {
        what_we_do_text.add("Modern Technology");
        mWhat_we_do.add(R.drawable.modern_technology_single_image);
        what_we_do_text.add("Food Certifications");
        mWhat_we_do.add(R.drawable.certification_single_image);
        what_we_do_text.add("Quality Testing");
        mWhat_we_do.add(R.drawable.quality_testing_single_image);
        what_we_do_inside_text.add("Behtreen Oil manufactured using facilities with all kinds of advanced machines, latest technologies and tools for production of mustard oils.");
        what_we_do_inside_text.add("The ESS TEE Agro oil Pvt. Ltd. is certified company from FSSAI – Food Safety and Standards Authority of India and AG Mark – Government of India");
        what_we_do_inside_text.add("ESS TEE Agro adhere to all possible quality standards and measures while processing mustard oils (Behtreen Oil).");
    }
  /*  public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                initialX = touchevent.getX();
                break;
            case MotionEvent.ACTION_UP:
                float finalX = touchevent.getX();
                if (initialX > finalX) {
                    if (TruitonFlipper.getDisplayedChild() == 1)
                        break;

 /*TruitonFlipper.setInAnimation(this, R.anim.in_right);
 TruitonFlipper.setOutAnimation(this, R.anim.out_left);

                    TruitonFlipper.showNext();
                } else {
                    if (TruitonFlipper.getDisplayedChild() == 0)
                        break;

 /*TruitonFlipper.setInAnimation(this, R.anim.in_left);
 TruitonFlipper.setOutAnimation(this, R.anim.out_right);

                    TruitonFlipper.showPrevious();
                }
                break;
        }
        return false;
    }*/

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getActionMasked();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                initialX = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                float finalX = event.getX();
                if (initialX > finalX) {
                    if (TruitonFlipper.getDisplayedChild() == 1)
                        break;

 /*TruitonFlipper.setInAnimation(this, R.anim.in_right);
 TruitonFlipper.setOutAnimation(this, R.anim.out_left);*/

                    TruitonFlipper.showNext();
                } else {
                    if (TruitonFlipper.getDisplayedChild() == 0)
                        break;

 /*TruitonFlipper.setInAnimation(this, R.anim.in_left);
 TruitonFlipper.setOutAnimation(this, R.anim.out_right);*/

                    TruitonFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
}
