/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un valor MAX = 4 (constante).
Mientras itera deberá imprimir el número. Luego invocarlo desde el programa principal y cuando
termina imprimir por pantalla “terminó”.
*/
public class Ejercicio_5 {
    public static final int MAX=4;
    public static void main (String []args){
        int numero=1;
        String texto="terminó";
        iterar_numero(numero);
        System.out.println("termino");
    }
    public static void iterar_numero(int numero){
        while(numero<=MAX){
            imprimir (numero++);
        }
    }
    public static void imprimir(int numero){
        System.out.println(numero);
    }
}
