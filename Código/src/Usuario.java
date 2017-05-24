import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


    public class Usuario {
    //private String nome;
    private String nickname;
    //private String email;
    private double carteira;
    private Elenco elenco;
    
    public Usuario(String nickname){
        //this.nome = nome;
        this.nickname = nickname;
        //this.email = email;
    
    }
    
    public Lance darLance(double valorAtual) {
        double valor = valorAtual+1000;
        String vl = JOptionPane.showInputDialog("Valor do lance: ");
        try {
            double valorDado = Double.parseDouble(vl);
            if(valorDado >= valor){
                valor = valorDado;
            }
            else{
                System.out.println(" Valor invalido, substituido pelo valor atual + 1000");
            }
        }
        catch (NumberFormatException e){
            System.out.println(" Valor invalido, substituido pelo valor atual + 1000");
        }
        Lance lance = new Lance(this,valor);
        return lance;
    }
    
    public void Registrar() throws IOException{
        FileReader fr = new FileReader(Arquivo.Caminho("")+"\\Usuarios.bd");
        try (BufferedReader br = new BufferedReader(fr)){
            if (!Arquivo.ExisteOn(br, nickname)){
                Arquivo.Escrever(nickname, "src","Usuarios.bd");
                System.out.println("Novo usuário criado");
            }
            else{
                System.out.println("Usuario já cadastrado");
            }
            System.out.println("Logado com sucesso");
        } 
    }
    public void participar(){
        JOptionPane.showConfirmDialog(null,"Entrar em Leilão?");
        System.out.println(nickname + " Entrou.");
    }
    
    public void criarLeilao() throws IOException{    
    int c = JOptionPane.showConfirmDialog(null, "Criar Leilão?");
    String pastaLeilao = "Leilao"+this.nickname;
    if (c == 0){
        Arquivo.CriarPasta("Leiloes", pastaLeilao);
        Arquivo.Escrever(this.nickname,"Leiloes","Leiloes.txt");
        pastaLeilao = "Leiloes\\"+pastaLeilao;
        Arquivo.CriarArquivo(pastaLeilao,"participantes.bd");
        Arquivo.Escrever(this.nickname, pastaLeilao, "participantes.bd");
        Arquivo.CriarPasta(pastaLeilao, "Elencos");
        String pastaElenco = pastaLeilao+"\\Elencos";
        Elenco.criarArquivoElenco(pastaElenco, nickname);
        JOptionPane.showMessageDialog(null, "Leilão criado com Sucesso!");
    }
    Leilao leilao = new Leilao(this);
    switch (Main.telaLeilao()) {
            case 1: leilao.adicionarParticipante(pastaLeilao);
                    break;
            case 2: leilao.confInicioLeilao();
                    break;
            default: System.out.println("Opção inválida");
        }
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
 
    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }
    
    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }
}
    
    //@Override
    //public String toString(){
    
    //return;
    

