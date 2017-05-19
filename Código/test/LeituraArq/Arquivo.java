package LeituraArq;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Positivo
 */
public class Arquivo{
    
     public static void main(String[] args) throws IOException{
        /*String name = JOptionPane.showInputDialog("Digite o nome do leilão:");
        String path = new File("").getAbsolutePath();
        boolean diretorio = new File(path+"\\src\\Leiloes\\"+name).mkdirs();
        System.out.println(diretorio);
        String path2 = new File(name).getAbsolutePath();
        //boolean pasta = new File(path + "\\src\\Leiloes\\leilao").mkdirs();
        System.out.println(path2);
        File pasta = new File(path2);
        File[] contents = pasta.listFiles();
        if (contents != null) {
            for (File f : contents) {
                //deleteFile(f);
            }
        }
        System.out.println(pasta.delete());
        */
        String path = new File("").getAbsolutePath();
         try (FileWriter participantes = new FileWriter(path+"\\src\\participantes.bd")) {
             System.out.println(participantes);
         }
        }
         
    
}
