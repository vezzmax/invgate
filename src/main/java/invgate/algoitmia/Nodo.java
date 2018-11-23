package invgate.algoitmia;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class Nodo {

    private String nombre;

    private List<Nodo> hijos  = new ArrayList<Nodo>();

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarNodo(String padre, String nombre) {
        if (this.nombre.equals(padre)) {
            hijos.add(new Nodo(nombre));
        } else {
            for (Nodo hijo : hijos) {
                hijo.agregarNodo(padre, nombre);
            }
        }
    }

    public boolean esHoja() {
        return hijos.isEmpty();
    }

    public void crearCaminos(Stack<String> caminos, TreeSet<String> ramas) {
        caminos.push(this.nombre);
        if (this.esHoja()) {
            ramas.add(getCaminoInvertido(caminos));
        } else {
            for (Nodo nodo: hijos) {
                nodo.crearCaminos(caminos, ramas);
                caminos.pop();
            }
        }

    }

    private String getCaminoInvertido(Stack<String> caminos) {
        StringBuffer camino = new StringBuffer();
        Stack<String> invertido = new Stack<String>();
        invertido.addAll(caminos);
        while (!invertido.isEmpty()) {
            camino.append(invertido.pop() + " ");
        }
        return camino.toString();
    }
}
