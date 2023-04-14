package com.example.hw_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AppCompatButton button;
    EditText editText;
    EditText editTextTwo;
    EditText editTextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClicks();

    }


    private void findViews() {
        button = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        editTextTwo = findViewById(R.id.editTextTwo);
        editTextThree = findViewById(R.id.editTextThree);
    }

    private void setClicks() {
        button.setOnClickListener(view -> {
            if (!editText.getText().toString().isEmpty() && !editTextTwo.getText().toString().isEmpty() && !editTextThree.getText().toString().isEmpty()) {
                navigateToSecond(editText.getText().toString(), editTextTwo.getText().toString(), editTextThree.getText().toString());
            } else {
                System.out.println("write your name");
            }
        });
    }

    private void navigateToSecond(String name, String nameTwo, String nameThree) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("name2", nameTwo);
        intent.putExtra("name3", nameThree);
        startActivity(intent);
    }
}