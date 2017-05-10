//Método p/ alterações conforme o desenvolvimento. --branchhick

public class Comum extends Usuario {
    
  
    @Override
    public String toString(){
        
        return permissao();
    }
    
    public String permissao() {
    
      return "Pedindo permissão ao ADM";
    }
  
  
}
