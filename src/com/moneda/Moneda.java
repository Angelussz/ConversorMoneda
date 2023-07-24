package com.moneda;

import java.text.DecimalFormat;

public class Moneda {

    protected double valorMoneda;
    protected String nombreMoneda;

    public Moneda(){

    }

    public double getValorMoneda() {
        return valorMoneda;
    }
    public void setValorMoneda(int valorMoneda){
        this.valorMoneda = valorMoneda;
    };
    public String Convertir(double valorLocal){
        DecimalFormat df = new DecimalFormat("#.##");
        double valorConvertido = Double.parseDouble(df.format( this.valorMoneda*valorLocal));
        return "El valor de Soles a "+ this.nombreMoneda + " es "+ valorConvertido;
    }
    public String Local(double valorConvertido){
        DecimalFormat df = new DecimalFormat("#.##");
        double valorLocal = Double.parseDouble(df.format( valorConvertido/this.valorMoneda));
        return "El valor de "+ this.nombreMoneda + " a Soles es: "+ valorLocal;
    }
}
