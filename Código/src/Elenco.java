
import java.io.IOException;


public class Elenco {
    private Jogador[] jogadores;
    private int limite;
    
    public Elenco(int limite){
        this.limite = limite;
        this.jogadores = new Jogador[this.limite];
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogador) {
        this.jogadores = jogador;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void addJogadorAoElenco(Jogador jogadorComprado){
        int i = 0;
        for (Jogador jogador : this.jogadores){
            if (jogador == null){
                this.jogadores[i] = jogadorComprado; 
            }
            i ++;
        }
    }
    public static void criarArquivoElenco(String pastaElenco,String nickname) throws IOException{
        Arquivo control = new Arquivo();
        control.CriarArquivo(pastaElenco,nickname+"Elenco.bd");
        
    }
    
    
    public boolean Cheio(){
        for(int i=0; i<this.limite; i++){
            if (this.jogadores[i] != null){
                return(false);
            }
        }
        return true;
    }
    
}
