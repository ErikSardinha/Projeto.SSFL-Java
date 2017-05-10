
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Henrique Lima Velardo - 31645119
 * Erik Sardinha - 31640885
 * Bernard Wahba - 31693210
 */

public class Leilao {
        
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try{ Jogador[] jogadores=ler();
        }
        finally{
            System.out.println("Invalido");
        }
    }
       
    public static Jogador[] ler() throws FileNotFoundException, IOException{
    FileReader filerR;
    BufferedReader buff;
    Jogadores[] resultado=new Jogador[/*tamanho arquivo*/];
    try{
        filerR=new FileReader(/*Arquivo*/);
        buff = new BufferedReader(filerR);
        String linha;
        linha = buff.lines();
        resultado=new Jogador[/*linha*/];
        int cont=0;
        buff.reset();
        while((linha=buff.readLine())!=null){
            String[] registro;
            registro = linha.split(/* separador */);
        }
    }
    finally{
       
    }
    return resultado;
}
    
    public void mostrar( String a, String b, String c, String d){
    }
    }
