package ejer2;

import java.util.Scanner;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        ecuacionesCuadraticas ecuacion = new ecuacionesCuadraticas(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        
        if (discriminante > 0) {
            double r1 = ecuacion.getRaiz1();
            double r2 = ecuacion.getRaiz2();
            System.out.printf("La ecuación tiene dos raíces %.6f y %.6f%n", r1, r2);
        } else if (discriminante == 0) {
            double r1 = ecuacion.getRaiz1();
            System.out.printf("La ecuación tiene una raíz %.6f%n", r1);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
        
    }
}


