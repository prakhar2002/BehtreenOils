package com.example.behtreenoils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

//import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class behtreen_icons_attributes extends RecyclerView.Adapter<behtreen_icons_attributes.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder {

        CircleImageView imageView;
        TextView textView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.profile_image);
            textView =itemView.findViewById(R.id.behtreen_icons_text);

        }

    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    Context context;
    int id = R.drawable.image_______2;

    public behtreen_icons_attributes(   ArrayList<Integer> myImageList, ArrayList<String> mIconText, Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.behtreen_multi_icon,viewGroup,false);
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
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.popup);
        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),50,50));
        holder.textView.setText(mIconText.get(i));
        final ImageView popup__image   =(ImageView)dialog.findViewById(R.id.popup_image);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup__image.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),id,200,200));
                dialog.setTitle("");
                dialog.show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return mIconText.size();
    }

}
