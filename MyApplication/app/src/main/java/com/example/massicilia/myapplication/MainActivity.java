package com.example.massicilia.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    ImageButton play,score,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(ImageButton)findViewById(R.id.play);
        score=(ImageButton)findViewById(R.id.score);
        about=(ImageButton)findViewById(R.id.about);
        play.setOnClickListener(this);
    }
}
