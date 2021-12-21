import java.util.Scanner;
import java.io.*;

//CLASES
class Potion implements Serializable {

    int id;
    String name, description;
    int type;
    int points;
}

class Item implements Serializable {

    int id;
    String name, description;
    int type;
    int experience;
}

public class Prac9 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

        // CONSTANTES
        final int MAXPOTIONS = 10, MAXITEMS = 5;
        final int EXPERIENCE = 10;

        // DEFINICION DE VARIABLES
        Scanner entrada = new Scanner(System.in);
        int option;
        int boundPotions = 0, boundItems = 0;
        int race;

        //ARRAYS
        Potion[] listPotions = new Potion[MAXPOTIONS];
        Item[] listItems = new Item[MAXITEMS];

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Trabajo realizado por: Irene Rodríguez, Andrea Gil, Ghaudy Bellido, Cristina Valero, Sandra Martín");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a Inhhildur, ¿qué deseas hacer?");

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
                    
                    do{
                    System.out.println("+++¿Qué desea introducir?+++");
                    System.out.println("1 Para pócimas  2 Para items  3 Para Salir");
                    option = entrada.nextInt();
                        switch (option) {
                           case 1:
                              System.out.println("+++INTRODUCIR PÓCIMA+++");
                              boundPotions = crearPociones(listPotions, boundPotions, entrada);  
                              break;
                           case 2:
                              System.out.println("+++INTRODUCIR ITEM+++");
                              break;
                           case 3:
                              System.out.println("+++SALIENDO+++");
                               break;
                           default:
                               System.out.println("La opción introducida es incorrecta.");
                        }
                     }while (option!=3);

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
                    System.out.println("+++MONSTRAR PÓCIMAS E ITEMS+++");
                    
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
    
    static int crearPociones(Potion[] array, int boundPotions, Scanner entrada) {
        int id = array[boundPotions].id;
        String name = array[boundPotions].name;
        String description = array[boundPotions].description;
        int type = array[boundPotions].type;
        //int points = array[boundPotions].points;

        System.out.println("Introducir el identificador de la pócima");
        entrada.nextLine();
        id = entrada.nextInt();
        System.out.println("Introduzca el nombre de la pocima");
        name = entrada.nextLine();
        System.out.println("Introduzca la descripción de la pocima");
        description = entrada.nextLine();
        System.out.println("Introduzca el tipo de pocima:");
        type = entrada.nextInt();

        //out.write("Id: " + id + " Name: " + name + " Descripcion:" + description + " Type:" + type + "\n");
        return boundPotions;
    }
    
    static int crearItems(Item[] listItems, int boundItems, Scanner entrada) {
        System.out.println("El identificador del item es" + (boundItems+1));
        listItems[boundItems].id = (boundItems+1);
        System.out.println("Introduzca el nombre del item");
        listItems[boundItems].name = entrada.nextLine();
        System.out.println("Introduzca la descripción del item");
        listItems[boundItems].description = entrada.nextLine();
        System.out.println("Introduzca el tipo del item: 1-Arma 2-Armadura 3-Miscelaneo");
        listItems[boundItems].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listItems[boundItems].experience = entrada.nextInt();
        return boundItems+1;
    }

}
    

