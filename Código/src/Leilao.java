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

public class Leilao {
    private Usuario administrador;
    //private time duracao;
    private boolean iniciado;

    public boolean isIniciado() {
        return iniciado;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }

    public Leilao(Usuario nome){
        this.administrador = nome;
        //this.duração = duracao;
        this.iniciado = false;
    }
    
    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }
    
    @SuppressWarnings("empty-statement")
    public void iniciarLeilao() throws FileNotFoundException, IOException{
            
        Arquivo Controle = new Arquivo();
        String arq;
        BufferedReader br;
        br = new BufferedReader(new FileReader(Controle.Caminho("")+"\\Jogadores.txt"));
            while (br.ready()){
            String linha = br.readLine();
            String[] lista;
            lista = linha.split(";");
           }
        /*
        int tempoAtual;
        tempoAtual = PegarTempo;
        while (tempoAtual < duracao){
            this.iniciado = true;
        }
        this.iniciado = false
        */
    }
    
}
