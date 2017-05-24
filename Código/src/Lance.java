
import javax.swing.JOptionPane;


public class Lance {
    private Usuario usuario;
    private double valor;
    
    public Lance(Usuario user, String atualValor){
        this.usuario = user;
        utils u = new utils();
        double atual = u.converterD(atualValor);
        atual = atual + 1000;
        atualValor = u.converterDtoS(atual);
        String valorSelect = JOptionPane.showInputDialog("Digite o valor do lance", atualValor);
        double valorD = u.converterD(valorSelect);
        if (valorD >= atual){
            this.valor = valorD;
            double valorCarteira = user.getCarteira() - valorD;
            user.setCarteira(valorCarteira);
        }
        else{
            System.out.println("Valor Invalido");
        }
    }
    
    @Override
    public String toString(){
        String lance = ("Usuario: "+usuario.getNickname()+"/n Valor: "+ valor);
        return(lance);
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Lance(Usuario user, double value){
        this.usuario = user;
        this.valor = value;
    }
}
