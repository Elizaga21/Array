import java.util.Scanner;

public class ejercicio_4 {
        public static void main(String[] args) {
            Scanner sc;


            int[] numeros = new int[10];
            double suma = 0, media;
            int mayor;
            mayor = numeros [0];


            int i;
            for (i = 1; i < numeros.length; i++) {
                int aleat = (int) (Math.random() * 10 + 1);
                System.out.println(aleat + "");
                numeros[i] = aleat;
            }

            int opcion;
            sc = new Scanner(System.in);

            System.out.println("1)Mostrar Array.");
            System.out.println("2)Conocer el mayor de los números.");
            System.out.println("3)Obtener la media de los números.");
            System.out.println("4)Salir del programa \n");

            System.out.print("Seleciona una opción del menú:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Array:");
                    for (i = 1; i <= numeros.length; i++) {
                        {
                            System.out.print(" " + numeros[i]);
                        }
                        System.out.println();

                    }
                }
                case 2 -> {
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] > mayor) {
                            mayor = numeros[i];
                        }
                    }
                    System.out.println("El mayor es: " + mayor);
                }
                case 3 -> {
                    for (i = 0; i < numeros.length; i++) {
                        suma = suma + numeros[i];
                    }
                    media = suma / numeros.length;
                    System.out.println("Media: " + media);
                }
                case 4 -> System.out.println("Has finalizado el programa");
                default -> System.out.println("Las opciones de cálculo son entre 1 y 3, la opción 4 es para salir");
            }


            System.out.println("Fin del menú");


        }


            }

