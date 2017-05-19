
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
 
    public void participar(){
        JOptionPane.showConfirmDialog(null,"Entrar em Leilão?");
        System.out.println(nickname + " Entrou.");
    }
    
    public void criarLeilao(){    
    int c = JOptionPane.showConfirmDialog(null, "Criar Leilão?");
    if (c == 0){
        String name = JOptionPane.showInputDialog("Digite o nome do leilão:");
        Arquivo control = new Arquivo();
        try {
            boolean diretorio = new File(control.Caminho("")+"\\src\\Leiloes\\"+name).mkdirs();
            System.out.println(diretorio);
            FileWriter arquivo = new FileWriter(new File("Arquivo.txt"));
            arquivo.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
            System.out.println("ERRO!");
        }
    }
    int ini = JOptionPane.showConfirmDialog(null, "Deseja iniciar o leilão?");
    if (ini == 0){
        //try {
  //          leilao.iniciarLeilao();
      //  } catch (IOException ex){
         //   Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
      //  }
        //    System.out.println("Leilão " + nameLeilao + " iniciado.");
    }
    }
    
    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    /*
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    */
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
    
    public Lance darLance() {
    double valor = 0;  
    String vl = JOptionPane.showInputDialog("Valor do lance: ");
    try {
        valor = Double.parseDouble(vl);
    }
    catch (NumberFormatException e){
    System.out.println(" sdas ");
    }
        Lance lance = new Lance(this,valor);
        return lance;
    }
    
    public void Registrar() throws IOException{
        Arquivo controle=new Arquivo();
   
        try (BufferedReader br = new BufferedReader(new FileReader(controle.Caminho("")+"\\src\\Usuarios.bd"))) {
            
            if (!controle.Existe(br, nickname)){
                try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(controle.Caminho("")+"\\src\\Usuarios.bd"))) {
                    String registro=this.nickname;
                    buffWrite.append(registro+"\n");
                    System.out.println("Novo usuário criado");
                }
            }
            else{
                System.out.println("Usuario já cadastrado");
            }
            System.out.println("Logado com sucesso");
        } 
    }
}
    
    //@Override
    //public String toString(){
    
    //return;
    

