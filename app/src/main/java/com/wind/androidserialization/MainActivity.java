package com.wind.androidserialization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.bt_click);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User("Simon","222222");
                Intent intent=new Intent(MainActivity.this, SerializableActivity.class);
                intent.putExtra("Simon",user);
                startActivity(intent);
            }
        });
        button2=findViewById(R.id.bt_click2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person=new Person("Simon",23);
                Intent intent2=new Intent(MainActivity.this, SerializableActivity.class);
                intent2.putExtra("Simon",person);
                startActivity(intent2);
            }
        });
    }


}
