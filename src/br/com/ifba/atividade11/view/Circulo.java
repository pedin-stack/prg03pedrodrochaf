/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Circulo extends FormaGeometrica {
    
    @Override
public double obterArea(){

return 3.14* Math.pow(raio,2); //area do criculo
}

@Override
public String toString(){

return("Circulo - area: "+obterArea()+"\n");
}
    
}
