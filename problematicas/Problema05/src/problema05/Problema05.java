/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author DELL
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int suma = 3;
        String mensaje = "";
        
        mensaje = mensaje + "1";
        
        do{
            if(contador % 2 == 0){
                mensaje = String.format("%s + 1/%d",mensaje, suma);
            }else{
                mensaje = String.format("%S - 1/%d", mensaje, suma);
            }
            contador = contador + 1;
            suma = suma + 2;
            
        }while(contador <= 8);
        
        System.out.println(mensaje);
    }  
}
