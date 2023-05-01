/*Escribir un programa que llame un método que calcule
 el promedio de la suma de valores enteros entre 1 y 1000. Finalmente, el resultado debe mostrarse por pantalla.*/

public class Ejemplo_3 {
    public static final int MIN =1;
    public static final int MAX=1000;
    public static void main (String []args){
        int promedio = calcular_promedio();
        imprimir(promedio);
    }

    public static int calcular_promedio(){
        int suma=0;
        int promedio=0;
        for(int i=MIN; i<=MAX; i++){
            suma+=i;
            promedio=suma/(MAX-MIN+1);
        }
        return promedio;
    }
    public static void imprimir(int promedio){
        System.out.println("El promedio es: "+promedio);
    }
}
