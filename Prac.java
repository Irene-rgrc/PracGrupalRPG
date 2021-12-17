package P8C;


import java.util.Scanner;
import java.io.*;

//CLASES
class Alumno implements Serializable {
    String nombre;
    int edad;
    double nota;
    int matricula;
}

public class Prac8C {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

        // DEFINICION DE VARIABLES
        int option, posicion;
        int tope = 0;
        int dato = 0;
        double nuevaNota, min;

        Scanner entrada = new Scanner(System.in);
        Alumno[] miClase = new Alumno[20];
        for (int i = 0; i < miClase.length; i++) {
            miClase[i] = new Alumno();
        }

        // Creacion de matriz bidimensional
        System.out.println("De cuantas filas quieres crear la tabla");
        int m = entrada.nextInt();
        System.out.println("De cuantas columnos quieres crear la tabla");
        int n = entrada.nextInt();

        int matriz[][] = new int[m][n];

        do {
            System.out.println("Menu : ");
            System.out.println("1. Introducir notas.");
            System.out.println("2. Mostrar notas.");
            System.out.println("3. Calcular estadísticas:");
            System.out.println("4. Mostrar la nota de un alumno concreto.");
            System.out.println("5. Modificar la nota de un alumno concreto");
            System.out.println("6. Mostrar la nota escrita");
            System.out.println("7.Mostrar la nota del alumno con peor nota");
            System.out.println("8. Modificar todas las notas en un porcentaje,");
            System.out.println("9. Rellenar matriz");
            System.out.println("10. Mostrar matriz");
            System.out.println("11. Buscar un elemento en la matriz");
            System.out.println("12. Modificar un elemento en la matriz");
            System.out.println("13. Escribir (Guardar) el array en fichero Binario");
            System.out.println("14. Leer del Fichero Binario y Cargar en el array");
            System.out.println("15. Salir ");
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

                case 13:
                    System.out.println("*********ESCRIBRIR (GUARDAR) EL ARRAY EN FICHERO BINARIO********");
                    guardarFichero(miClase, tope);
                    break;

                case 14:
                    System.out.println("*********LEER FICHERO EN BINARIO Y CARGAR EN EL ARRAY********");
                    int y = 0;
                    try {
                        Alumno alumno;
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream("notas.dat"));
                        //Alumno alumno = (Alumno) in.readObject();
                        alumno = (Alumno) in.readObject();
                        while (alumno.nombre != null) {
                            miClase[y] = alumno;
                            y++;
                            alumno = (Alumno) in.readObject();
                        }
                        in.close();
                    } catch (IOException e2) {
                        System.out.println(e2.getMessage());
                    }
                    tope = y;
                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 15);
    }
}
