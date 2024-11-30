/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 * A class that represents a basic pizza.
 * Refactored to follow DRY principle: `bake` logic centralized in Pizza class.
 * @author modified by KamrulHasan
 */
public class Pizza 
{
    public int bakeTemp = 100;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
    public void bake(int temp)
    {
        this.bakeTemp = temp;
        
        //do some baking here, code not implemented yet
        //not necessary for the review
        System.out.println("Baking pizza at " + this.bakeTemp + "degrees.");
    }
    
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    // Method to add toppings to the ingrediants list
    public void addTopping(String topping)
    {
        ingredients.add(topping);
    }
}
