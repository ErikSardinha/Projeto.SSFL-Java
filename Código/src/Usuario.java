
import java.io.File;
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
    System.out.println("Entrou.");
    }
    
    public void criarLeilao(){    
    int c = JOptionPane.showConfirmDialog(null, "Criar Leilão");
    if (c == 0){
    Arquivo control = new Arquivo();
    File file = new File("");
    new File(control.localArquivo()+"\\src\\" +this.nickname).mkdir();
    }
    Leilao leilao = new Leilao(this);
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

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }
    */
    
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
    
    //@Override
    //public String toString(){
    
    //return;
    }

