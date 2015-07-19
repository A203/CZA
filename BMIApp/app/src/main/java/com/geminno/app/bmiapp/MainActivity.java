package com.geminno.app.bmiapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Button button;
//    TextView show;
    EditText height,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
//        show=(TextView)findViewById(R.id.show);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        button.setOnClickListener(new View.OnClickListener() {
          double bmi=0;
            @Override
            public void onClick(View v) {
                double h=new Double(height.getText().toString());
                double w=new Double(weight.getText().toString());
                bmi=w/((h/100)*(h/100));
                String s ;
                if (bmi<16){
                    s="亲~太瘦了，注意营养哦！";
                }else if(bmi<18.5){
                    s="亲~有点儿瘦，请加营养!";
                }else if(bmi<25){
                    s="亲~体重正常，要保持哦!";
                    } else if(bmi<30){
                    s="亲~有点儿胖，请注意饮食哦！";
                }else if (bmi<35){
                    s="亲~你体重肥胖，请注意饮食哦!";
                }else if (bmi<40){
                    s="亲~重度肥胖，要节食哦!";
                }else{
                  s="亲~极度肥胖，请节食!";
                }
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                intent.putExtra("name", s);
                startActivity(intent);





            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
