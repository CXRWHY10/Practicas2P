package Ejercicio3;

public class Main3 {
    public static void main(String[]args){
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        listaCircularSimplementeEnlazada.estaVacia();
        listaCircularSimplementeEnlazada.tamaño();

        for (int i = 1; i <= 12; i++) {
            listaCircularSimplementeEnlazada.InsertarFin(i);
        }
        listaCircularSimplementeEnlazada.Mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        listaCircularSimplementeEnlazada.EliminarFin();
        listaCircularSimplementeEnlazada.EliminarFin();

        listaCircularSimplementeEnlazada.Mostrar();

        listaCircularSimplementeEnlazada.MostrarCircular(2);
    }
}
