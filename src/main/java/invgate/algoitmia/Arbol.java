package invgate.algoitmia;

import java.util.Stack;
import java.util.TreeSet;

public class Arbol {

    private Nodo raiz;

    public Arbol (Nodo laRaiz) {
        raiz = laRaiz;
    }

    public void agregarNodo(String elPadre, String nombre) {
        raiz.agregarNodo(elPadre,nombre);
    }

    public String imprimirArbolAlfabeticamente() {
        TreeSet<String> ramas = new TreeSet<String>();
        raiz.crearCaminos(new Stack<String>(),ramas);
        StringBuffer stringRamas = new StringBuffer();
        for (String rama: ramas) {
            stringRamas.append(rama + "\n");
        }
        return stringRamas.toString();
    }
}
