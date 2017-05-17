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
    
    public String darLance() {
    double lance = 0;
    return "Valor do lance : " +lance;
    }
    
    //@Override
    //public String toString(){
    
    //return;
    }

