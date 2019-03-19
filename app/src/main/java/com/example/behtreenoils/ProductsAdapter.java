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
import android.widget.Toast;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        Button button;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.Products_image);
            textView =itemView.findViewById(R.id.products_text);
            button=itemView.findViewById(R.id.viewmore);
        }
    }
    ArrayList<Integer> myImageList = new ArrayList<>();
    ArrayList<String> mIconText = new ArrayList<>();
    ArrayList<String> mcategory = new ArrayList<>();
    Context context;

    public ProductsAdapter(   ArrayList<Integer> myImageList, ArrayList<String> mIconText,ArrayList<String> mcategory, Context context) {
        this.myImageList = myImageList;
        this.mIconText = mIconText;
        this.mcategory=mcategory;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewfull = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_fragment,viewGroup,false);
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
        holder.imageView.setImageBitmap(ImageNicer.decodeSampledBitmapFromResource(context.getResources(),myImageList.get(i),150,180));
        holder.textView.setText(mIconText.get(i));

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),OpenProducts.class);
                intent.putExtra("image",myImageList.get(i));
                intent.putExtra("text_Image",mIconText.get(i));
                intent.putExtra("category_text",mcategory.get(i));
              //  Toast.makeText(context,myImageList.get(i),Toast.LENGTH_LONG).show();
                context.startActivity(intent);
            }
        });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),OpenProducts.class);
                intent.putExtra("image",myImageList.get(i));
                intent.putExtra("text_Image",mIconText.get(i));
                intent.putExtra("category_text",mcategory.get(i));
                //  Toast.makeText(context,myImageList.get(i),Toast.LENGTH_LONG).show();
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mIconText.size();
    }

}

