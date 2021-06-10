package com.example.roomexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String getName() {
        EditText editText = findViewById(R.id.name);
        String content = editText.getText().toString();
        String name;
        try {
            name = Integer.toHexString(int i);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this,"ошибка ввода возраста: "+ e.getMessage(), Toast.LENGTH_SHORT).show();
            name = a;
        }
        return name;
    }

    int getAge() {
        EditText editText = findViewById(R.id.age);
        String content = editText.getText().toString();

        int age;
        try {
            age = Integer.parseInt(content);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this,"ошибка парсинга строки: "+ e.getMessage(), Toast.LENGTH_LONG).show();
            age = 0;
        }
        return age;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}