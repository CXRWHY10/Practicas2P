package Recursividad;

public class Ejercicios {
    public static int Factorial(int n){
        int factorial = 0;
        if (n == 1){
            factorial = 1;
        }else{
            factorial = n * Factorial(n - 1);
        }
        return factorial;
    }
}
