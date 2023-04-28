/* Escribir un diseño de programa que mientras que el usuario ingrese un carácter dígito
o carácter letra minúscula, imprima dicho carácter, y si es carácter letra minúscula, imprima si es vocal o consonante.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_2 {
    public static void main (String []args){
        char c;
        String texto;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("Ingrese un caracter");
                c = entrada.readLine().charAt(0);
                if (!(c >= '0' && c <= '9')) {
                    if ((c >= 'a' && c <= 'z') && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                        texto = "letra minuscula";
                        imprimir_caracter(c, texto);
                    } else {
                        texto = "consonante";
                        imprimir_caracter(c, texto);
                    }
                }
            }
                while ((c >= '0' && c <= 9) || (c >= 'a' && c <= 'z')) ;

        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
    public static void imprimir_caracter(char c, String texto ){
        System.out.println("El caracter "+c+" es "+texto);
    }
}
