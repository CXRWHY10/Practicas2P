package Ejercicio1;

public class ListaSimplementeEnlazada {

    protected Nodo primero;

    public ListaSimplementeEnlazada(){
        primero = null;
    }
    public boolean estaVacia(){
        return  primero == null;
    }

    public void insetar (Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo(dato,null);
            primero = nuevo;
        }else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }
    }
    public void eliminar(){
        if (!estaVacia()){
            primero = primero.getSiguiente();
        }
    }
    public void mostrar(){
        Nodo tpm = primero;
        while(tpm != null){
            System.out.print(tpm.getDato()+ "  ");
            tpm = tpm.getSiguiente();
        }
        System.out.println();
    }
}
