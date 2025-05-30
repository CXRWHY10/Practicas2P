package EjerciciosEnClase;
//Comparar 2 vectores utilizando recursividad

public class CompararVectores {
    public static void main(String[]args){
        int[] vector1 = {1,2,3,4,5};
        int[] vector2 = {1,2,3,4,5};
        if (Comparacion(vector1,vector2, 0)){
            System.out.println("Son iguales :)");
        }else{
            System.out.println("No son iguales inge que macana :(");
        }
    }
    public static boolean Comparacion(int[] vector1, int[] vector2, int n){
        if (n == vector1.length && n == vector2.length){
            return true;
        }
        if (n >= vector1.length || n>= vector2.length){
            return false;
        }
        if (vector1[n] != vector2[n]) {
            return false;
        }
        return Comparacion(vector1, vector2, n + 1);
    }
}
