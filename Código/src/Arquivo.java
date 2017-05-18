
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Arquivo {
    
    public Arquivo(){};
    
    public String localArquivo(){
    
        String path = new File("").getAbsolutePath();
        return(path);
    
    }
    public int tamanhoArquivo(String arq) throws IOException{
    
        int size = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
            while(br.ready()){
                String linha = br.readLine();
                size = size + 1;
                
            }
        } 
        return (size);
          
    }
}

