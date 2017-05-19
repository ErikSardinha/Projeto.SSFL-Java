import static java.awt.SystemColor.control;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo {
    
    public Arquivo(){};
    
    public void Escrever(String escrever, String pasta, String arquivo) throws IOException{
        BufferedWriter buffWrite;
        buffWrite = new BufferedWriter(new FileWriter(pasta+"\\"+arquivo));
        String registro = escrever;
        buffWrite.append(registro+"\n");
        buffWrite.close();
    }
    
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
    public void CriarArquivo(String pasta, String nome) throws IOException{
        FileWriter arquivo = new FileWriter(this.Caminho("")+pasta+ "\\"+nome);
        arquivo.close();
    }
    public void CriarPasta(String pasta, String nome) throws IOException{
        File path = new File(this.Caminho("")+ pasta + "\\"+ nome);
        path.mkdir();
    }
    public void DeletarPasta(String nome){
        File pasta = new File(nome);
        pasta.delete();  
    }  
}

