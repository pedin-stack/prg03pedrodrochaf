/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;
import java.util.Random;

/**
 *
 * @author Casa
 */
//classe abstrata
abstract class Forma {//para figuras bidimensionais definir 2 dimensoes aleatorias\
    
    Random random =  new Random();
    double base = 10.00;//1.00 + random.nextDouble(10.00);
    double altura = 10.00;//1.00 + random.nextDouble(10.00);
    double raio = 10.00;//1.00 + random.nextDouble(10.00);
    
    public abstract double obterArea(); 
   
    
}

//2D
abstract class FormaGeometrica extends Forma{
}
 //3D
abstract class SolidoGeometrico extends Forma{
     public abstract double obterVolume();
}

class Dimensoes extends Forma{//gambiarra

  @Override
public double obterArea(){
    return base * altura;
}
    
@Override
    public String toString(){
    
    return("BASE: "+base+"\nALTURA: "+altura+"\n");
    }

}