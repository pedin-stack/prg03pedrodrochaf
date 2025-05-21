/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Piramede extends SolidoGeometrico {
    @Override
public double obterArea(){
return (base*altura/3) + base*altura; //levando em consideraçao que sera uma piramede de base triangular area das faces laterais + area da base
}

@Override 
public double obterVolume(){

    return (obterArea()* altura)/3;//area da base  x altura / por 3
}

@Override
public String toString(){

return("Piramede - area: "+obterArea()+"\n Piramede - volume"+obterVolume()+"\n");
}
 
}
