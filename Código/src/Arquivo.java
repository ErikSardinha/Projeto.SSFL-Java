import static com.oracle.jrockit.jfr.ContentType.Bytes;
import static java.awt.SystemColor.control;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;


public class Arquivo {
    
    public Arquivo(){};
    
    public void Escrever(String escrever, String pasta, String arquivo) throws IOException{
        FileReader fr = new FileReader(Caminho(pasta)+"\\"+arquivo);
        BufferedReader br = new BufferedReader(fr);
        boolean esc = false;
        if(!ExisteOn(br,escrever)){
            esc = true;
        }
        else{
            System.out.println("Ja existe no arquivo!");
            int d = JOptionPane.showConfirmDialog(null, "Deseja escrever mesmo assim?");
            if (d == 0){
                esc = true;
            }
        }
        if (esc = true){
            FileWriter fw = new FileWriter(Caminho(pasta)+"\\"+arquivo, true);
            try (BufferedWriter bw = new BufferedWriter(fw)){
            String registro = escrever;
            bw.append(registro+"\n");
            }
        }
    }
    
    public String Caminho(String arq){
        if (arq.equals("src")||arq.equals("")){    
            String path = new File("src").getAbsolutePath();
            return(path);
        }
        String path = new File("src\\"+arq).getAbsolutePath();
        return(path);
    }
    public int Tamanho(FileReader arq) throws IOException{
        int size = 0;
        try (BufferedReader br = new BufferedReader(arq)) {
            while(br.ready()){
                String linha = br.readLine();
                size = size + 1;    
            }
        } 
        return(size);
    }
    public boolean ExisteOn(BufferedReader arq, String comparar) throws IOException{
        while(arq.ready()){
            String linha = arq.readLine();
            if(comparar.equals(linha)){
                return true;
            }
        }
        return false;
    }
    public void CriarArquivo(String pasta, String nome) throws IOException{
        File file = new File(Caminho(pasta)+"\\"+nome);
        if(!file.exists()){
            FileWriter arquivo = new FileWriter(Caminho(pasta)+"\\"+nome);
            arquivo.close();
        }
        else{
            System.out.println("Arquivo ja existente!");
        }
    }
      
    public void CriarPasta(String pasta, String nome) throws IOException{
        File file = new File(Caminho(pasta)+"\\"+ nome);
        if(!file.isDirectory()){
            File path = new File(Caminho(pasta)+"\\"+ nome);
            path.mkdir();
        }
    }
    public void DeletarPasta(String pasta){
        File file = new File(pasta);
        if(!file.isDirectory()){
            file.delete();
        } 
    }  
}

