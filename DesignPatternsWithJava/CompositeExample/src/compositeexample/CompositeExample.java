/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositeexample;

/**
 *
 * @author aanto
 */
public class CompositeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Menus
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner food");
        MenuComponent lunchMenu = new Menu("LUNCH MENU", "Lunch food");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert food");
        MenuComponent drinksMenu = new Menu("DRINKS MENU", "Drinks");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);
        // create Menu nested
        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with salad",
                true,
                3.90
        ));

        dinnerMenu.add(new MenuItem(
                "Sushi",
                "Autlan kukara",
                true,
                4.00
        ));

        dinnerMenu.add(new MenuItem(
                "Baguette",
                "Chicken with lettuce",
                true,
                3.00
        ));

        drinksMenu.add(new MenuItem(
                "Soda",
                "Coca-cola, Sprite, Sidral",
                false,
                1.2
        ));

        drinksMenu.add(new MenuItem(
                "Coffee",
                "American, express, late",
                false,
                0.7
        ));

        dessertMenu.add(new MenuItem(
                "Cheescake",
                "Style New York",
                false,
                2.5
        ));

        dessertMenu.add(new MenuItem(
                "Brownie",
                "The best brownie",
                false,
                1.0
        ));

        lunchMenu.add(new MenuItem(
                "Torta",
                "Adobada con jamon",
                false,
                3.6
        ));

        lunchMenu.add(new MenuItem(
                "Sandwich",
                "Panela con jamon",
                true,
                3.6
        ));

        lunchMenu.add(new MenuItem(
                "Eggs",
                "Revueltos y estrellados",
                true,
                0.5
        ));
        lunchMenu.add(new MenuItem(
                "Hot cakes",
                "With jam",
                true,
                2.5
        ));
        
        dinnerMenu.add(drinksMenu);
        dinnerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenuComposite();
        waitress.printVeggieMenu();
    }
}
