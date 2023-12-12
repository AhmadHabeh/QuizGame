package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        EditText answer = findViewById(R.id.answer);
        Button loc = findViewById(R.id.loc);
        Button submit = findViewById(R.id.submit);

        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:31.955752,35.938548"));
                startActivity(x);
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer.getText().toString().equals("roman"))
                {
                    Intent z = new Intent(question5.this,question6.class);
                    startActivity(z);
                }
            }
        });
    }
}