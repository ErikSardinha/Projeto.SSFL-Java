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
    private boolean iniciado;
    private Usuario[] participantes;

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
            Jogador jogador = new Jogador(lista[])
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
    public void finalizarLeilao(){
        int a = JOptionPane.showConfirmDialog(null, "Adicionar participante?");
        if (a == 0){
            for(Usuario participante : participantes){
                Elenco elenco = participante.getElenco();
            }
        }
    }
}
