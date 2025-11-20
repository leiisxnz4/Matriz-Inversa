import java.io.*;
import java.util.*;

public class MatrizInversa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Archivo de entrada
            System.out.print("Nombre del archivo de entrada: ");
            String archivoEntrada = sc.nextLine();

            File file = new File(archivoEntrada);
            Scanner lector = new Scanner(file);

            // Leer matriz 2x2
            double[][] A = new double[2][2];

            System.out.println("\n--- MATRIZ LEÍDA ---");
            for (int i = 0; i < 2; i++) {
                A[i][0] = lector.nextDouble();
                A[i][1] = lector.nextDouble();
                System.out.println(A[i][0] + " " + A[i][1]);
            }
            lector.close();

            // Cálculo del determinante
            double det = A[0][0] * A[1][1] - A[0][1] * A[1][0];

            if (det == 0) {
                System.out.println("\nLa matriz NO tiene inversa (determinante = 0).");
                return;
            }

            // Matriz inversa (fórmula 2x2)
            double[][] inv = new double[2][2];
            inv[0][0] =  A[1][1] / det;
            inv[0][1] = -A[0][1] / det;
            inv[1][0] = -A[1][0] / det;
            inv[1][1] =  A[0][0] / det;

            // Archivo de salida
            System.out.print("\nNombre del archivo de salida: ");
            String archivoSalida = sc.nextLine();

            PrintWriter writer = new PrintWriter(archivoSalida);

            System.out.println("\n--- MATRIZ INVERSA ---");
            for (int i = 0; i < 2; i++) {
                System.out.println(inv[i][0] + " " + inv[i][1]);
                writer.println(inv[i][0] + " " + inv[i][1]);
            }

            writer.close();
            System.out.println("\n✓ Archivo generado correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
