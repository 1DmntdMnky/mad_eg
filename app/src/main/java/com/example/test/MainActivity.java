package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View v){
        ed1=(EditText)findViewById(R.id.id_length);
        ed2=(EditText) findViewById(R.id.id_answer);

        float num=Float.parseFloat(ed1.getText().toString());
        float converted_value=num*100;
        ed2.setText(Float.toString(converted_value)+"cm");
        if(converted_value>100){
            Toast toast=Toast.makeText(getApplicationContext(),"length>100cm",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void newpage(View v){
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}