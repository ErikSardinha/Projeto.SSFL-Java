import javax.swing.JOptionPane;


    public class Usuario {
    private String nome;
    private String nickname;
    private String email;
    private double carteira;
    private Elenco elenco;
    
    public Usuario(String nome, String nickname, String email){
        this.nome = nome;
        this.nickname = nickname;
        this.email = email;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

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

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }
    
    public Lance darLance() {
    double valor = 0 /* entrada de dados */;
        Lance lance = new Lance(this,valor);
        return(lance);
    }
    
    //@Override
    //public String toString(){
    
    //return;
    }

