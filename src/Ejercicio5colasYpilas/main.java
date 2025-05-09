package Ejercicio6colasYpilas;

public class main {
    public static void main(String[]args){
        /*Colas colas = new Colas();
        System.out.println(colas.estaVacia());
        for (int i = 1; i <= 5; i++) {
            colas.insetar(i);
        }
        colas.mostrar();

        colas.eliminar();
        colas.eliminar();
        colas.mostrar();*/

        Pilas pilas = new Pilas();
        System.out.println(pilas.estaVacia());

        for (int i = 1; i <= 5; i++) {
            pilas.insetar(i);
        }

        pilas.mostrar();

        pilas.eliminar();
        pilas.eliminar();
        pilas.eliminar();

        pilas.mostrar();
    }
}
