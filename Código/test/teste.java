import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class teste {
    public static void main(String[] args) throws IOException{
        
        String path = new File("").getAbsolutePath();
        FileInputStream arq;
        FileOutputStream arq2;
        try {
            arq = new FileInputStream(path + "\\src\\LeilaoJose\\Permissoes.txt");
        } 
        catch (FileNotFoundException ex) {
            File f = new File(path + "\\src\\LeilaoJose\\Permissoes.txt");
            File diretorio = new File(path + "\\src\\LeilaoJose\\");
            diretorio.mkdir();
            f.createNewFile();
        }
        
    }
}
