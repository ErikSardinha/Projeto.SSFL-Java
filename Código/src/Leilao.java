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
    private Usuario admin;
    //private time duracao;
    private Usuario[] participantes;
    private Jogador[] jogadores;

    public Leilao(Usuario user){
        this.admin = user;
        //this.duração = duracao;
    }
    
    public void confInicioLeilao() throws FileNotFoundException, IOException{
        int ini = JOptionPane.showConfirmDialog(null, "Deseja iniciar o leilão?");
        if (ini == 0){
            Arquivo control = new Arquivo();
            FileReader arqJogadores = new FileReader(control.Caminho("")+"\\Jogadores.txt");
            int totalJ = control.Tamanho(arqJogadores);
            this.jogadores = new Jogador[totalJ];
            BufferedReader arqJogador = new BufferedReader(arqJogadores);
            int n = 0;
            while (arqJogador.ready()){
                String linha = arqJogador.readLine();
                String[] lista;
                lista = linha.split(";");
                Jogador jogador = new Jogador(lista[0],lista[1],lista[2], lista[3]);
                this.jogadores[n] = jogador;
                n = n+1;
            }
            FileReader arqParticipantes = new FileReader(control.Caminho("Leilao")+admin+"\\participantes.bd");
            int totalP = control.Tamanho(arqParticipantes);
            if(totalP>1){
                this.participantes = new Usuario[totalP];
                BufferedReader arqParticipante = new BufferedReader(arqParticipantes);
                int nP = 0;
                while (arqParticipante.ready()){
                String nome = arqParticipante.readLine();
                Usuario user = new Usuario(nome);
                this.participantes[nP] = user;
                nP = nP+1;
                }
            }
            else{
                System.out.println("você precisa adicionar mais participantes para iniciar esse leilão");
                adicionarParticipante(control.Caminho("Leiloes\\Leilao"+admin.getNickname()));
                confInicioLeilao();
            }
            iniciarLeilao();
        }
    }
    public void iniciarLeilao(){
        utils u = new utils();
        boolean iniciado = true;
        while(iniciado = true){
            for(Usuario participante : participantes){
                System.out.println("Vez do participante: "+ participante.getNickname());
                for(int i = 0; i <= jogadores.length; i++){
                    int atual = 0;
                    int n = 10;
                    while(atual<n){
                        for(int j = 0; j<10; j++){
                            String number = u.converterItoS(atual+j);
                            System.out.println(number +"-"+ jogadores[atual+j]);
                        }
                        int a = JOptionPane.showConfirmDialog(null, "Ver outros jogadores?");
                        if(a==0){  
                            n = n+10;
                        }
                        atual = atual+10;
                    }
                }
                int l = JOptionPane.showConfirmDialog(null, "Deseja dar um lance?");
                if(l==0){
                    String jog = JOptionPane.showInputDialog("Digite a posição do jogador");
                    int joga = u.converterI(jog);
                    if(joga<=jogadores.length && joga>=0 ){
                        Jogador jogadorA = jogadores[joga];
                        Lance lanceAtual = jogadorA.getMaiorLance();
                        jogadorA.setMaiorLance(participante.darLance(lanceAtual.getValor()));
                    }
                }
            }
        int t = JOptionPane.showConfirmDialog(null, "Ir para proximo turno(Sim) ou finalizar(Não)?");
            if(t==0){
                iniciado = true;
            }
            if(t==1){
                iniciado = false;
            }
        }
        finalizarLeilao();
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
        int a = JOptionPane.showConfirmDialog(null, "Finalizar leilao?");
        if (a == 0){
            for(Usuario participante : participantes){
                Elenco elenco = participante.getElenco();
                for(Jogador jogador : this.jogadores){
                    Lance dono = jogador.getMaiorLance();
                    if (dono.getUsuario().equals(participante)){
                        elenco.addJogadorAoElenco(jogador);
                    }
                }
            }
        }
        
    }
    
    public Usuario getAdmin() {
        return admin;
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
    
    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }
}
