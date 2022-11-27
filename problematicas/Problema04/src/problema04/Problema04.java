/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author DELL
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato = 1;
        int contador = 1;
        int contador1 = 3;
        String mensaje = "";
        
        while (contador1 <= 15) {
            if (contador % 2 == 0) {
                mensaje = String.format("%s +%s/%s", mensaje,
                        dato, contador1);

            } else {
                mensaje = String.format("%s -%s/%s", mensaje,
                        dato, contador1);
            }
            contador = contador + 1;
            contador1 = contador1 + 2;
        }
        System.out.printf("%s %s", dato, mensaje);
    }
    
}
