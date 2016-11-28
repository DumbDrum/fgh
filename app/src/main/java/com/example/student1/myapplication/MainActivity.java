package com.example.student1.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String trueAnswer = R.string.yes;
    String falseAnswer = R.string.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("asdf",String.valueOf(R.string.app_name));
        Log.e("123","Hello world ");
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Кнопка","Нажата кнопка");
                Toast.makeText(MainActivity.this,R.string.toast,Toast.LENGTH_SHORT).show();
            }
        });
        btn.setText("Да");
    }
}
