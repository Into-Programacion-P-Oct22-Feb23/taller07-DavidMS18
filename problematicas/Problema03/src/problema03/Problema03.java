/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author DELL
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int cadena = 2;
        int suma = 3;
        
        do{
            System.out.println(cadena); 
            cadena = cadena + suma; 
            contador = contador + 1;
            suma = suma + 2;   
            
        }while(contador <= 6);
    }
    
}
