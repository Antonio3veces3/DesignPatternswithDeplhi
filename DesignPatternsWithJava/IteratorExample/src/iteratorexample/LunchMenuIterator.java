/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorexample;

import java.util.ArrayList;

/**
// Concrete Iterator
 * @author aanto
 */
public class LunchMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;
    
    public LunchMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if(this.position >= this.items.size() || this.items.get(this.position) == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(this.position);
        this.position = this.position + 1;
        return menuItem;
    }
    
}
