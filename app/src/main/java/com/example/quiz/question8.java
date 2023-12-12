package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        Button doorplay = findViewById(R.id.doorplay);
        Button fireplay = findViewById(R.id.playfire);
        Button submit = findViewById(R.id.submit);
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioButton rb1;
        RadioGroup rb2;
        MediaPlayer door = MediaPlayer.create(this,R.raw.sliding_door);
        MediaPlayer fire = MediaPlayer.create(this,R.raw.campfire);

        AudioManager audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume (AudioManager.STREAM_MUSIC, audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC),0);


        doorplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                door.start();
            }
        });

        fireplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fire.start();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answer1,answer2;
                answer1 = rg1.getCheckedRadioButtonId();
                answer2 = rg2.getCheckedRadioButtonId();
                if(answer1 == R.id.correct1 && answer2 == R.id.correct2) {
                    Toast.makeText(question8.this, "CORREECT", Toast.LENGTH_LONG).show();
                    Intent x = new Intent(question8.this,question9.class);
                    startActivity(x);
                }
            }
        });
    }
}