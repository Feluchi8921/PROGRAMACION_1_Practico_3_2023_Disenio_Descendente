/*Escribir un diseño de programa que mientras que el usuario ingrese un número distinto de 0,
pida ingresar otro número y lo imprima.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_1 {
    public static void main (String []args) {
        int numero_1 = obtener_numero();
        while (numero_1!=0) {
                int numero_2 = obtener_numero();
                imprimir_numero(numero_2);
                obtener_numero();
        }
    }
        public static int obtener_numero() {
        int numero=0;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Ingrese un numero");
                numero = Integer.valueOf(entrada.readLine());
            } catch (Exception exc) {
                System.out.println(exc);
            }
            return numero;
        }

    public static void imprimir_numero(int numero){
        System.out.println("El numero ingresado es: "+numero);
    }
}
