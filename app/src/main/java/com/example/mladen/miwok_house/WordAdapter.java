package com.example.mladen.miwok_house;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter  extends ArrayAdapter <Word>{

    //WordAdapter (Context t,Arr )

    public WordAdapter (Activity context, ArrayList<Word> words)
    {
        super (context, 0, words);


    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
View listItemView = convertView;
if (listItemView== null)
{
    listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);


}


Word words = getItem(position);
        TextView tv1 = listItemView.findViewById(R.id.tw1);

        tv1.setText(words.getEng());


        TextView tv2 = listItemView.findViewById(R.id.tw2);

        tv2.setText(words.getMiwok());

return listItemView;

    }
}
