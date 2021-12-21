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

            // System.out.println("");
            option = entrada.nextInt();

            switch (option) {
                // APARTADO A
                case 1:
                    System.out.println("*******INTRODUCIR NOTAS**********");
                    tope = insertarDatos(miClase, tope, entrada);
                    break;

                case 2:
                    System.out.println("*******MOSTRAR DATOS**********");
                    mostrarDatos(miClase, tope);
                    break;

                case 3:
                    System.out.println("*******CALCULAR ESTADISTICAS**********");
                    mostrarEstadistica(miClase, tope);
                    break;

                case 4:
                    System.out.println("*******MONSTRAR NOTA DE ALUMNO**********");
                    System.out.println("Introduzca número de matricula: ");
                    dato = entrada.nextInt();
                    buscarAlumno(miClase, dato);
                    break;

                case 5:
                    System.out.println("*******MODIFICAR NOTA**********");
                    nuevaNota = modificarDatos(miClase, tope, entrada);

                    break;

                case 6:
                    System.out.println("*******MOSTRAR LA NOTA ESCRITA**********");
                    mostrarEscrito(miClase, tope, entrada);

                    break;

                case 7:
                    System.out.println("*******MOSTRAR LA PEOR NOTA**********");
                    min = minArray(miClase, tope);
                    System.out.println("La peor nota es:" + min);
                    posicion = buscarNotas(miClase, tope, min);
                    System.out.println("El alumno con la peor nota es " + (posicion + 1));
                    break;

                case 8:
                    System.out.println("*******MOSTRAR LAS NOTAS DE PORCENTAJE**********");
                    modificarPocerntaje(miClase, tope, entrada);
                    break;

                // APARTADO B

                case 9:
                    System.out.println("*******RELLENAR MATRIZ**********");
                    rellenarMatriz(matriz, entrada);
                    break;

                case 10:
                    System.out.println("*********MOSTRAR MATRIZ********");
                    mostrarMatriz(matriz);
                    break;

                case 11:
                    System.out.println("*********BUSCAR ELEMENTO EN LA MATRIZ********");
                    buscarMatriz(matriz, entrada);
                    break;

                case 12:
                    System.out.println("*********MODIFICAR ELEMENTO EN LA MATRIZ********");
                    modificarMatriz(matriz, entrada);
                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 13);
    }
}
