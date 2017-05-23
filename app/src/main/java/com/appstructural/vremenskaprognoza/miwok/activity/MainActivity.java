package com.appstructural.vremenskaprognoza.miwok.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appstructural.vremenskaprognoza.miwok.R;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {

        Intent i =new Intent(this,NumbersActivity.class);
        startActivity(i);
    }

    public void openFamily(View view) {
        Intent i =new Intent(this,FamilyMembersActivity.class);
        startActivity(i);
    }


    public void openColor(View view) {
        Intent i =new Intent(this,ColorsActivity.class);
        startActivity(i);
    }


    public void openPhrases(View view) {
        Intent i =new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}
