package com.uninorte.calculadoracambiandoactividades_kevinfarfan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity {

    private double primerValor = NaN;
    private double segundoValor;
    private static final char suma = '+';
    private static final char resta = '-';
    private static final char multiplicacion = '*';
    private static final char division = '/';
    private char accion;

    TextView tvSalida;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSalida = findViewById(R.id.editText);
        tvResultado = findViewById(R.id.textView2);
    }

    private void calcular(){
        if(!Double.isNaN(primerValor)){
            segundoValor = Double.parseDouble(tvSalida.getText().toString());
            tvSalida.setText(null);
            if(accion==suma)
                primerValor = this.primerValor + segundoValor;
            else if (accion==resta)
                primerValor = this.primerValor - segundoValor;
        }
        else{
            try{
                primerValor = Double.parseDouble(tvSalida.getText().toString());
            }catch (Exception e){}
        }
    }

    public void onClickCero(View view) {
        tvSalida.setText(tvSalida.getText()+"0");
    }

    public void onClickUno(View view) {
        tvSalida.setText(tvSalida.getText()+"1");
    }

    public void onClickDos(View view) {
        tvSalida.setText(tvSalida.getText()+"2");
    }

    public void onClickTres(View view) {
        tvSalida.setText(tvSalida.getText()+"3");
    }

    public void onClickCuatro(View view) {
        tvSalida.setText(tvSalida.getText()+"4");
    }

    public void onClickCinco(View view) {
        tvSalida.setText(tvSalida.getText()+"5");
    }

    public void onClickSeis(View view) {
        tvSalida.setText(tvSalida.getText()+"6");
    }

    public void onClickSiete(View view) {
        tvSalida.setText(tvSalida.getText()+"7");
    }

    public void onClickOcho(View view) {
        tvSalida.setText(tvSalida.getText()+"8");
    }

    public void onClickNueve(View view) {
        tvSalida.setText(tvSalida.getText()+"9");
    }

    public void onClickMas(View view) {
        calcular();
        accion = suma;
        tvResultado.setText(primerValor+"+");
        tvSalida.setText(null);
    }

    public void onClickMenos(View view) {

        calcular();
        accion = resta;
        tvResultado.setText(primerValor+"-");
        tvSalida.setText(null);
    }

    public void onClickIgual(View view) {
        calcular();
        tvResultado.setText(tvResultado.getText().toString()+segundoValor+"="+primerValor);
        primerValor = NaN;
        accion = '0';
    }

    public void onClickPantallaOperacion(View view) {
    }

    public void onClickComa(View view) {
    }

    public void onClickCe(View view) {
    }

    public void onClickDivision(View view) {
    }

    public void onClickMultiplicacion(View view) {
    }

    public void onClickDel(View view) {
        tvSalida.setText(null);
        tvResultado.setText(null);
        primerValor = NaN;
        segundoValor = NaN;
    }

}
