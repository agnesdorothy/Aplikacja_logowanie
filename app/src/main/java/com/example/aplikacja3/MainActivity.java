package com.example.aplikacja3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPassword);

    }


    public void onButtonClick(View view) {
        if ((editText.getText().toString().length() != 0) && (editText2.getText().toString().length() != 0)) {

            String login = editText.getText().toString();

            String haslo = editText.getText().toString();

            Toast.makeText(this, "Login: " + login + ", hasło: " + haslo, Toast.LENGTH_LONG).show();
            imageView.setVisibility(View.VISIBLE);
        }else {
        Toast.makeText(this, "Wpisz login i hasło, aby przejść dalej!", Toast.LENGTH_LONG).show();
        }
    }

}