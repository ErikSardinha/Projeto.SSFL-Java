
import javax.swing.JOptionPane;

/*
Autores: Bernard Wahba  @BennyWahba
         Erik Sardinha  @ErikSardinha
         Henrique Lima  @henriquevelardo
*/

public class Main {

    public static void main(String args[]){
        utils iniciar = new utils();
        Usuario user = new Usuario(iniciar.Logar());
        String nick = user.getNickname();
        System.out.println(nick);
        
        switch (iniciar.tela()) {
            case 1: user.criarLeilao();
                    break;
            case 2: user.participar();
                    break;
            default: System.out.println("Opção inválida");
        }
    }
    
}