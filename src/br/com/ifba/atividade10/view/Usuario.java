/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Casa
 */
public class Usuario {
    long id;
    PerfilUsuario perfil;
    String nomeUsuario;
    String email;
    String senha;
    boolean ativo;
    LocalDateTime ultimoLogin;

    //COSTRUCTOR
    
    public Usuario(long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
        this.ultimoLogin = LocalDateTime.now();//armazenar o horario atual
    }
    
    //GETTERS

    public long getId() {
        return id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }
    
    
    //SETTERS

    public void setId(long id) {
        this.id = id;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   private void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
     public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
     
     
    public void criarConta(PerfilUsuario perfil) {
    Scanner scanner = new Scanner(System.in);
    
    if(this.ativo) {
        System.out.println("Conta já criada!\n");
        return;
    }
    
    System.out.println("Digite seu nome:");
    this.nomeUsuario = scanner.nextLine();
    
    System.out.println("Digite seu email:\n");
    this.email = scanner.nextLine();
    
    String senha1, senha2;
    do {
        System.out.println("Defina a senha:");
        senha1 = scanner.nextLine();
        
        System.out.println("Confirme a senha:");
        senha2 = scanner.nextLine();
        
        if(!senha1.equals(senha2)) {
            System.out.println("As senhas não coincidem. Tente novamente.\n");
        }
    } while(!senha1.equals(senha2));
    
    this.senha = senha1;  // ESTA LINHA É CRUCIAL - ARMAZENA A SENHA
    this.perfil = perfil;
    this.id = 1000 + new Random().nextInt(8999); // IDs de 1000 a 9999
    this.ativo = true;
    System.out.println("Conta criada com sucesso!");
}
    
    public boolean usuarioLogar(String senha){
       
          if(this.senha.equals(senha)==true){
          
              System.out.println("Login efetuado com sucesso!\n");
               this.ultimoLogin = LocalDateTime.now();//registrar horario do ultimo login
              return  true;
              
          } else{
              System.out.println("Senha incorreta. Tente novamente");
          }
        return false;
    }
    //para as funçoes que ele precisa estar logado usar esta funçao para ver sua validaçao 
   

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", perfil=" + perfil + ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha=" + senha + ", ativo=" + ativo + ", ultimoLogin=" + ultimoLogin + '}';
    }
     private LogAuditoria[] atividades = new LogAuditoria[100];
    private int numAtividades = 0; 
    
    
    public void registrarAtividade(String acao, String ip) {
    
     LogAuditoria log = new LogAuditoria(numAtividades + 1, this,acao,LocalDateTime.now(),ip);//criaçao de novo objeto
    
    atividades[numAtividades] = log;
    numAtividades++;//aumenta num de atividade
}
    
    public void imprimirAtividades() {
    if (numAtividades == 0) {
        System.out.println("Nenhuma atividade registrada para este usuário.");
        return;
    }

    System.out.println("\n=== HISTÓRICO DE ATIVIDADES ===");
    System.out.println("Usuário: " + this.nomeUsuario);
    System.out.println("Total de atividades: " + numAtividades + "\n");
    
    for (int i = 0; i < numAtividades; i++) {
        LogAuditoria log = atividades[i];
        System.out.println("ID: " + log.getId());
        System.out.println("Data/Hora: " + log.getDataHora());
        System.out.println("Ação: " + log.getAcao());
        System.out.println("IP: " + log.getIp());
        System.out.println("---------------------------");
    }
}
}
