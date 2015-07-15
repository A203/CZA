package com.geminno.app.bmiapp1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button btn;
    private EditText height;
    private EditText weight;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)findViewById(R.id.button);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        show=(TextView)findViewById(R.id.show);
        button.setOnClickListener(new View.OnClickListener() {
            double bmi=0;
            public void onClick(View v) {
                double h=new Double(height.getText().toString());
                double w=new Double(weight.getText().toString());
                bmi=w/((h/100)*(h/100));
//                double final_resault= exchangeResault(bmi);
                double final_resault=bmi;
                if(bmi<16){
                    show.setText("Your BMI is"+final_resault+"极度偏瘦，注意营养");
                }else if(bmi<18.5){
                    show.setText("Your BMI is"+final_resault+"偏瘦");
                }else if(bmi<25){
                    if(bmi==22) {
                        show.setText("Your BMI is" + final_resault + "体重健康，为最理想BMI指数");
                    }else{
                        show.setText("Your BMI is"+final_resault+"体重健康，注意保持");
                    }
                }else if(bmi<30){
                    show.setText("Your BMI is"+final_resault+"体重偏胖，注意饮食");
                }else if (bmi<35){
                    show.setText("Your BMI is"+final_resault+"体重肥胖，注意饮食");
                }else if (bmi<40){
                    show.setText("Your BMI is"+final_resault+"体重重度肥胖，请节食");
                }else{
                    show.setText("Your BMI is"+final_resault+"体重极度肥胖，请节食");
                }

            }
        });


    }



//    public double exchangeResault(double resault){
//        double first=resault*100;
//        double second=(int )first;
//        double second_first=first-second;
//
//        if(second_first>0.5){
//            second++;
//
//
//
//        }
//
//        double jirnuo=(double)second/100;
//        return jirnuo;


//    }


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
