
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
    
    public String Logar(){
    String nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
    while (nickname == null||nickname.equals("")){
    nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
    }
    System.out.println ("Bem vindo!");
    return nickname;
    } 
    
    
    public utils () {
    
    }
    
}
