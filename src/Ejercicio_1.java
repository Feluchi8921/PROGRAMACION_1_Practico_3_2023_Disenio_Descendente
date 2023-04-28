import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un diseño de programa que mientras que el usuario ingrese un número distinto de 0,
pida ingresar otro número y lo imprima.
 */
public class Ejercicio_1 {
    public static void main (String []args){
        int numero_1, numero_2;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Ingrese un numero");
                numero_1 = Integer.valueOf(entrada.readLine());
                while (numero_1 != 0) {
                    System.out.println("Ingrese un numero");
                    numero_2 = Integer.valueOf(entrada.readLine());
                    imprimir_numero(numero_2);
                }

            }
            catch(Exception exc){
              System.out.println(exc);
            }
    }
    public static void imprimir_numero(int numero){
        System.out.println("El numero ingresado es: "+numero);
    }
}
