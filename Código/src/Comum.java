
import javax.swing.JOptionPane;

//Método p/ alterações conforme o desenvolvimento. --branchhick

public class Comum extends Usuario {
    
  
    @Override
    public String toString(){
        String p = JOptionPane.showInputDialog(null, "Deseja entrar em um Leilão?");
        return permissao();
    }
    
    public String permissao() {
    return "Pedindo permissão ao ADM";
    }
  
  
}
