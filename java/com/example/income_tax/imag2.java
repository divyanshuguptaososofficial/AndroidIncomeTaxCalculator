package com.example.income_tax;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class imag2 extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image2);
        Intent intent1 = getIntent();
        int a = (int) intent1.getSerializableExtra("a");

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        TextView t1= (TextView)findViewById(R.id.textView3);
        t1.setText("INCOME TAX BAR");
        image.setImageResource(R.drawable.image2);
    }
    public void calculate(View v){
        int a=0;
        Intent i5= new Intent(imag2.this,calculate.class);
        i5.putExtra("a",+a);
        startActivity(i5);
    }

}
