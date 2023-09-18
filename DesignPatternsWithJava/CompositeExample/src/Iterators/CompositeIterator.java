/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterators;

import compositeexample.Menu;
import compositeexample.MenuComponent;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author aanto
 */
public class CompositeIterator implements Iterator {

    // Pila para guardar los iterators
    Stack stack = new Stack();

    // Al crear esta clase debemos recibir un Iterador previamente creado.
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        // Si el stack esta vacio, entonces ya no hay iteradores que manejar.
        if (this.stack.empty()) {
            return false;
        } else {
            // Obtenemos el iterador top del stack
            Iterator iterator = (Iterator) this.stack.peek();
            // Si el iterador ya no tiene elementos, entonces lo eliminamos del stack.
            // y llamamos se ejecuta nuevamente la funcion.
            if (!iterator.hasNext()) {
                this.stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        // nos aseguramos de que existan elementos en el stack
        if (hasNext()) {
            // obtenemos el iterador top del stack
            Iterator iterator = (Iterator) this.stack.peek();
            // obtenemos el siguiente elemento dentro de la listaa del iterador.
            MenuComponent component = (MenuComponent) iterator.next();
            // Si el elemento es un nodo, quiere decir que tiene elementos hijos.
            // de lo contrario es una hoja, por lo tanto lo regresamos directamente.
            if (component instanceof Menu) {
                // Con esto nos aseguramos de que no haya iteradores duplicados en el Stack.
                // Si el iterador no existe en la pila, entonces lo agrega.
                // de lo contrario no agrega el iterador
                this.stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
