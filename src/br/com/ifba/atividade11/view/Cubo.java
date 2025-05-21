/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Cubo extends SolidoGeometrico {
     @Override
    public double obterArea(){
    
    return 6 * (Math.pow(base, 2)); //calculo da area superficial do cubo
    }
    
  @Override 
 public double obterVolume(){
     
        return Math.pow(base,3);
}
 
 @Override
public String toString(){

return("Cubo - area: "+obterArea()+"\n Cubo - volume"+obterVolume()+"\n");
}
}
