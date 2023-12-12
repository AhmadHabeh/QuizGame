package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        TextView topleft = findViewById(R.id.topleft);
        TextView ques = findViewById(R.id.ques);
        EditText text = findViewById(R.id.text);
        Button submit = findViewById(R.id.submit);
        CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,answer;
        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        c7 = findViewById(R.id.checkBox7);
        c8 = findViewById(R.id.checkBox8);
        c9 = findViewById(R.id.checkBox9);
        c10 = findViewById(R.id.checkBox10);
        c11 = findViewById(R.id.checkBox11);
        c12 = findViewById(R.id.checkBox12);
        answer = findViewById(R.id.answer);


        topleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.setChecked(false);
                c2.setChecked(false);
                c3.setChecked(false);
                c4.setChecked(false);
                c5.setChecked(false);
                c6.setChecked(false);
                c7.setChecked(false);
                c8.setChecked(false);
                c9.setChecked(false);
                c10.setChecked(false);
                c11.setChecked(false);
                c12.setChecked(false);
                c2.setVisibility(View.INVISIBLE);
                c3.setVisibility(View.INVISIBLE);
                c4.setVisibility(View.INVISIBLE);
                c5.setVisibility(View.INVISIBLE);
                c6.setVisibility(View.INVISIBLE);
                c7.setVisibility(View.INVISIBLE);
                c8.setVisibility(View.INVISIBLE);
                c9.setVisibility(View.INVISIBLE);
                c10.setVisibility(View.INVISIBLE);
                c11.setVisibility(View.INVISIBLE);
                c12.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.INVISIBLE);
                ques.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.valueOf(text.getText().toString()) == 13) {
                    Toast.makeText(question4.this, "CORREECTTTTTTTT", Toast.LENGTH_SHORT).show();
                    Intent x = new Intent(question4.this,question5.class);
                    startActivity(x);
                }
            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c2.setVisibility(View.VISIBLE);
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c3.setVisibility(View.VISIBLE);
            }
        });

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c4.setVisibility(View.VISIBLE);
            }
        });

        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c5.setVisibility(View.VISIBLE);
            }
        });

        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c6.setVisibility(View.VISIBLE);
            }
        });

        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c7.setVisibility(View.VISIBLE);
            }
        });

        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c8.setVisibility(View.VISIBLE);
            }
        });

        c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c9.setVisibility(View.VISIBLE);
            }
        });

        c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c10.setVisibility(View.VISIBLE);
            }
        });

        c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c11.setVisibility(View.VISIBLE);
            }
        });

        c11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    c12.setVisibility(View.VISIBLE);
            }
        });

        c12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    answer.setVisibility(View.VISIBLE);
            }
        });

        answer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    topleft.setVisibility(View.VISIBLE);
            }
        });



    }
}