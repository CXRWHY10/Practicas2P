package Ejercicio4;

public class Main {
    public static void main(String[]args) {
        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();

        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        for (int i = 1; i <= 5; i++) {
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.Mostrar();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.Mostrar();

        listaCircularDoblementeEnlazada.mostarAdelante(8);
        listaCircularDoblementeEnlazada.mostarAtras(8);
    }
}
