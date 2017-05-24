
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31645119
 */
public class utils {
    
    public utils (){}
    
    public static Double converterD(String valor){
        valor = valor.replace("M","000");
        valor = valor.replace(",", ".");
        Double valorDouble = Double.parseDouble(valor);
        return valorDouble;
    }
    public static int converterI(String valor){
        int valorInt = Integer.parseInt(valor);
        return valorInt;
    }
    public static String converterItoS(int valor){
        String string = Integer.toString(valor);
        return (string);
    }
    public static String converterDtoS(double valor){
        String string = Double.toString(valor);
        return (string);
    }
}
