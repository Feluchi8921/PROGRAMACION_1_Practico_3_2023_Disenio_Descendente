/*Escribir un programa que mientras el usuario cargue desde teclado un número entero distinto de 0,
imprima por pantalla la suma que se obtiene de invocar un método que calcula la sumatoria de los primeros 200
 números naturales (son números enteros entre 1 y 200).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_7 {
    public static final int MIN=1;
    public static final int MAX=200;

    public static void main (String []args) {
        int numero=obtener_entero();
        while (numero != 0) {
            int sumatoria = calcular_sumatoria(MIN, MAX);
            System.out.println(sumatoria);
            obtener_entero();
        }
    }
    public static int obtener_entero(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
    public static int calcular_sumatoria(int MIN, int MAX){
        int sumatoria=0;
        for(int i=MIN; i<=MAX;i++){
            sumatoria+=i;
        }
        return sumatoria;
    }
}

