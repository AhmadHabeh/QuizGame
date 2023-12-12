package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class question3 extends AppCompatActivity {
    int timesclicked;
    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        v = findViewById(R.id.videoView);
        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(videopath);
        v.setVideoURI(uri);
        v.start();
        v.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                v.start();
            }
        });

        timesclicked = 0;
        RadioGroup rg = findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId)
                {
                    case R.id.order1:{order(1);break;}
                    case R.id.order2:{order(2);break;}
                    case R.id.order3:{order(3);break;}
                    case R.id.order4:{order(4);break;}
                }
            }
        });
    }

    public void order(int id){
        int pass[] = {2,3,1,4};
        if(pass[timesclicked] == id)
            timesclicked++;
        else
            timesclicked=0;

        if(timesclicked == 4) {
            Toast.makeText(question3.this, "GOOD JOB YOU FOUND THE CODE", Toast.LENGTH_LONG).show();
            Intent x = new Intent(question3.this,question4.class);
            startActivity(x);
            timesclicked=0;
        }

    }
}