package lesson4.third.pizza;

import lesson4.third.idfactory.PizzaIngredientFactory;

/**
 * created by ycc at 2018\3\7 0007
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "cheese pizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + pizzaIngredientFactory.getDescription() + " " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        System.out.println("prepared");
    }
}
