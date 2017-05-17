
public class Jogador {
    
    private String nome;
    private int idade;
    private double valor;
    private Posicao posicao;
    private String time;
    
    public enum Posicao {
    Goleiro, Defensor, MeioCampista, Atacante, Indisponivel;
    }
    
   public Jogador(String nome, int idade, double valor, String posicao){
       
        this.nome = nome;
        this.idade = idade;
        this.valor = valor;
        /* Teste de Verificação se a posição existe
        boolean existe = false
        while existe(false){
            if (posicao.equals(Posicao)){
                existe = true;
                this.posicao = Posicao.posicao;
            }
        }
        if (existe == false){
            this.posicao = Posicao.Indisponivel
        }
       */
       
   }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    /*
    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    } 
    */
}
