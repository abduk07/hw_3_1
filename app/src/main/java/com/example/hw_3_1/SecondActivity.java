package com.example.hw_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewTwo;
    TextView textViewThree;
    TextView textViewFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        setText();

    }

    private void setText() {
        String name = getIntent().getStringExtra("name");
        String nameTwo = getIntent().getStringExtra("name2");
        String nameThree = getIntent().getStringExtra("name3");

        textViewTwo.setText(name.toString());
        textViewThree.setText(nameTwo.toString());
        textViewFour.setText(nameThree.toString());

    }


    private void findViews() {
        textViewTwo = findViewById(R.id.textViewTwo);
        textViewThree = findViewById(R.id.textViewThree);
        textViewFour = findViewById(R.id.textViewFour);
    }

}