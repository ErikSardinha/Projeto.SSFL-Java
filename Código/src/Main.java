import java.io.IOException;
import javax.swing.JOptionPane;

/*
Autores: Bernard Wahba  @BennyWahba
         Erik Sardinha  @ErikSardinha
         Henrique Lima  @henriquevelardo
*/

public class Main {

    public static void main(String args[]) throws IOException{
        utils iniciar = new utils();
        Usuario user = new Usuario(iniciar.Logar());
        user.Registrar(); 
        String nick = user.getNickname();
        System.out.println(nick);
        
        switch (iniciar.telaIni()) {
            case 1: user.criarLeilao();
                    break;
            case 2: user.participar();
                    break;
            default: System.out.println("Opção inválida");
        }
    }
    
}