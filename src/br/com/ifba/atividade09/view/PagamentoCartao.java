/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Casa
 */
public class PagamentoCartao implements Pagamento { // 
    
    @Override
     public double calcularTotal(double valor) {
         valor = valor *1.05;
        return valor; // 5% de taxa
    }
     
     @Override
     public  void imprimirRecibo(double valor, double valorfinal,String metododepagamento){
     //formatando para 2 casas decimais
      String subtotalFormatado = String.format("R$ %.2f", valor);
    String totalFormatado = String.format("R$ %.2f", valorfinal);
         
//criando outra interface grafica para o recibo
      
    JFrame frame =  new JFrame("Nota Fiscal");
    
    frame.setSize(500 , 350);//defininido tamnho
         
        String notafiscal = "<html>Pagamento efetuado com sucesso<br><br>Sub-total R$ " + subtotalFormatado + "<br>Total R$ " + totalFormatado + "<br>" + metododepagamento + "</html>";
        
        JLabel lblRecibo = new JLabel(notafiscal);//criando label para por estas informações
         frame.add(lblRecibo, BorderLayout.CENTER); // Adiciona o label ao frame
        lblRecibo.setHorizontalAlignment(JLabel.CENTER);//centralizando texto
        
       frame.setLocationRelativeTo(null); // centralizar a janela na tela
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas esta janela
     frame.setVisible(true);//tornar a janela visivel
        
     }
    
}
