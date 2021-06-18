package com.example.roomexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText ageEditText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.name);
        ageEditText = findViewById(R.id.age);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager)
                        MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(ageEditText.getWindowToken(), 0);
                Toast.makeText(v.getContext(),
                        "Вы " + nameEditText.getText().toString() +
                                " и Вам " + ageEditText.getText().toString() + " лет",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
