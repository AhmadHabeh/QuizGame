package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class question10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent x = new Intent(question10.this,end.class);
                startActivity(x);
            }
        },10000);

        for(int i=0;i<3;i++)
            Toast.makeText(question10.this, "DON'T CLICK ANYTHING , WAIT", Toast.LENGTH_LONG).show();
        AlertDialog.Builder alert = new AlertDialog.Builder(question10.this);
        alert.setTitle("BECAREFUL").setMessage("Would you like to go the first question");
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent x = new Intent(question10.this,MainActivity.class);
                startActivity(x);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent x = new Intent(question10.this,MainActivity.class);
                startActivity(x);
            }
        }).show();


    }
}