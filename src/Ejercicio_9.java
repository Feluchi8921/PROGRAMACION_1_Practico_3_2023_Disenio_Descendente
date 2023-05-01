/*Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10,
pida ingresar un carácter, y por cada carácter ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario en mayúscula;
c. “dígito” si el caracter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_9 {
    public static final int MIN =1;
    public static final int MAX=10;
    public static void main (String []args){
    int numero=obtener_entero();
    String texto;
    while(numero>MIN && numero<MAX){
        char c= obtener_caracter();
        if(c>='a'&&c<='z'){
            texto="minuscula";
            imprimir(texto, c);
        }
        else if(c>='A'&&c<='Z'){
            texto="mayuscula";
            imprimir(texto, c);
        }
        else if(c>='0'&&c<='9'){
            texto="digito";
            imprimir(texto, c);
        }
        else{
            texto="otro";
            imprimir(texto, c);
        }
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
    public static void imprimir(String texto, char c){
        System.out.println("El caracter "+c+" es "+texto);
    }
}
