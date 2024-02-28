package com.example.myapplication;

import static java.lang.StrictMath.random;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    TextView mTextView;
    Random random;

    int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button_1);
        mTextView = findViewById(R.id.text_view_1);

        random = new Random();
    }

    @SuppressLint("SetTextI18n")
    public void Click(View view) {
        mTextView.setText(String.valueOf(items[random.nextInt(items.length)]));
    }
}