
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31645119
 */
public class utils {
    
    public utils (){}
    
    public String Logar(){
        String nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
        while (nickname == null||nickname.equals("")){
            nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
        }
        System.out.println ("Bem vindo,");
        return nickname;
    } 
    
    public int tela(){
        System.out.println("1 - Criar Leilão");
        System.out.println("2 - Participar de Leilão");
        String sel = JOptionPane.showInputDialog("Selecione o numero da opção desejada:");
        int selInt = Integer.parseInt(sel);
        return selInt;
    }
}
