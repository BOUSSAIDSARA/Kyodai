package com.example.massicilia.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public abstract class MainActivity extends Activity implements View.OnClickListener {
    ImageButton play,score,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(ImageButton)findViewById(R.id.play);
        score=(ImageButton)findViewById(R.id.score);
        about=(ImageButton)findViewById(R.id.about);
        play.setOnClickListener(this);
        score.setOnClickListener(this);
        about.setOnClickListener(this);

    }
    public void onClick (View v){
        switch (v.getId()){
            case R.id.play:
                Intent startplay= new Intent(this, Game.class);
                startActivity(startplay);
                break;
            case R.id.score:
                Intent score= new Intent(this, Score.class);
                startActivity(score);
                break;
            case R.id.about:
                Intent about= new Intent(this, About.class);
                startActivity(about);
                break;
        }
    }
}