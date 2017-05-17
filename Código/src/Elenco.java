
public class Elenco {
    private Jogador[] jogador;

    public Elenco(int limite){
        this.jogador = new Jogador[limite];
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }
    
    
    
}
