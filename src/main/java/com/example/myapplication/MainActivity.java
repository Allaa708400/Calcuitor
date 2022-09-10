package com.example.myapplication;
import static java.lang.String.format;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    float a, b, c;
    String ScreenText, Sign, Signed, CalcResult;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
        Signed = "0";
        ScreenText = "";
        CalcResult = "0";
        }
    public void OnClickNumbers(View view) {
        CalcResult = "0";
        if (Signed.equals("0")) {
            Button button = (Button) view;
            ScreenText += button.getText().toString();
            textView.setText(ScreenText);
            a = Float.parseFloat(ScreenText);
        } else {
            Button button = (Button) view;
            ScreenText += button.getText().toString();
            textView.setText(ScreenText);
            b = Float.parseFloat(ScreenText);
        }
    }
        public void OnClickSign (View view)
        {
            Button button = (Button) view;
            Sign = button.getText().toString();
            textView.setText(Sign);
            Sign = "1";
            ScreenText="";
        }
        public void OnClickClack (View view) {

            Button button = (Button) view;
            switch (Sign) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "x":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
            }

            CalcResult = Float.toString(c);
           textView.setText(CalcResult);

                ScreenText = "0";
                Signed = "0";

        }
        public void Reset (View view)
          {
              Button button =(Button)view;
              ScreenText="";
              Signed="";
              CalcResult="";
              textView.setText("");

          }
          }




   








