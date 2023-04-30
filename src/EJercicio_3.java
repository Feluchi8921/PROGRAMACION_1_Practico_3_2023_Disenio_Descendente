/*Escribir un diseño de programa que mientras que el usuario ingrese un número natural,
 pida ingresar otro número cualquiera y lo imprima.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EJercicio_3 {
    public static void main (String []args){
        int numero;
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            while(numero>0) {
                System.out.println("Ingrese un numero");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
