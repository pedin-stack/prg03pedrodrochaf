/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.Scanner; //poder usar o "scanf"
/**
 *
 * @author Casa
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//criaçao do objeto scanner
        ContaBanco conta = new ContaBanco(0.0, false);//declaraçao objeto conta
        
        System.out.println("=== Area do cliente Bank+ ===");
        
        while (true) {//menu
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Pagar mensalidade");
            System.out.println("5. Fechar conta");
            System.out.println("6. Ver dados da conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    if(conta.getStatus()== true){//verificaçao apra ver se já existe uma conta para este cliente
                    
                        System.out.println("Conta já existente");
                        
                        break;
                    }
                    
                    System.out.print("\nDigite o nome do titular: ");
                    String nome = scanner.nextLine();//armazenando valores de entrada
                    
                    System.out.print("Tipo de conta (cc para corrente/cp para poupança): ");
                    String tipo = scanner.nextLine();//
                   
                    conta.setDono(nome);
                    conta.gerarNumconta();
                    conta.abrirConta(tipo);
                    
                    System.out.println("\nConta criada com sucesso!");
                    System.out.println("Número da conta: " + conta.getNumConta());
                    break;
                    
                case 2:
                    
                    if(conta.getStatus()== false){//verificaçao apra ver se já existe uma conta para este cliente
                    
                        System.out.println("Conta não criada\n");
                        
                        break;
                    }
                    
                    System.out.print("\nValor para depósito: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                    
                case 3:

                    if(conta.getStatus()== false){//verificaçao apra ver se já existe uma conta para este cliente
                    
                        System.out.println("Conta não criada\n");
                        
                        break;
                    }
                    
                    System.out.print("\nValor para saque: R$");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                    
                case 4:
                    
                    if(conta.getStatus()== false){//verificaçao apra ver se já existe uma conta para este cliente
                    
                        System.out.println("Conta não criada\n");
                        
                        break;
                    }
                    
                    conta.pagarMensalidade();
                    break;
                    
                case 5:
                   
                    if(conta.getStatus()== false){//verificaçao apra ver se já existe uma conta para este cliente
                    
                        System.out.println("Conta não criada\n");
                        
                        break;
                    }
                    
                    conta.fecharConta();
                    break;
                    
                case 6:
                    if(conta.getStatus()== false){
                    
                        System.out.println("Conta não criada\n");
                        
                        break;
                    }
                    
                    conta.exibirDadosConta(conta);
                    break;
                    
                case 0:
                    System.out.println("\nSaindo do sistema...\n");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }
    
    

}

