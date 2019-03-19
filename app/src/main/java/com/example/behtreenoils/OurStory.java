package com.example.behtreenoils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class OurStory extends Fragment {

    ArrayList<String> our_range_text = new ArrayList<>();
    ArrayList<String> our_range_inside_text = new ArrayList<>();
    ArrayList<Integer> our_range_do = new ArrayList<>();
    ArrayList<Integer> our_range_images = new ArrayList<>();
    Button read_more;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        our_range_text.clear();
        our_range_do.clear();
        our_range_images.clear();
        our_range_inside_text.clear();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.our_story, container, false);
        read_more = view.findViewById(R.id.readmore);
        read_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Open_Our_Story.class);
                startActivity(intent);
            }
        });
        behtreen_images_our_range();
        initRecyclerView_our_range(view);
        return view;
    }
    private void initRecyclerView_our_range(View vieww) {
        RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(),3);
        RecyclerView view= vieww.findViewById(R.id.our_range__view);
        view.setHasFixedSize(true);
        view.setLayoutManager(manager);
        view.setFocusable(false);
        Behtreen_our_range_Adapter attributes= new Behtreen_our_range_Adapter(our_range_do,our_range_text,our_range_images,our_range_inside_text,getContext());
        view.setAdapter(attributes);

    }

    private void behtreen_images_our_range() {
        our_range_do.add(R.drawable.first);
        our_range_do.add(R.drawable.second);
        our_range_do.add(R.drawable.second_web);
        our_range_do.add(R.drawable.fourth);
        our_range_do.add(R.drawable.fifth);
        our_range_do.add(R.drawable.sixth);
        our_range_text.add("Extra Virgin");
        our_range_text.add("Mustard Seeds");
        our_range_text.add("Taste of Mustard");
        our_range_text.add("Organic Mustard");
        our_range_text.add("Quality Mustard");
        our_range_text.add("Mustard Only");
        our_range_images.add(R.drawable.range_first);
        our_range_images.add(R.drawable.range_second);
        our_range_images.add(R.drawable.range_thrid);
        our_range_images.add(R.drawable.range_fourth);
        our_range_images.add(R.drawable.range_fifth);
        our_range_images.add(R.drawable.range_sixth);
        our_range_inside_text.add("We buy the best seeds from farmers and press them in a traditional wooden press (kacchi ghani), keeping nutrients, antioxidants, and flavor intact. We don’t use any heat, steam, or chemicals, such as hexane. Our method gives a lower yield but gives you the highest quality oil.\n" +
                "\n" +
                "Our mustard oil does not undergo any of the processing that commercial refined mustard oil goes through, such as deodorization or bleaching. We retain all the natural goodness of the oil.\n" +
                "\n" +
                "Our mustard oil is made from indigenous Indian varieties of mustard and is non-GMO.\n" +
                "\n" +
                "Our mustard oil is a deep golden oil with the distinct, pungent aroma and rich taste of pure mustard.\n" +
                "\n" +
                "Unrefined mustard oil has an ideal ratio of omega-6 to omega-3 fatty acids; it is also low in saturated fatty acids and rich in monounsaturated fatty acids (MUFA), making it extremely heart-friendly.\n" +
                "\n" +
                "Refrigerate the bottle after opening it; keep the cap shut tight. Unrefined oils are fragile compounds and are best consumed within three to four months of the date of packaging. The oil may appear cloudy when stored in your fridge—this is absolutely normal.\n" +
                "\n" +
                "Mustard oil is excellent for skin and hair and can be used as a massage oil. Traditionally, it has also been used with salt to massage the gums for oral health.");

        our_range_inside_text.add("Many people do not realize that mustard seeds come from the same plant as mustard greens. This versatile plant can be grown as a vegetable and eaten like other greens or, if allowed to flower and go to seed, mustard seeds can be harvested and used as a spice in cooking or ground into a popular condiment. Learning how to grow mustard seeds is easy and rewarding.\n" +
                "\n" +
                "Mustard plants will eventually flower and go to seed. The flowers are generally yellow, but some varieties have white flowers. As the mustard flower grows and matures, it will form pods. Watch for these pods to start to turn brown.\n" +
                "\n" +
                "Another sign that you are nearing harvest time is that the leaves of the plant will start to yellow. Be careful not to leave the pods on the mustard seed plant for too long as they will burst open when fully ripe and the mustard seed harvest will be lost.\n" +
                "\n" +
                "The next step is to remove the seeds from the pods. You can do this with your hands, or you can place the flower heads in a paper bag and allow them to finish maturing.\n" +
                "\n" +
                "The pods will open on their own in 1-2 weeks and a gentle shake of the bag will shake loose most of the mustard seeds.\n" +
                "\n" +
                "Mustard seeds can be used fresh, but like other herbs and spices, if you plant on storing them long term, they will need to be dried.");
        our_range_inside_text.add("Mustard oil has been used for centuries as a food additive and remains a staple in a majority of Indian homes. Incorporating mustard oil into your daily diet is known to protect against heart disease. The oil is rich in monounsaturated fats and polyunsaturated fats, both of which help lower bad cholesterol and raise good HDL cholesterol hence maintaining one’s cholesterol balance, which in turn leads to healthy cardiac functioning.\n" +
                "\n" +
                "“Mustard oil also works well as an antibacterial, antiviral and anti fungal agent and can help fight bacterial infections in the digestive system.”");
        our_range_inside_text.add("Mustard oil is a common staple in India, Rome and Greece for centuries as a culinary and therapeutic agent. Being extracted from Mustard seeds, this oil carries a unique nutty flavour and packs a huge array of health benefits.\n" +
                "Being rich in MUFA, PUFA, Omega 3 & 6, Vitamin E, Minerals and anti-oxidants, Mustard oil demonstrates strong Anti-Microbial property and is Anti-inflammatory in nature. It improves heart health and reduces cancer risks.\n" +
                "Most valuable health benefit of Mustard oil can be attributed to its strong stimulant property. It helps improves circulation, boosts metabolism, relieves sinus congestion and most importantly invigorates digestion.\n" +
                "A study report in American Journal of Clinical Nutrition showed that Mustard oil, as part of a regular diet, could improve your heart health by lowering cholesterol and blood pressure with its high MUFA content.\n" +
                "With its thick consistency and rich Vitamin E content, Mustard oil is considered as a natural Sunscreen when applied externally. It also acts as a natural cleanser by opening skin pores by stimulating the sweat glands. Massaging with Mustard oil is known to lighten the pigmentation spots and improve complexion.\n" +
                "Mustard oil moisturizes and revitalizes the scalp with essential fatty acids and helps prevent hair loss by warding off dandruff and fungal infections. Mix with an equal quantity of Virgin coconut oil and massage scalp for complete hair care from root to the tip.\n" +
                "Mustard oil acts as an antibacterial when used both externally and internally. Internally it fights with the bacterial infections in colon, intestines and other parts of digestive tract. Externally it fights both bacterial and fungal infections of the skin.\n" +
                "Organic Mustard Oil carries a delicate pungent and nutty flavour which tastes great in many recipes. It can be used as cooking oil, oil for pickling and externally for massaging the skin and on hair.\n" +
                "Just including Pure, Unadulterated, organic Mustard oil in your regular cooking can result in healthy skin, hair and heart, so are valued in traditional cultures for its multitude of benefits.");
        our_range_inside_text.add("Mustard oil has been used as a cooking medium over the centuries in Indian cuisines. Mustard oil can be procured by different processes. But what is important is to ensure that you are using pure mustard oil in your diet.\n" +
                "\n" +
                "Know The Color\n" +
                "\n" +
                "Mustard oil usually has a dark golden brown color. If it has a lighter shade, then chances are there that your edible oil is not pure.\n" +
                "\n" +
                "Check Out the Quality\n" +
                "\n" +
                "The mustard oil can be considered as pure if it does not freeze. If it solidifies, then you can be sure that some other vegetable or animal fat has been used in making the particular oil.");
        our_range_inside_text.add("Take a small amount of mustard oil in a transparent glass and add a few drops of nitric acid to it. Shake vigorously and heat the mixture for 2-3 minutes. The appearance of red color indicates the presence of argemone oil.");
    }

}