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

public class PracGame {

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
        for (int i = 0; i < listPotions.length; i++) {
            listPotions[i] = new Potion();
        }

        Item[] listItems = new Item[MAXITEMS];
        for (int i = 0; i < listItems.length; i++) {
            listItems[i] = new Item();
        }

        

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
                    int opcion;
                    do{
                    System.out.println("---¿Qué desea introducir?---");
                    System.out.println("1 Para pócimas  2 Para items  3 Para Salir");
                    opcion = entrada.nextInt();
                        switch (opcion) {
                           case 1:
                              System.out.println("---INTRODUCIR PÓCIMA---");
                              boundPotions = crearPociones(listPotions, boundPotions, entrada);  
                              break;
                           case 2:
                               System.out.println("---INTRODUCIR ITEM---");
                               boundItems = crearItems(listItems, boundItems, entrada);
                               break;
                           case 3:
                              System.out.println("+++SALIENDO+++");
                               break;
                           default:
                               System.out.println("La opción introducida es incorrecta.");
                        }
                     }while (opcion !=3);

                    break;

                case 2:
                    System.out.println("+++INSERTAR PÓCIMA O ÍTEM EN POSICIÓN DETERMINADA+++");
                    int opti;
                    System.out.println("---Cual es la raza de tu personaje?---");
                    System.out.println("1:Humano  2:Orco  3:Elfo  4:Enano");
                    opti = entrada.nextInt();
                    switch (opti) {
                        case 1:
                            System.out.println("---Humano---");
                            System.out.println("Que vas a anadir? 1-Pocima 2-Item");
                            int a = entrada.nextInt();
                            if (a ==1){
                                insertarPociones(listPotions, boundPotions, entrada);
                            }else if (a == 2){
                                insertarItems(listItems, boundItems, entrada);
                            }else {
                                System.out.println("Error, no se encuentra dentro del rango permitido");
                            }

                            break;
                        case 2:
                            System.out.println("---Orco---");

                            break;
                        case 3:
                            System.out.println("---Elfo---");

                            break;
                        case 4:
                            System.out.println("---Enano---");

                            break;
                        default:
                            System.out.println("La opción introducida es incorrecta.");
                    }
                    break;

                case 3:
                    System.out.println("+++USAR PÓCIMA+++");

                    break;

                case 4:
                    System.out.println("+++TIRAR UN ITEM+++");
                    System.out.println("Que vas a tirar? 1-Pocima 2-Item");
                    int a = entrada.nextInt();
                    if (a == 1) {
                        eliminarPociones(listPotions, boundPotions, entrada);
                    } else if (a == 2) {
                        eliminarItems(listItems, boundItems, entrada);
                    } else {
                        System.out.println("Error, no se encuentra dentro del rango permitido");
                    }
                    break;

                case 5:
                    System.out.println("+++MONSTRAR PÓCIMAS E ITEMS+++");
                    mostrarPocimas(listPotions, boundPotions);
                    mostrarItems(listItems, boundItems);
                    
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
    
    //CASE 1

    static int crearPociones(Potion[] listPotions, int boundPotions, Scanner entrada) {
        listPotions[boundPotions].id = boundPotions+1;
        System.out.println("El identificador de la pocion es: " + listPotions[boundPotions].id);
        entrada.nextLine();
        System.out.println("Introduzca el nombre de la pocima");
        listPotions[boundPotions].name = entrada.nextLine();
        System.out.println("Introduzca la descripción de la pocima");
        listPotions[boundPotions].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de pocima: 1- 2- 3-");
        listPotions[boundPotions].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listPotions[boundPotions].points = entrada.nextInt();
        //out.write("Id: " + id + " Name: " + name + " Descripcion:" + description + " Type:" + type + "\n");
        return boundPotions+1;
    }
    
    static int crearItems(Item[] listItems, int boundItems, Scanner entrada) {
        System.out.println("El identificador del item es" + (boundItems+1));
        listItems[boundItems].id = (boundItems+1);
        entrada.nextLine();
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
    
    // CASE 5
    static void mostrarPocimas(Potion[] listPotions, int boundPotions) {
        System.out.println("El número de pocimas son:" + (boundPotions));
        for (int i = 0; i < boundPotions; i++) {
            System.out.println("El nombre de la pócima: " + listPotions[i].name);
            System.out.println("La descripción de la pócima: " + listPotions[i].description);
            System.out.println("El tipo de pocima de la pócima: " + listPotions[i].type);
            System.out.println("La puntuación de la pócima: " + listPotions[i].points);
        }
        System.out.println("");
    }

    static void mostrarItems(Item[] listItems, int boundItems) {
        System.out.println("El número de pocimas son:" + (boundItems));
        for (int i = 0; i < boundItems; i++) {
            System.out.println("El nombre de la pócima: " + listItems[i].name);
            System.out.println("La descripción de la pócima: " + listItems[i].description);
            System.out.println("El tipo de pocima de la pócima: " + listItems[i].type);
            System.out.println("La puntuación de la pócima: " + listItems[i].experience);
        }
        System.out.println("");
    }

    //CASE 2

    static void insertarPociones(Potion[] listPotions, int boundPotions, Scanner entrada) {
        int id = listPotions[boundPotions].id;
        System.out.println("Introduzca el identificador de la pocima: ");
        listPotions[boundPotions].id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduzca el nombre de la pocima");
        listPotions[id].name = entrada.nextLine();
        System.out.println("Introduzca la descripción de la pocima");
        listPotions[id].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de pocima: 1- 2- 3-");
        listPotions[id].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listPotions[id].points = entrada.nextInt();
    }

    static void insertarItems(Item[] listItems, int boundItems, Scanner entrada) {
        int id = listItems[boundItems].id;
        System.out.println("Introduzca el identificador del item: ");
        listItems[boundItems].id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduzca el nombre del item");
        listItems[id].name = entrada.nextLine();
        System.out.println("Introduzca la descripción del item");
        listItems[id].description = entrada.nextLine();
        System.out.println("Introduzca el tipo de item: 1- 2- 3-");
        listItems[id].type = entrada.nextInt();
        System.out.println("Introduzca la experiencia del item");
        listItems[id].experience = entrada.nextInt();
    }

    //CASE 3 -> Usar la pocion tendriamos que leer la exp de la pocion y sumarsela a un contador gobal de experiencia <- 10 como max (FINAL EXPERIENCE)


    //CASE 4

    static void eliminarPociones(Potion[] listPotions, int boundPotions, Scanner entrada) {
        int id = listPotions[boundPotions].id;
        System.out.println("Introduzca el identificador de la pocima: ");
        listPotions[boundPotions].id = entrada.nextInt();
        //Eliminamos
        listPotions[id].name = null; // String es con null y int con 0 para dejarlo vacio
        listPotions[id].description = null;
        listPotions[id].type = 0;
        listPotions[id].points = 0;
    }

    static void eliminarItems(Item[] listItems, int boundItems, Scanner entrada) {
        int id = listItems[boundItems].id;
        System.out.println("Introduzca el identificador del item: ");
        listItems[boundItems].id = entrada.nextInt();
        //Eliminamos
        listItems[id].name = null;
        listItems[id].description = null;
        listItems[id].type = 0;
        listItems[id].experience = 0;
        
    }

}
    

 

    
