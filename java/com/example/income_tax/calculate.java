package com.example.income_tax;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class calculate extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
        Intent intent1 = getIntent();
        int a = (int) intent1.getSerializableExtra("a");

    }
    public void calculate1(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);

        double age = Double.parseDouble(e1.getText().toString());
        double amount = Double.parseDouble(e2.getText().toString());
        double tax=0;
        if(age<60){
            if(amount<=250000){
                tax=0;
            }
            else if(amount<=500000&& amount>250000){
                tax=(amount*10)/100;
            }
            else if(amount<=1000000&&amount>500000){
                tax=(amount*20)/100;
            }
            else {
                tax=(amount*30)/100;
            }

        }
        else if(age>60&&age<=80){
            if(amount<=300000){
                tax=0;
            }
            else if(amount<=500000&& amount>300000){
                tax=(amount*10)/100;
            }
            else if(amount<=1000000&&amount>500000){
                tax=(amount*20)/100;
            }
            else {
                tax=(amount*30)/100;
            }

        }
        else
        {
            if(amount<=500000){
                tax=0;
            }
            else if(amount<=1000000&&amount>500000){
                tax=(amount*20)/100;
            }
            else {
                tax=(amount*30)/100;
            }
        }

        Intent i5= new Intent(calculate.this,TaX.class);
        i5.putExtra("age",+age);
        i5.putExtra("amount",+amount);
        i5.putExtra("tax",+tax);
        startActivity(i5);
    }
}