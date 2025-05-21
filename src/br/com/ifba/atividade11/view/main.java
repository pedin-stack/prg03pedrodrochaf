/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Casa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Forma [] formas = new Forma[7];//criando o array de objetos
       
       formas[0] = new Quadrado();//crio um objeto de cada tipo de forma geometrica
       formas[1] = new Cubo();
       formas[2] = new Triangulo();
       formas[3] = new Piramede();
       formas[4] = new Circulo();
       formas[5] = new Esfera();
       formas[6] = new Dimensoes();
       
        for(int i=0;i<7;i++){
        
            System.out.println(formas[i]);
        }
    }
    
}
