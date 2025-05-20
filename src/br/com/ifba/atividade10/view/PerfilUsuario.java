/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Casa
 */
public class PerfilUsuario {
    long id;
    String descricao;
    List<String> permissoes = new ArrayList<>();//declaraçao da lista de permiçoes declarar user comum e admin no main
    
    //CONSTRUCUTOR

    public PerfilUsuario(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        
        permissoes.add("Comum");
       // permissoes.add("Administrador");
    }
    
    //GETTERS

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getListaDeStrings() {
        return permissoes;
    }
    
    //SETTERS

    public void setId(long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setListaDeStrings(List<String> listaDeStrings) {
        this.permissoes = listaDeStrings;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id + ", descricao=" + descricao + ", permissoes=" + permissoes + '}';
    }
    
    
}
