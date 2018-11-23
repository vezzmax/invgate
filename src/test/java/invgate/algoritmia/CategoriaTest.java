package invgate.algoritmia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import invgate.algoitmia.Arbol;
import invgate.algoitmia.Nodo;

public class CategoriaTest {

    @Test
    public void imprimir1NodoEjemplo1() {
        Arbol arbol = new Arbol(new Nodo("A"));
        arbol.agregarNodo("A", "B");
        arbol.agregarNodo("B", "C");
        arbol.agregarNodo("A", "D");
        arbol.agregarNodo("D", "E");
        arbol.agregarNodo("D", "F");
        arbol.agregarNodo("F", "G");
        arbol.agregarNodo("A", "X");
        System.out.print(arbol.imprimirArbolAlfabeticamente());
    }

    @Test
    public void imprimirNodoEjemplo2() {
        Arbol arbol = new Arbol(new Nodo("Genero"));
        arbol.agregarNodo("Genero", "Rock");
        arbol.agregarNodo("Rock", "Nacional");
        arbol.agregarNodo("Nacional", "Viejito");
        arbol.agregarNodo("Nacional", "Moderno");
        arbol.agregarNodo("Rock", "Extranjero");
        arbol.agregarNodo("Genero", "Jazz");
        System.out.print(arbol.imprimirArbolAlfabeticamente());
    }

    @Test
    public void imprimirNodoEjemplo3() throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("src/main/resources/test_case_3"));
        String line = reader.readLine();
        String[] nodos = line.split(" ");
        Arbol arbol = new Arbol(new Nodo(nodos[0]));
        while (line != null) {
            nodos = line.split(" ");
            if (nodos.length > 2) {
                throw new RuntimeException("El archivo tiene lineas con más de 2 nodos");
            }
            arbol.agregarNodo(nodos[0], nodos[1]);
            // read next line
            line = reader.readLine();
        }
        reader.close();
        System.out.print(arbol.imprimirArbolAlfabeticamente());
    }

}
