package Ejercicio6colasYpilas;

import Ejercicio1.Nodo;

public class Pilas extends Colas{
    @Override
    public void eliminar() {
        if (!estaVacia()){
            Nodo ultimo = primero;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() != null){
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }

            penultimo.setSiguiente(null);
        }
    }
}
