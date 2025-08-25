/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Triangulo extends FormaGeometrica {
    @Override
 public double obterArea(){
 
     return (base * altura) / 2;
 }
    
 @Override
public String toString(){

return("Triangulo - area: "+obterArea()+"\n");
}
}
