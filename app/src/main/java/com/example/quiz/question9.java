package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class question9 extends AppCompatActivity {
    int timesclicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        c7 = findViewById(R.id.checkBox7);
        c8 = findViewById(R.id.checkBox8);
        TextView sentence = findViewById(R.id.sentence);
        Button reset =findViewById(R.id.reset);
        Button sumbit = findViewById(R.id.submit);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sentence.setText("");
                c1.setChecked(false);
                c2.setChecked(false);
                c3.setChecked(false);
                c4.setChecked(false);
                c5.setChecked(false);
                c6.setChecked(false);
                c7.setChecked(false);
                c8.setChecked(false);
                timesclicked =0;
            }
        });

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timesclicked==8) {
                    Toast.makeText(question9.this, "CORRECTT", Toast.LENGTH_SHORT).show();
                    Intent x = new Intent(question9.this,question10.class);
                    startActivity(x);
                }
            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c1.getText().toString() + " ");
                    order(1);
                }
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c2.getText().toString() + " ");
                    order(2);
                }
            }
        });

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c3.getText().toString() + " ");
                    order(3);
                }
            }
        });

        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c4.getText().toString() + " ");
                    order(4);
                }
            }
        });

        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c5.getText().toString() + " ");
                    order(5);
                }
            }
        });

        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c6.getText().toString() + " ");
                    order(6);
                }
            }
        });

        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c7.getText().toString() + " ");
                    order(7);
                }
            }
        });

        c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    sentence.setText(sentence.getText().toString() + c8.getText().toString() + " ");
                    order(8);
                }
            }
        });

    }

    public void order(int id){
        int pass[] = {4,6,5,8,3,1,2,7};
        if(pass[timesclicked] == id)
            timesclicked++;
        else
            timesclicked=0;


    }
}