public class Jogador {

    private String nome;
    private String posicao;
    private int qualidade;
    private double valor;
    private Lance maiorLance;
    private boolean disponibilidade;

    public Jogador(String nome, String posicao, String qualidade, String valor) {
        utils u = new utils();
        this.nome = nome;
        this.posicao = posicao;
        this.qualidade = u.converterI(qualidade);
        this.valor = u.converterD(valor);
        this.maiorLance = null;
        this.disponibilidade = true;
    }
    
    @Override
    public String toString(){
        String disp;
        if(this.isDisponibilidade()){
            disp = "Disponivel";
        }
        else{
            disp = "Não disponível";
        }
        String jogador = ("Nome: "+ nome +"/n Posição"+ posicao+"/n Qualidade: "+qualidade+"/n Valor estimado: "+valor+"/n Disponibilidade: "+disp+"/n Maior Lance: "+maiorLance);
        return jogador;
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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
}
