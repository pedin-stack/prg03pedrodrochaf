/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.time.LocalDateTime;//poder usar o datetime
/**
 *
 * @author Casa
 */
public class LogAuditoria {
    long id;
    Usuario usuario;
    String acao;
    LocalDateTime dataHora;
    String ip;
    String atividade; //para ir armazenando as informaçoes
    //CONSTRUCTOR

    public LogAuditoria(long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now();
        this.ip = "872.364.124-14";
    }
    
    //GETTERS

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getAcao() {
        return acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getIp() {
        return ip;
    }
    
    //SETTER

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    //listar logs
    public String logAuditoria(String atividade) {
        this.atividade = atividade;
        return "|" + id + "|" + ip + "|" + dataHora + "|" + acao + "|" + usuario.getNomeUsuario() + "|\n" + atividade + "\n";
    }

    public String adicionarLog(String acao, String ip) {//registrar uma nova atividade
        this.acao = acao;
        this.ip = ip;
        this.dataHora = LocalDateTime.now();
        return logAuditoria("Nova atividade registrada");
    }    
    @Override
    public String toString() {
        return "LogAuditoria{" + "id=" + id + ", usuario=" + usuario + ", acao=" + acao + ", dataHora=" + dataHora + ", ip=" + ip + '}';
    }
    
  
   
}
