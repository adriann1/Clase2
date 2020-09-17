package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Forms extends AppCompatActivity {
    private EditText edit_1;
    private EditText edit_2;
    private EditText edit_3;
    private Button btn_1;
    private ListView lv_1;

    ArrayAdapter <String> ad;
  ArrayList al = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);
        lv_1 = findViewById(R.id.lv1);


        btn_1 = findViewById(R.id.bt1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listar();
            }
        });
    }



    public void listar() {
        edit_1 = findViewById(R.id.et1);
        edit_2 = findViewById(R.id.et2);
        edit_3 = findViewById(R.id.et3);

        al.add(edit_1.getText().toString());
        al.add(edit_2.getText().toString());
        al.add(edit_3.getText().toString());
        ad=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,al );
        lv_1.setAdapter(ad);

    }

}