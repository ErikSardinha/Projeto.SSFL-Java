
import javax.swing.JOptionPane;



//Método p/ alterações conforme o desenvolvimento. --branchhick

public class Comum extends Usuario {
    
    public String permissao() {
    String p = JOptionPane.showInputDialog(null,"Digite o nome do leilão:");
    return "Pedindo permissão ao ADM";
    }
    
     @Override
    public String toString(){
        String p = JOptionPane.showInputDialog(null, "Deseja entrar em um Leilão?");
        return permissao();
    }
    
  }
  
  

