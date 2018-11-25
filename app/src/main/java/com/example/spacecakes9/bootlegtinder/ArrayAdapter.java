package com.example.spacecakes9.bootlegtinder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter<Cards> {
    Context context;

    public ArrayAdapter(Context context, int resourceId, List<Cards> items) {
        super(context,resourceId,items);
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        Cards card_item = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }

        TextView name = convertView.findViewById(R.id.profileName);
        ImageView image = convertView.findViewById(R.id.profileImage);

        name.setText(card_item.getName());
        image.setImageResource(R.mipmap.ic_launcher);


        return convertView;

    }
}
