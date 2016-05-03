package org.pizza.ingredient.factory;

import org.pizza.ingredient.dough.Dough;
import org.pizza.ingredient.sauce.Sauce;
import org.pizza.ingredient.cheese.Cheese;
import org.pizza.ingredient.veggie.Veggie;
import org.pizza.ingredient.pepperoni.Pepperoni;
import org.pizza.ingredient.clam.Clam;

import org.pizza.ingredient.dough.ThinCrustDough;
import org.pizza.ingredient.sauce.MarinaraSauce;
import org.pizza.ingredient.cheese.ReggianoCheese;
import org.pizza.ingredient.veggie.*;
import org.pizza.ingredient.pepperoni.SlicedPepperoni;
import org.pizza.ingredient.clam.FreshClam;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
