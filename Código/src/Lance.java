
public class Lance {
    private Usuario usuario;
    private double valor;

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
