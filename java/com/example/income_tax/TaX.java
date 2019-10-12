package com.example.income_tax;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TaX extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tax);
        Intent intent1 = getIntent();
        double age = (Double) intent1.getSerializableExtra("age");
        double amount = (Double) intent1.getSerializableExtra("amount");
        double tax = (Double) intent1.getSerializableExtra("tax");

        TextView  a1=(TextView)findViewById(R.id.textView12);
        TextView  a2=(TextView)findViewById(R.id.textView13);
        TextView  a3=(TextView)findViewById(R.id.textView14);

        a1.setText(Double.toString(age));
        a2.setText(Double.toString(amount));
        a3.setText(Double.toString(tax));


    }

}
