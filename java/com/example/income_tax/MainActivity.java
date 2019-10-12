package com.example.income_tax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void image1(View v){
        int a=0;
        Intent i1= new Intent(MainActivity.this,image1.class);
        i1.putExtra("a",+a);
        startActivity(i1);
    }
    public void image2(View v){
        int a=0;
        Intent i2= new Intent(MainActivity.this,imag2.class);
        i2.putExtra("a",+a);
        startActivity(i2);
    }
    public void image3(View v){
        int a=0;
        Intent i3= new Intent(MainActivity.this,image3.class);
        i3.putExtra("a",+a);
        startActivity(i3);
    }


}
