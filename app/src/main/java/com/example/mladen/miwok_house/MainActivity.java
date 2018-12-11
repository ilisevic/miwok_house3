package com.example.mladen.miwok_house;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));        words.add(new Word("IC ", "XC"));
        words.add(new Word("NI ", "KA"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);







    }
}
