package com.udc.tutoriauno.tutoriacartagena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.udc.tutoriauno.tutoriacartagena.modelo.Rectangulo;

public class MainActivity extends AppCompatActivity {
    private EditText basetext;
    private EditText alttext;
    private TextView restext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponente();
    }
    /**
     * metodo para asociar componente con el layout
     */
    public void inicializarComponente(){
        basetext = findViewById(R.id.basetext);
        alttext = findViewById(R.id.alttext);
        restext = findViewById(R.id.restext);
    }
    public void calcularEvento(View view ){
        String base = basetext.getText().toString();
        String altura = alttext.getText().toString();
        Rectangulo rectangulo = new Rectangulo(base,altura);
        restext.setText(rectangulo.areaString());

    }
}