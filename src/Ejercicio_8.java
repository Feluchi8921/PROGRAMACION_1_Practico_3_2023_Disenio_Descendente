/* Realizar un programa que dado dos números enteros y un carácter,
todos ingresados por el usuario, muestre por pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_8 {
    public static void main(String[] args) {
        int numero_1 = obtener_entero();
        int numero_2 = obtener_entero();
        char c = obtener_caracter();
        String texto;
        switch (c){
            case 'a':
                int suma = numero_1 + numero_2;
                texto="+";
                imprimir(numero_1, numero_2, texto, suma);
                break;
            case 'b':
                int resta = numero_1 - numero_2;
                texto="-";
                imprimir(numero_1, numero_2, texto, resta);
                break;
            case 'c':
                int multiplicacion = numero_1 * numero_2;
                texto="*";
                imprimir(numero_1, numero_2, texto, multiplicacion);
                break;
            case 'd':
                int division = numero_1 / numero_2;
                texto="/";
                imprimir(numero_1, numero_2, texto, division);
            default:
                break;
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
    public static char obtener_caracter(){
        char c=' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter");
            c = entrada.readLine().charAt(0);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return c;
    }
    public static void imprimir(int numero_1, int numero_2, String texto, int operacion){
        System.out.println(numero_1+texto+numero_2+" = "+operacion);
    }
}
