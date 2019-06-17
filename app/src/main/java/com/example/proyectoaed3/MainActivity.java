package com.example.proyectoaed3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    private TextView tv1, tv2;
    private ListView lv1;
    private String[] lista={"Ingresos: ", "Egresos: ", "Gastos con Tarjeta: "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date date=new Date();


        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        lv1=(ListView)findViewById(R.id.lv1);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lista);
        lv1.setAdapter(adapter);
        SimpleDateFormat fecha=new SimpleDateFormat("d MMMM 'del' yyyy");
        String sFecha=fecha.format(date);
        tv1.setText(sFecha);
    }

    public void ingresos(View view){
        Intent i=new Intent(this, Ingresos.class);
        startActivity(i);

    }
    public void egresos(View view){
        Intent i=new Intent(this, Egresos.class);
        startActivity(i);

    }
    public void detalle(View view){
        Intent i=new Intent(this, Detalle.class);
        startActivity(i);

    }





}
