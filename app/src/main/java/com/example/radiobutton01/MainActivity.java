package com.example.radiobutton01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   RadioButton rb1,rb2,rb3,rb4;
   Button btn01;
   String str = "is Selected";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.rb01);
        rb2 = (RadioButton) findViewById(R.id.rb02);
        rb3 = (RadioButton) findViewById(R.id.rb03);
        rb4 = (RadioButton) findViewById(R.id.rb04);
        btn01 = (Button) findViewById(R.id.btn);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()){
                    Toast.makeText(MainActivity.this,"Radio Button 1 From Single Radio Button"+str,
                            Toast.LENGTH_LONG).show();
                }
                if(rb2.isChecked()){
                    Toast.makeText(MainActivity.this,"Radio Button 2 From Single Radio Button"+str,
                            Toast.LENGTH_LONG).show();
                }
                if(rb3.isChecked()){
                    Toast.makeText(MainActivity.this,"Male From Radio Button inside RadioGroup"+str,
                            Toast.LENGTH_LONG).show();
                }
                if(rb4.isChecked()){
                    Toast.makeText(MainActivity.this,"Female From Radio Button inside RadioGroup"+str,
                            Toast.LENGTH_LONG).show();
                }
                if(rb1.isChecked() == false && rb2.isChecked() == false && rb3.isChecked() == false &&
                        rb4.isChecked() == false ){
                    Toast.makeText(MainActivity.this,"Please Select Any RadioButton",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}