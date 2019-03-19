package com.example.behtreenoils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Recipe_Adapter extends RecyclerView.Adapter<Recipe_Adapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        Button ViewMore;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.ttt);
            textView =itemView.findViewById(R.id.recipe_text);
            ViewMore =itemView.findViewById(R.id.view_more);
        }
    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ArrayList<String> mRecipe_Recipes = new ArrayList<>();

    Context context;

    public Recipe_Adapter(   ArrayList<Integer> myImageList, ArrayList<String> mIconText,ArrayList<String> mRecipe_Recipes, Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.mRecipe_Recipes = mRecipe_Recipes;

        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recipe_fragment,viewGroup,false);
        viewHolder v = new viewHolder(viewfull);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int i) {
      /*  Glide.with(context).asBitmap().load(mIcons.get(i)).into(viewHolder.imageView);
        viewHolder.textView.setText(mIconText.get(i));

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),150,100));
        holder.textView.setText(mIconText.get(i));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Open_Recipe.class);
                intent.putExtra("image",myImageList.get(i));
                intent.putExtra("recipe_text",mIconText.get(i));
                intent.putExtra("recipe_method",mRecipe_Recipes.get(i));
                context.startActivity(intent);
            }
        });
        holder.ViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Open_Recipe.class);
                intent.putExtra("image",myImageList.get(i));
                intent.putExtra("recipe_text",mIconText.get(i));
                intent.putExtra("recipe_method",mRecipe_Recipes.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mIconText.size();
    }

}

