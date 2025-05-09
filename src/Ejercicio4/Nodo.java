package Ejercicio4;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguiente;

    public Nodo(){
    }
    public Nodo getAnterior() {
        return anterior;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public Object getDato() {
        return dato;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }
}
