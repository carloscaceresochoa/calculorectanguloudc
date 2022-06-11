package com.udc.tutoriauno.tutoriacartagena.modelo;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(String base,String altura){
        this.base = Integer.valueOf(base);
        this.altura = Integer.valueOf(altura);
    }
   private int area(){
        return base * altura;
    }
    public String areaString(){
        return String.valueOf(area());
    }

}
