/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Casa
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        PerfilUsuario perfilComum = new PerfilUsuario(1, "Usuário Comum");
        
        // Modificação: Usar o construtor correto de Usuario
        Usuario usuario = new Usuario(0, perfilComum, "", "", "", false);
        
        Sessao sessao = null;
        int menu = -1;
        
        do{
            System.out.println("==========ESCOLHA UMA OPÇÃO ABIAXO==========");
            System.out.println("[1]Abrir conta\n");
            System.out.println("[2]Fazer Login\n");
            System.out.println("[3]informaçoes do perfil\n");
            System.out.println("[4]Atividade do usuário\n");
            System.out.println("[5]Sair\n");
            menu = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (menu){
                case 1:
                    usuario.criarConta(perfilComum);
                    usuario.registrarAtividade("Conta criada", "872.364.124-14");
                    break;
                    
                case 2:
                    if (usuario.isAtivo()) {
                        System.out.println("Digite sua senha:");
                        String senha = scanner.nextLine();
                        
                        if (usuario.usuarioLogar(senha) == true) {
                            sessao = new Sessao(1, usuario, "");
                            System.out.println("Sessão criada com token: " + sessao.getToken());
                            usuario.registrarAtividade("Login efetuado", "872.364.124-14");
                        }
                    } else {
                        System.out.println("Você precisa criar uma conta primeiro!");
                    }
                    break;
                    
                case 3:
                    if (usuario.isAtivo()) {
                        System.out.println(usuario);//vai chamar automaticamente o metodo to string
                        usuario.registrarAtividade("Verificaçao de dados da conta", "872.364.124-14");
                    } else {
                        System.out.println("Você precisa criar uma conta primeiro!");
                    }
                    break;
                    
                case 4:
                    usuario.imprimirAtividades();
                    break;
                    
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while(menu != 5); // Alterado para sair quando menu for 5
    }
    
}
