/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
     
        String cadena = "";
        String listadoEdades = "";
        String nombreJugador;
        String posicionCampo;
        int edad;
        double estatura;
        boolean bandera = true;
        String salir;
        int totalEdad = 0;
        double totalEstatura = 0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        
        cadena = String.format("%s%s\n", cadena,"Listado Jugadores");
        
        do{
            System.out.println("Ingrese el nombre del Jugador:");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición del juego:");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
                       
            totalEdad = totalEdad + edad;
            totalEstatura = totalEstatura + estatura;
            
            contador = contador + 1;
            
            cadena = String.format("%s%d.) %s -%s-, edad %d\n",
                    cadena,contador,nombreJugador,
                    posicionCampo, edad);
            
            listadoEdades = String.format("%s%d\n", listadoEdades,
                    edad); 
            
            entrada.nextLine(); 
            System.out.println("Desea salir del ciclo escriba:si"
                    + " de lo contradrio seleccione cualquier tecla");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
                } 
            } while(bandera);
        
        promedioEdad = (double)(totalEdad/contador);
        promedioEstatura = (double)(totalEstatura/contador);
        
        // presentación de cadena final
        System.out.printf("%s", cadena);
                // Promedio de edades: 
        System.out.printf("Listado De Edades\n%s", listadoEdades);
        System.out.printf("Promedio de edades: %.2f\n", promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n",promedioEstatura);
 
    }
    
}
