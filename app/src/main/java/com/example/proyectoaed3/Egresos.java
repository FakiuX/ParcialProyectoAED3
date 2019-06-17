package com.example.proyectoaed3;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Egresos extends AppCompatActivity {

    private TextView tvIngreso, tvMonto, tvConcepto, tvFecha, tvCategoria ;
    private EditText etMonto;
    private Spinner spConcepto, spCategoria;
    private Button btnFecha, btnAceptar, btnCancelar;
    private int dia, mes, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egresos);

        tvIngreso=(TextView)findViewById(R.id.tvIngreso);
        tvMonto=(TextView)findViewById(R.id.tvMonto);
        tvConcepto=(TextView)findViewById(R.id.tvConcepto);
        tvFecha=(TextView)findViewById(R.id.tvFecha);
        tvCategoria=(TextView)findViewById(R.id.tvCategoria);
        etMonto=(EditText) findViewById(R.id.etMonto);
        spConcepto=(Spinner) findViewById(R.id.spConcepto);
        String []conceptos={"Sueldo","Prestamo","Otros"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, conceptos);
        spConcepto.setAdapter(adapter);
        spCategoria=(Spinner) findViewById(R.id.spCategoria);
        String []categorias={"Alquiler","Mercado","Transporte","Impuestos","Servicios","Esparcimiento","Otros"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, categorias);
        spCategoria.setAdapter(adapter2);
    }
    public void calendar(View v){
        final Calendar c=Calendar.getInstance();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        ano=c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tvFecha.setText(dayOfMonth + "/" + (month+1) + "/" + year);

            }
        }
                , dia,mes,ano);
        datePickerDialog.show();
    }


    public void salir(View v) {
        finish();
    }
}
