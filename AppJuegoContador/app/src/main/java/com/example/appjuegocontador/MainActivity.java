package com.example.appjuegocontador;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador1 =0, contador2=0;
    private TextView textoContador1, textoContador2;
    String ganador;
    Button boton1, boton2,boton3,boton4;
    int valor1=0 , valor2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button)findViewById(R.id.btn_equipo11);
        boton2 = (Button)findViewById(R.id.btn_equipo12);
        boton3 = (Button)findViewById(R.id.btn_equipo21);
        boton4 = (Button)findViewById(R.id.btn_equipo22);

        textoContador1 = (TextView) findViewById(R.id.tv_contador1);
        textoContador2 = (TextView) findViewById(R.id.tv_contador2);

        String texto1 = textoContador1.getText().toString();
        String texto2 = textoContador2.getText().toString();

        valor1 = Integer.parseInt(texto1);
        valor2 = Integer.parseInt(texto2);


    }

    public void showToast(View view){

        if(contador1 > contador2){
            ganador = "EQUIPO 1";
        }
        else if (contador1<contador2){
            ganador ="EQUIPO2";
        }
        else if(contador2==contador1){
            ganador="Ambos Equipos ganaron";
        }

        Toast.makeText(this, "El ganador es"+" " + ganador, Toast.LENGTH_SHORT).show();
    }

    public void countUpEquipo1(View view){
         ++contador1;
         textoContador1.setText(Integer.toString(contador1));

    }
    public void countUpEquipo2 (View view){

        ++contador2;
        textoContador2.setText(Integer.toString(contador2));

    }
    public void countdownEquipo1(View view){


        if(contador1>0){
            --contador1;
        textoContador1.setText(Integer.toString(contador1));
        }
    }
    public void countdownEquipo2 (View view){


        if(contador2>0){
            --contador2;
        textoContador2.setText(Integer.toString(contador2));
        }
    }
}
