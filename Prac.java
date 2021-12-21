import java.util.Scanner;
import java.io.*;

//CLASES


public class Prac9 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

        // DEFINICION DE VARIABLES
        int option, posicion;



        }
    System.out.println("---------------------------------------------------------------------------------------------------");
    System.out.println("Trabajo realizado por: Irene Rodríguez, Andrea Gil, Ghaudy Bellido, Cristina Valero, Sandra Martín");
    System.out.println("---------------------------------------------------------------------------------------------------");
    System.out.println("Bienvenido a Inhhildur, ¿qué deseas hacer?")

        do {
            System.out.println("Menu : ");
            System.out.println("1. Insertar pócima o ítem.");
            System.out.println("2. Insertar pócima o ítem en posición determinada.");
            System.out.println("3. Usar pócima.");
            System.out.println("4. Tirar un ítem.");
            System.out.println("5. Mostrar pócimas e ítems.");
            System.out.println("6. Mostrar ítems ordenados alfabéticamente por el nombre del primer elemento.");
            System.out.println("7. Buscar pócima e ítem.");
            System.out.println("8. Subida de nivel. ");
            System.out.println("9. Guardar todas las pócimas e ítems a fichero de texto.");
            System.out.println("10. Cargar situación de la última partida desde fichero de texto.");
            System.out.println("11. Guardar estado del PJ a disco.");
            System.out.println("12. Cargar PJ.");
            System.out.println("13. Terminar");
            System.out.println("Elija una opción: ");

            option = entrada.nextInt();

            switch (option) {
                
                case 1:
                    System.out.println("+++INSERTAR PÓCIMA O ÍTEM+++");
                   
                    break;

                case 2:
                    System.out.println("+++INSERTAR PÓCIMA O ÍTEM EN POSICIÓN DETERMINADA+++");
                    
                    break;

                case 3:
                    System.out.println("+++USAR PÓCIMA+++");
                    
                    break;

                case 4:
                    System.out.println("+++TIRAR UN ITEM+++");
                    
                    break;

                case 5:
                    System.out.println("+++MONSTRAR PÓCIMAS E ITEMS+++);
                    
                    break;

                case 6:
                    System.out.println("+++MOSTRAR LA NOTA ESCRITA+++");
                    
                    break;

                case 7:
                    System.out.println("+++MONSTAR ÍTEMS ORDENADOS ALFABÉTICAMENTE POR EL NOMBRE DEL PRIMER ELEMENTO+++");
                    
                    break;

                case 8:
                    System.out.println("+++SUBIDA DE NIVEL+++");
                   
                    break;

                case 9:
                    System.out.println("+++GUARDAR TODAS LAS PÓCIMAS E ÍTEMS A FICHERO DE TEXTO+++");
                   
                    break;

                case 10:
                    System.out.println("+++CARGAR SITUACIÓN DE LA ÚLTIMA PARTIDA DESDE FICHERO DE TEXTO+++");
                    
                    break;

                case 11:
                    System.out.println("+++GUARDAR ESTADO DEL PJ AL DISCO+++");
                    
                    break;

                case 12:
                    System.out.println("+++CARGAR PJ+++");
                 
                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 13);
    }
}
