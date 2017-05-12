
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Método p/ alterações conforme o desenvolvimento. --branchhick

public class Comum extends Usuario {
    

   
    public String permissao() {
    String p = JOptionPane.showInputDialog(null,"Digite o nome do leilão:");
    return "Pedindo permissão ao ADM";
    }
    
   public void escrever() throws IOException {
       Scanner ler = new Scanner("permissao.txt");
    } 
    
  }
  
  

