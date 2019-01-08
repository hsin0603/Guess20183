package com.fju.guess2018;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n = 1;
    int w = 100;
    private EditText num;
    int r = new Random().nextInt(100);
    String a = String.valueOf(r);
    

    public TextView getSecr() {
        TextView secr = findViewById(R.id.secret);
        secr.setText(a);
        return secr;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void send (View view){
            num = findViewById(R.id.number);
            String number = num.getText().toString();
            int numb = Integer.parseInt(number);

            TextView secret = findViewById(R.id.secret);

            if (numb == r) {
                new AlertDialog.Builder(this)
                        .setMessage("Yes, the number is " + numb)
                        .setTitle("right")
                        .setPositiveButton("OK", null)
                        .show();
            }else {
                if (numb < r) {
                    new AlertDialog.Builder(this)
                            .setMessage(numb + "to " + w)
                            .setTitle("no")
                            .setPositiveButton("OK", null)
                            .show();
                   n = (int) numb;
                } else{
                   if (numb > r) {
                        new AlertDialog.Builder(this)
                                .setMessage(n + " to  " + numb)
                                .setTitle("no")
                                .setPositiveButton("OK", null)
                                .show();
                       w = (int) numb;
                    }
                }

            }
    }
}


