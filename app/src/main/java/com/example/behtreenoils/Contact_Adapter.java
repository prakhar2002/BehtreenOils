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

public class Contact_Adapter extends RecyclerView.Adapter<Contact_Adapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView,belowtext;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.profile_image);
            textView =itemView.findViewById(R.id.behtreen_icons_text);
            belowtext=itemView.findViewById(R.id.behtreen_icons_below_text);
        }

    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    Context context;


    public Contact_Adapter(   ArrayList<Integer> myImageList, ArrayList<String> mIconText, Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contant_icons_view,viewGroup,false);
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

        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),32,32));
        String abovetext = before(mIconText.get(i),"\n");
        holder.textView.setText(abovetext);
        String belowtext=after(mIconText.get(i),"\n");
        holder.belowtext.setText(belowtext);

    }
    static String before(String value, String a) {
        // Return substring containing all characters before a string.
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        return value.substring(0, posA);
    }

    static String after(String value, String a) {
        // Returns a substring containing all characters after a string.
        int posA = value.lastIndexOf(a);
        if (posA == -1) {
            return "";
        }
        int adjustedPosA = posA + a.length();
        if (adjustedPosA >= value.length()) {
            return "";
        }
        return value.substring(adjustedPosA);
    }
    @Override
    public int getItemCount() {
        return mIconText.size();
    }

}

