package com.example.configureddialognisimshikootz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adb = new AlertDialog.Builder(this);

    }

    public void ButtonOne(View view) {

    }
}