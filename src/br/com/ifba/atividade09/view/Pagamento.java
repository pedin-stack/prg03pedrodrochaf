/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Casa
 */
public interface Pagamento {//como se fosse um "pai" onde seus "filhos" herderão isso, mas, adaptando a sua maneira
        
    double calcularTotal(double valor);
    void imprimirRecibo(double valor, double valorfinal,String metododepagamento);

}
