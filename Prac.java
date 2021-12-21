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
    try {
            ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("pocimas.dat"));
            int opcion;
            
            do {
                System.out.println("Dame el nombre:");
                miAmigo.nombre = entrada.next();
                System.out.println("Dame la edad:");
                miAmigo.edad = entrada.nextInt();
                System.out.println("Dame la dirección:");
                miAmigo.direccion = entrada.next();

                escribe.writeObject(miAmigo);

                System.out.println("¿Desea continuar?");
                System.out.println("1-Sí.  2-No.");
                opcion = entrada.nextInt();
            } while (opcion != 2);
            escribe.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}

