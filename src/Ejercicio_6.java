/*Escribir un programa que mientras el usuario cargue desde teclado un carácter letra minúscula,
 llame a un método que imprime por pantalla la tabla de multiplicar del 9.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_6 {
    public static final int cte=9;
    public static final int MAX=10;
    public static void main (String []args){
        char c;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un caracter");
            c=entrada.readLine().charAt(0);
            while(c>='a' && c<='z'){
                imprimir_tabla_9(cte);
                System.out.println("Ingrese un caracter");
                c=entrada.readLine().charAt(0);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
    public static void imprimir_tabla_9(int cte){
        for(int i=0; i<=MAX;i++) {
            System.out.println(cte+"*"+i+"="+cte*i);
        }
    }

}
