package Ejercicio2;

public class Main2 {
    public static void main(String[]args){
        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i = 20; i > 0 ; i--) {
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.MostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.MostrarAdelante();
        listaDoblementeEnlazada.MostrarAtras();
    }

}
