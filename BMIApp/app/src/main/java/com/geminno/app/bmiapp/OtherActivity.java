package com.geminno.app.bmiapp;

import android.content.Intent;
import android.net.ParseException;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/7/15 0015.
 */
public class OtherActivity extends ActionBarActivity {
//   TextView show;
//    EditText height,weight;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
//        show=(TextView)findViewById(R.id.show);
//        height=(EditText)findViewById(R.id.height);
//        weight=(EditText)findViewById(R.id.weight);
        Intent intent=getIntent();
//        String string = intent.getData().toString();
//        double b = Double.valueOf(string);
        String name=intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        button1=(Button)findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(OtherActivity.this,ThirdActivity.class);
                startActivity(intent1);
            }
        });





    }
}

