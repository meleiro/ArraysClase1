import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        // Pedir al usuario los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n Recorrido con FOR:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }

        System.out.println("\n Recorrido con FOR-EACH:");
        int contador = 1;
        for (int numero : numeros) {
            System.out.println("Elemento " + contador + ": " + numero);
            contador++;
        }

        System.out.println("\n Recorrido con WHILE:");
        int i = 0;
        while (i < numeros.length) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
            i++;
        }

        System.out.println("\n Recorrido con STREAM:");
        Arrays.stream(numeros).forEach(n -> System.out.println("Elemento: " + n));

        // Sumar con foreach
        int sumaForeach = 0;
        for (int numero : numeros) {
            sumaForeach += numero;
        }
        System.out.println("\n Suma con FOR-EACH: " + sumaForeach);

        // Sumar con stream
        int sumaStream = Arrays.stream(numeros).sum();
        System.out.println("Suma con STREAM: " + sumaStream);
    }
}
