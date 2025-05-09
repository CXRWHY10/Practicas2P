package Ejercicio6colasYpilas;

import Ejercicio1.ListaSimplementeEnlazada;
import Ejercicio1.Nodo;

public class Colas extends ListaSimplementeEnlazada {
    @Override
    public void insetar(Object dato) {
        if (estaVacia()){
            Nodo nuevo = new Nodo(dato,null);
            primero = nuevo;
        }else {
            Nodo ultimo = primero;
            while (ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
}
