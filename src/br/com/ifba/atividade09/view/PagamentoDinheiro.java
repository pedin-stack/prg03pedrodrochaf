/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;//para conseguir usar borderlayout
/**
 *
 * @author Casa
 */

   
public class PagamentoDinheiro implements Pagamento {
    
    @Override//"Este método não é novo; estou sobrescrevendo um existente."
    public double calcularTotal(double valor) {
        return valor * 0.9; // 10% de desconto
    }

    @Override
    public void imprimirRecibo(double valor, double valorfinal,String metododepagamento) {
        //formatando para 2 casas decimais
      String subtotalFormatado = String.format("R$ %.2f", valor);
     String totalFormatado = String.format("R$ %.2f", valorfinal);
         
//criando outra interface grafica para o recibo
      
    JFrame frame =  new JFrame("Nota Fiscal");
    
    frame.setSize(500 , 350);//defininido tamnho
         
        String notafiscal = "<html>Pagamento efetuado com sucesso<br><br>Sub-total: " + subtotalFormatado + "<br>Total: " + totalFormatado + "<br>" + metododepagamento + "</html>";
        
        JLabel lblRecibo = new JLabel(notafiscal);//criando label para por estas informações
        frame.add(lblRecibo, BorderLayout.CENTER); // Adiciona o label ao frame
        lblRecibo.setHorizontalAlignment(JLabel.CENTER);//centralizando texto
        
       frame.setLocationRelativeTo(null); // centralizar a janela na tela
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas esta janela
     frame.setVisible(true);//tornar a janela visivel
        
     }
      
    }
   

