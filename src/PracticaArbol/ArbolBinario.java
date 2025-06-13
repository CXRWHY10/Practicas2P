package PracticaArbol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArbolBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> edades = new ArrayList<>();

        // Ingresar edades
        System.out.println("Ingrese las edades (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Edad: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int edad = Integer.parseInt(input);
                edades.add(edad);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número o 'fin' para terminar.");
            }
        }

        // Ordenar edades
        Collections.sort(edades);

        // Mostrar en una sola línea
        System.out.println("\nArbol Binario");
        for (int i = 0; i < edades.size(); i++) {
            System.out.print(edades.get(i));
            if (i < edades.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Para salto de línea final

        scanner.close();
        System.out.println("Programa terminado.");
    }
}