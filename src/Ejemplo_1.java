/*Si se ingresa un nro > 0, imprime la tabla de multiplicar del 5*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejemplo_1 {
    public static final int MIN=0;
    public static final int MAX=10;
    public static final int cte=5;
    public static void main (String []args){
        int numero=obtener_numero();
        if(numero!=0){
            imprimir_tabla_5();
        }
    }
    public static int obtener_numero(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero: ");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static void imprimir_tabla_5(){
        for(int i=MIN; i<=MAX; i++){
            System.out.println(i+"*"+cte+"="+i*cte);
        }
    }
}
