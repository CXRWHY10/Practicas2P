package EjerciciosEnClase;
//calcular el maximo de un vector utilizando recursividad
public class calcularMaximo {
    public static void main (String[]args){
        int[] vector = {5,8,7,3};
        System.out.println("El màximo nùmero del vector es: "+Maximo(vector, 0, vector[0]));
    }
    public static int Maximo(int[]vector,int n ,int max){
        if (n == vector.length){
            return max;
        }
        if (vector[n] > max){
            max = vector[n];
        }
        return Maximo(vector, n + 1, max);
    }
}
