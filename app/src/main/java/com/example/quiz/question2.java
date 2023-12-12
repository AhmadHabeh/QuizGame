package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void go(View view) {
        Toast.makeText(question2.this, "THATS THE MISSING PIECE HEHE!!", Toast.LENGTH_SHORT).show();
        Intent x = new Intent(question2.this,question3.class);
        startActivity(x);
    }
}