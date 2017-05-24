
public class Jogador {

    private String nome;
    private int qualidade;
    private double valor;
    private Posicao posicao;
    private String time;
    private Lance maiorLance;

    public enum Posicao {
        Goleiro, Defensor, MeioCampista, Atacante, Indisponivel;
    }

    public Jogador(String nome, String qualidade, String valor/*, String posicao*/) {
        utils u = new utils();
        this.nome = nome;
        this.qualidade = u.converterI(qualidade);
        this.valor = u.converterD(valor);
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
        this.time = "";
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
