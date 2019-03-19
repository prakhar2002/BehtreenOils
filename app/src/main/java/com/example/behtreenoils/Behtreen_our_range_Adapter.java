package com.example.behtreenoils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Behtreen_our_range_Adapter extends RecyclerView.Adapter<Behtreen_our_range_Adapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageButton imageView;
        TextView textView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.our_range_image);
            textView =itemView.findViewById(R.id.our_range__text);
        }
    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ArrayList<Integer> mour_range_image = new ArrayList<>();
    ArrayList<String> mour_range_inside_text = new ArrayList<>();
    Context context;

    public Behtreen_our_range_Adapter(   ArrayList<Integer> myImageList, ArrayList<String> mIconText,
                                         ArrayList<Integer> mour_range_image,ArrayList<String> mour_range_inside_text,Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.mour_range_image = mour_range_image;
        this.mour_range_inside_text =mour_range_inside_text;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.our_range_recyclerview,viewGroup,false);
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
        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),70,100));
        holder.textView.setText(mIconText.get(i));


        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Open_Our_Range.class);
                intent.putExtra("image",mour_range_image.get(i));
                intent.putExtra("range_text",mIconText.get(i));
                intent.putExtra("inside_range_text",mour_range_inside_text.get(i));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mIconText.size();
    }

}
