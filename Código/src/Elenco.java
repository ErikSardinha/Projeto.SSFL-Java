
public class Elenco {
    private Jogador[] jogador;
    private int limite;
    
    public Elenco(int limite){
        this.limite = limite;
        this.jogador = new Jogador[this.limite];
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void addJogadorAoElenco(Jogador jogador){
    /*Para add jogadores terminar "Darlance()" 
        for (Jogador jogador[]: jogadores){
        if (jogador == null){
        jogador[] = jogadorComprado(); 
        }
        }*/
    }
    
    public boolean Cheio(){
        for(int i=0; i<this.limite; i++){
            if (this.jogador[i] != null){
                return(false);
            }
        }
        return true;
    }
    
}
