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
    
    public void iniciarLeilao(int duracao){
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
