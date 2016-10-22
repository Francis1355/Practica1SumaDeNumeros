package com.example.francisco.practica1sumadenumeros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNum;
    private TextView txtRes;
    private Button btnSuma;
    private TextView txtResFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edtNum =(EditText)findViewById(R.id.edtxt1);
        txtRes = (TextView)findViewById(R.id.txtIN);
        btnSuma = (Button)findViewById(R.id.btn1);
        txtResFinal = (TextView)findViewById(R.id.txtIN2);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = edtNum.getText().toString();
                int nro1=Integer.parseInt(valor);
                int suma = nro1*(nro1+1)/2;
                String resul="";
                resul="la suma de los "+ nro1 + " primeros numeros enteros es: "+ suma;
                txtResFinal.setText(resul);

            }



    });






    }



    }







