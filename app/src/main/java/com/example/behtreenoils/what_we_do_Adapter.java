package com.example.behtreenoils;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class what_we_do_Adapter extends RecyclerView.Adapter<what_we_do_Adapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.image);
            textView =itemView.findViewById(R.id.behtreen_images_text);
        }
    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ArrayList<String>whatwedoinsidetext = new ArrayList<>();
    Context context;

    public what_we_do_Adapter(   ArrayList<Integer> myImageList, ArrayList<String> mIconText,ArrayList<String> whatwedoinsidetext ,Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.whatwedoinsidetext = whatwedoinsidetext;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.behtreen_what_we_do,viewGroup,false);
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
        dialog.setContentView(R.layout.popupwhatwedo);
        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),150,100));
        holder.textView.setText(mIconText.get(i));
        final TextView popup__text        = (TextView) dialog.findViewById(R.id.popup_text);
        final ImageView popup__image   =(ImageView)dialog.findViewById(R.id.popup_image);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup__image.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),300,200));
                popup__text.setText(whatwedoinsidetext.get(i));
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

