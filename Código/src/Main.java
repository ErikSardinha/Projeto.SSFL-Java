import java.io.IOException;
import javax.swing.JOptionPane;

/*
Autores: Bernard Wahba  @BennyWahba
         Erik Sardinha  @ErikSardinha
         Henrique Lima  @henriquevelardo
*/

public class Main {
    
    public static void main(String args[]) throws IOException{
        Usuario user = new Usuario(Logar());
        user.Registrar(); 
        String nick = user.getNickname();
        System.out.println(nick);
        
        switch (telaIni()) {
            case 1: user.criarLeilao();
                    break;
            case 2: user.participar();
                    break;
            default: System.out.println("Opção inválida");
        }
    }
    
    public static String Logar(){
        String nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
        while (nickname == null||nickname.equals("")){
            nickname = JOptionPane.showInputDialog("Digite seu nome de usuario:");
        }
        System.out.println ("Bem vindo,");
        return nickname;
    } 
    
    public static int telaIni(){
        System.out.println("1 - Criar Leilão");
        System.out.println("2 - Participar de Leilão");
        String sel = JOptionPane.showInputDialog("Selecione o numero da opção desejada:");
        int selInt = Integer.parseInt(sel);
        return selInt;
    }
    public static int telaLeilao(){
        System.out.println("1 - Adicionar Participante(s)");
        System.out.println("2 - Iniciar Leilao");
        String sel = JOptionPane.showInputDialog("Selecione o numero da opção desejada:");
        int selInt = Integer.parseInt(sel);
        return selInt;
    }
    public static int telaPrincipal(){
        System.out.println("1 - Adicionar Participante(s)");
        System.out.println("2 - Iniciar Leilao");
        String sel = JOptionPane.showInputDialog("Selecione o numero da opção desejada:");
        int selInt = Integer.parseInt(sel);
        return selInt;
    }
}