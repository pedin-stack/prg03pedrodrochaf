/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;
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

class Quadrado extends FormaGeometrica{

@Override
public double obterArea(){
    return base * base;//lados iguasi
}

@Override
public String toString(){

return("Quadrado - area: "+obterArea()+"\n");
}

}
class Cubo extends SolidoGeometrico{

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

class Triangulo extends FormaGeometrica{

@Override
 public double obterArea(){
 
     return (base * altura) / 2;
 }
    
 @Override
public String toString(){

return("Triangulo - area: "+obterArea()+"\n");
}
 
}

class Piramede extends SolidoGeometrico{

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

class Circulo extends FormaGeometrica{

@Override
public double obterArea(){

return 3.14* Math.pow(raio,2); //area do criculo
}

@Override
public String toString(){

return("Circulo - area: "+obterArea()+"\n");
}

}

class Esfera extends SolidoGeometrico{
    
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