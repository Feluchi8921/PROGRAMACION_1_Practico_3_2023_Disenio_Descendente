/*Usando diseño descendente con al menos un método (función o
procedimiento), escribir un programa que pida por teclado un carácter e
imprima si es dígito (0..9), si es vocal o consonante (pueden suponer todas
minúsculas, mayúsculas o ambas) o si es cualquier otro carácter. En todos
los casos debe imprimir cuál fue el carácter ingresado.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejemplo_2 {
    public static void main (String []args){
        String texto;
        char c=obtener_caracter();
        if(c>='0' && c<='9'){
            texto="es digito";
            imprimir(c, texto);
        }
        else if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                ||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
            if ((c=='a'||c=='e'||c=='i'||c=='o'||c=='u')||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
                texto = "es vocal";
                imprimir(c, texto);
            }
            else{
                texto = "es consonante";
                imprimir(c, texto);

            }
        }
        else {
            texto="Es caracter";
            imprimir(c, texto);

        }
    }
    public static char obtener_caracter(){
        char c=' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un caracter: ");
            c=entrada.readLine().charAt(0);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return c;
    }
    public static void imprimir(char c, String texto){
        System.out.println("El caracter "+c+" es "+texto);
    }
}
