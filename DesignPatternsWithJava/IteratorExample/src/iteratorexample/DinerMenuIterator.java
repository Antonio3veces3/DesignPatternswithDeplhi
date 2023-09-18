/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

/**
 * Concrete Iterator
 * @author aanto
 */
public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if(this.position >= this.items.length || this.items[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[this.position];
        this.position = this.position + 1;
        return menuItem;
    }
    
}
