/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.Random;//poder usar o random
/**
 *
 * @author Casa
 */
public class ContaBanco {
    
        public String numConta;
        protected String tipoConta;
        private String dono;
        private double saldo;
        private boolean status; //true conta funcionando | False connta inativa

        //constructor
        
    public ContaBanco(double saldo, boolean status) {
        this.saldo = saldo;
        this.status =status;
    }
        
      //GETTERS
        
    public String getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean getStatus(){
        return status;
    }

    //SETTERS
    
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
        
    //metodos especificos
    
        public void abrirConta(String tipo){
            
            if(this.status == true){//verificar existencia da conta
            
                System.out.println("Conta já existente\n");
                return;
            }
        
            this.status = true;//abrindo conta
            
            setTipoConta(tipo);
            
            if((tipo.equals("cc")) ==  true ){//se a conta for corrente recebe 150
            
                this.saldo+=150;//incremento de 150
                System.out.println("Conta corrente criada! aqui esta um presente de R$ 150,00\n");
                
            } else { // se for poupança
                
            this.saldo+=50;//incremento
            
             System.out.println("Conta poupança criada! aqui esta um presente de R$ 50,00\n");
            
            }
            
        }
        
        public void fecharConta(){
        
        if(this.status == false){//verificar existencia da conta
        
            System.out.println("Conta já encerrada!\n");
            
            return;
        
        } else if(this.saldo > 0){//se houver dinheiro na conta interrompe o processo de fechar conta
        
            System.out.println("Não é possível fechar a conta, por favor saque o dinheiro remanescente na mesma\n");
            
        } else if(this.saldo < 0){
        
            System.out.println("Não é possível fechar a conta estando inadimplente, por favor quite seus débitos antes de fechar a conta\n");
            
        }   else {
        
        this.status = false; //atendendo a todos os requisitos a conta é encerrada
        
            System.out.println("Conta encerrada com êxito\n");
            
        }
       }
        
        public void depositar(double valordeposito){
            
       if(valordeposito > 0){
        
           this.saldo = this.saldo + valordeposito; // incrementar ao valor do saldo o valor do depoisto
            System.out.println("Depósito de R$" + valordeposito + " realizado com sucesso na conta de " + this.dono);
           
       }else{//caso ponha valor menor que 1
       
           System.out.println("Este valor é inválido!\n");
       
       }
      }
        
        public void sacar(double valorsaque){
        
        if(this.status == false){//verificar existencia da conta
        
            System.out.println("Impossível sacar em uma conta não aberta!\nPor favor crie uma\n");
            return;
        }
        if(valorsaque > 0){
            if(valorsaque <= this.saldo){// o valor do saque tem que ser no máximo igual ao do saldo
        
        this.saldo = this.saldo -  valorsaque; // toda vez que eu saco dinheiro atualiza o saldo
        
        System.out.println("Saque de R$" + valorsaque + " realizado com sucesso na conta de " + this.dono);
         
            } else {
            
                System.out.println("Valor na conta insuficiente para saque\n");
                
            }
            } else {
        
            System.out.println("Este valor é inválido!\n");
            
            }
        }
        
        public void pagarMensalidade(){
        
        if(this.status == false){//verificar existencia da conta
        
            System.out.println("Impossível sacar em uma conta não aberta!\nPor favor crie uma\n");
            return;
        }
        
        if((this.tipoConta.equals("cc"))==true){//sendo corrente cria variavel que vai setar o valor da taxa em 12
            
        double taxa = 12.f;
            
        System.out.println("Mensalidade de R$" + taxa + " debitada da conta de " + this.dono);
        
        } else {
            
        double taxa = 20.f;
        
        System.out.println("Mensalidade de R$" + taxa + " debitada da conta de " + this.dono);
        
        }
        
        }
        
        public void gerarNumconta(){
            
        
        Random random = new Random();  // criar objeto random
        
       int numcontaint  = 100 + random.nextInt(999);//gerar um código aleatório de 3 digitos
       
       this.numConta = String.format("%03d", numcontaint);//para formatar o código em 001 / 002 / 003 e assim sucessivamente
        
    }
        
       public static void exibirDadosConta(ContaBanco conta) {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println("Número: " + conta.getNumConta());
        System.out.println("Tipo: " + (conta.getTipoConta().equals("cc") ? "Conta Corrente" : "Conta Poupança"));
        System.out.println("Titular: " + conta.getDono());
        System.out.println("Saldo: R$" + conta.getSaldo());
        System.out.println("Status: " + (conta.getStatus() ? "Ativa" : "Inativa"));
    }
}
        
