import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Leilao {
    private Usuario administrador;
    //private time duracao;
    private Usuario[] participantes;
    private Jogador[] jogadores;

    public Leilao(Usuario nome){
        this.administrador = nome;
        //this.duração = duracao;
    }
    
    public void iniciarLeilao() throws FileNotFoundException, IOException{
        
        Arquivo control = new Arquivo();
        String arq;
        FileReader fr = new FileReader(control.Caminho("")+"\\Jogadores.txt");
        int tamanho = control.Tamanho(fr);
        BufferedReader br;
        br = new BufferedReader(fr);
            while (br.ready()){
            String linha = br.readLine();
            String[] lista;
            lista = linha.split(";");
           // this.jogadores = new Jogador(lista[0],lista[1],lista);
         }
    }
    public void adicionarParticipante(String pastaLeilao) throws IOException{
        Arquivo control = new Arquivo();
        int a = JOptionPane.showConfirmDialog(null, "Adicionar participante?");
        if (a == 0){
            String nome = JOptionPane.showInputDialog("Digite seu nome de usuario:");
            control.Escrever(nome, pastaLeilao, "participantes.bd");
        }
    }
    public int verificarParticipantes(String pastaLeilao) throws FileNotFoundException, IOException{
        Arquivo control = new Arquivo();
        FileReader arq = new FileReader(control.Caminho(pastaLeilao)+"\\participantes.bd");
        int nParticipantes = control.Tamanho(arq);
        return nParticipantes;
    }
    public void finalizarLeilao(){
        int a = JOptionPane.showConfirmDialog(null, "Adicionar participante?");
        if (a == 0){
            for(Usuario participante : participantes){
                Elenco elenco = participante.getElenco();
            }
        }
    }
    
    public Usuario getAdministrador() {
        return administrador;
    }

    public Usuario[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Usuario[] participantes) {
        this.participantes = participantes;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    
    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }
}
