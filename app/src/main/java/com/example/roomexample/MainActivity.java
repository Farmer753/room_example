package com.example.roomexample;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


import java.io.IOException;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.println("нажат");
                Toast.makeText(v.getContext(), "Вы " + name + " и Вам " + age + " лет", Toast.LENGTH_LONG).show();
                Snackbar.make(v, "привет2", 3000).show();
            }
        });
    }
}
