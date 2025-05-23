//Suma de los elementos de un vector con recursividad
package EjerciciosEnClase;
public class sumaVector {
    public static void main(String[]args){
        int [] vector = {1,2,3,4,5,6,7,8,9,10};
        int sumaDelVector = Suma(vector, vector.length);
        System.out.println("La suma del vector es: "+sumaDelVector);
    }
    public static int Suma(int vector[], int n){
        if (n <= 0){
            return 0;
        }
        return vector[n - 1] + Suma (vector, n - 1);
    }

}
