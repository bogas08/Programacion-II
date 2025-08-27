
package ejer3;
import java.util.Scanner;
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        Estadistica stats = new Estadistica(numeros);
        double prom = stats.getPromedio();
        double dev = stats.getDesviacion();
        
        System.out.printf("El promedio es ", prom);
        System.out.printf("La desviación estándar es %.5f%n", dev);
        
        
    }
}