package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    //private static final String TAG = "com.example.recyclerview.RecyclerViewAdapter";

    private List<List_Item> list;

    private Context context;

    public RecyclerViewAdapter(List<List_Item> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layot_listitem,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        //Log.d(TAG,"onBindView:Called");

        viewHolder.textView.setText(list.get(i).getHead());

        //Glide.with(context).load(list.get(i).getImageurl()).into(viewHolder.circleImageView);

        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d(TAG,"Onclick:called"+list.get(i));
                Toast.makeText(context, (CharSequence) list.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView circleImageView;
        TextView textView;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.circuler_image);
            textView=itemView.findViewById(R.id.circle_text);
            relativeLayout=itemView.findViewById(R.id.parent_layout);



        }
    }
}
