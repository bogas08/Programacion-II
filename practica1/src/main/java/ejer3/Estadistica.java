package ejer3;
public class Estadistica {
    
    private double[] numeros;

    
    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    
    public double getPromedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    
    public double getDesviacion() {
        double prom = getPromedio();
        double sumaCuadrados = 0;
        
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}



    
