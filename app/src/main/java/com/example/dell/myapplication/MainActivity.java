package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText)findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
    }
    //Metodo para el boton
    public void Sumar(View view)
    {
        String valor1;
        String valor2;
        String Resultado;
        int Valor1,Valor2,Suma;

        valor1=et1.getText().toString();
        valor2=et2.getText().toString();
        Valor1=Integer.parseInt(valor1);
        Valor2=Integer.parseInt(valor2);
        Suma=Valor1+Valor2;
        Resultado=String.valueOf(Suma);
        tv3.setText(Resultado);
    }
}
