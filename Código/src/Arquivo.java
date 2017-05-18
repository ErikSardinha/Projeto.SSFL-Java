
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Arquivo {
Scanner scanner = new Scanner(new FileReader("arquivo.txt"))                       .useDelimiter("\\||\\n");
while (scanner.hasNext()) {
  String nome = scanner.next();
  String cidade = scanner.next();
  String compras = scanner.next();
  System.out.println(nome);
  System.out.println(cidade);
  System.out.println(compras);
}
        String path = new File("").getAbsolutePath();
        FileInputStream arq; //= arquivo para leitura
        FileOutputStream arq2; //= arquivo para escrita

        while (true) { //= loop infinito. só sai com break ou return
}
