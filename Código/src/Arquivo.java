import static java.awt.SystemColor.control;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo {
    
    public Arquivo(){};
    
    public String Caminho(String arq){
            String path = new File(arq).getAbsolutePath();
        return(path);
    }
    public int Tamanho(String arq) throws IOException{
        int size = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
            while(br.ready()){
                String linha = br.readLine();
                size = size + 1;    
            }
        } 
        return(size);
    }
    public boolean Existe(BufferedReader arq, String comparar) throws IOException{
        while(arq.ready()){
            String linha = arq.readLine();
            if(comparar.equals(linha)){
                return true;
            }
        }
        return false;
    }
    public void CriarPasta(String nome) throws IOException{
        File pasta = new File(this.Caminho("Leilao")+ nome);
        pasta.mkdir();
        FileWriter participantes = new FileWriter(this.Caminho(nome)+"\\participantes.bd");
        participantes.close();
    }
    public void DeletarPasta(String nome){
        File pasta = new File(nome);
        pasta.delete();  
    }  
}

