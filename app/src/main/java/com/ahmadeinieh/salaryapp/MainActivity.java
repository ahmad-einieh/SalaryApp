package com.ahmadeinieh.salaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button salary;
    EditText t1, t2, t3;
    TextView v1;

    String st;
    int ex;
    int age;

    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salary = (Button) findViewById(R.id.salary);
        t1 = (EditText) findViewById(R.id.st);
        t2 = (EditText) findViewById(R.id.ex);
        t3 = (EditText) findViewById(R.id.age);
        v1 = (TextView) findViewById(R.id.re);


        salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                st = t1.getText().toString();
                ex = Integer.parseInt(t2.getText().toString());
                age = Integer.parseInt(t3.getText().toString());
                if (st.equalsIgnoreCase("m")) {
                    if (ex < 3) {
                        result = 1500 + (ex * 50) + (age * 150);
                    } else if (ex >= 3 && ex < 6) {
                        result = 1800 + (ex * 50) + (age * 150);
                    } else if (ex >= 6) {
                        result = 1800 + (ex * 150) + (age * 150);
                    } else {
                        Toast.makeText(MainActivity.this, "invalid value", Toast.LENGTH_SHORT).show();
                    }
                } else if (st.equalsIgnoreCase("s")) {
                    if (age < 3) {
                        result = 1500 + (ex * 50) + (age * 150);
                    } else if (age >= 3 && age < 6) {
                        result = 1800 + (ex * 50) + (age * 150);
                    } else if (age >= 6) {
                        result = 1800 + (ex * 150) + (age * 150);
                    } else {
                        Toast.makeText(MainActivity.this, "invalid value", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "m or s", Toast.LENGTH_SHORT).show();

                }
                v1.setText("your salary is: " + result + " $");
                //Toast.makeText(MainActivity.this, t1.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}