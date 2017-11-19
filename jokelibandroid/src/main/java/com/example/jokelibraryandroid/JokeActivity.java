package com.example.jokelibraryandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String suppliedJoke = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_tv);
        jokeTextView.setText(suppliedJoke);
    }
}