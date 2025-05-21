/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class Quadrado extends FormaGeometrica {//Herdando as caracteristicas de forma
    @Override
    public double obterArea(){
    return base * base;//lados iguasi
}

@Override
public String toString(){

return("Quadrado - area: "+obterArea()+"\n");
}

}
