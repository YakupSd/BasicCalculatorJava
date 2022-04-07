package com.yakupsd.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberone ;
    EditText numbertwo ;
    TextView resultText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberone = findViewById(R.id.TxtnumberOne);
        numbertwo = findViewById(R.id.TxtnumberTwo);
        resultText = findViewById(R.id.txtResultView);


    }

    public void sum(View view ){//toplama

        if (numberone.getText().toString().matches("")   ||  numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Enter Number Pls !!!");
        }
        else
        {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int value  =0;
            value = number1 + number2;
            resultText.setText("Result : "+value);
        }



    }

    public void extract(View view ){//çıkarma

        if (numberone.getText().toString().matches("")   ||  numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Enter Number Pls !!!");
        }
        else
        {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int value  =0;
            value = number1 - number2;
            resultText.setText("Result : "+value);
        }

    }

    public void plenty(View view ){//bölme

        if (numberone.getText().toString().matches("")   ||  numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Enter Number Pls !!!");
        }
        else
        {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int value  =0;
            value = number1 / number2;
            resultText.setText("Result : "+value);
        }

    }

    public void multiply(View view ){//Çarpma

        if (numberone.getText().toString().matches("")   ||  numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Enter Number Pls !!!");
        }
        else
        {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int value  =0;
            value = number1 * number2;
            resultText.setText("Result : "+value);
        }

    }



}