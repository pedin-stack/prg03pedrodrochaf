/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Esfera extends SolidoGeometrico {
    @Override
public double obterArea(){
   
return 4*(3.14*(Math.pow(raio,2))); //levando em consideraçao que sera uma piramede de base triangular area das faces laterais + area da base
}

@Override 
public double obterVolume(){

    return (4/3) * 3.14 * Math.pow(raio,3);
}

@Override
public String toString(){

return("Esfera - area: "+obterArea()+"\n Esfera - volume"+obterVolume()+"\n");
}
}
