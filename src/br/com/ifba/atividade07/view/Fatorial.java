/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Casa
 */
public class Fatorial {
    
    private int fatoriado = 0;
    private String formulafatorial = "";
    private int fatorial=1;//iniciar com valor neutro da multiplicação
        
    public void setValor(int valor){
    
    fatoriado = valor;
    
    }
    
   public int getFatorial(){
    
        for(int i = 2; i <= fatoriado; i++) { //fatorial sem recursão
            fatorial *= i; 
        }
    
    return fatorial;
    
    }
   
   public String getFormula(){
       
        
       formulafatorial  = Integer.toString(fatoriado);
        
        for(int i=fatoriado-1;i>=1;i--){
           
            String Temp = Integer.toString(i);
            
            formulafatorial =formulafatorial + " X " + Temp;//atualizar a formula para cada termo
            
        }
            formulafatorial = formulafatorial + " = " + Integer.toString(getFatorial());//chamar a funçao dentro do integer, se colocar apenas "fatorial" ele nao atualiza
        
        return formulafatorial;
    }
} 

