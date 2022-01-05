package com.example.customizedtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"first toast",Toast.LENGTH_LONG).show();
                showToast();
            }
        });
    }

    public void showToast()
    {
        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.lay));

        Toast toast =new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();

    }
}