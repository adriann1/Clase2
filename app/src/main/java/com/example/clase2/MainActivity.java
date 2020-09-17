package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.bt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"El factorial es: "+calc_fac(Integer.parseInt(tv.getText().toString())),Toast.LENGTH_LONG).show();
              //  toast.setDuration(Toast.LENGTH_LONG);
              //  toast.setText(calc_fac(Integer.parseInt(tv.getText().toString())));
              //  toast.show();

            }
        });

    }
    public int  calc_fac(int a ) {
        int r = 1;
        for (int x = 1; x <= a; x++) {
            r =r*x;
        }
        return r;
    }
}