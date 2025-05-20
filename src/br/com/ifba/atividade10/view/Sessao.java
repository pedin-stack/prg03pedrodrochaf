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
public class Sessao {
    long id;
    Usuario usuario;
    String token;
    
    
    //CONSTRUCTOS

    public Sessao(long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = gerarToken();
    }

    //GETTERS

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }
    
    //SETTERS

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
      
     private String gerarToken(){//se houver alteraçao em como há a geraçao de tokne enquanto o programa funciona a chance de houver problemas é grande
      
          Random random = new Random();
          
       long indentificador =  100+random.nextLong(999);//num aleatorio de 3 digitos
       
        this.token = "Sessao_"+indentificador;  
          
          return this.token;
      }

    @Override
    public String toString() {
        return "Sessao{" + "id=" + id + ", usuario=" + usuario + ", token=" + token + '}';
    }
    
}

