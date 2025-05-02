package Ejercicio1;

public class Main {
    public static void main(String[]args){
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();

        System.out.println(listaSimplementeEnlazada.estaVacia());

        //Insertar elementos a nuestra lista
        listaSimplementeEnlazada.insetar(5);
        listaSimplementeEnlazada.insetar(4);
        listaSimplementeEnlazada.insetar(3);
        listaSimplementeEnlazada.insetar(2);
        listaSimplementeEnlazada.insetar(1);
        listaSimplementeEnlazada.insetar(0);

        //Mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();

        //Eliminamos algun dato
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //Mostarmos nuestra lista
        listaSimplementeEnlazada.mostrar();
    }
}
