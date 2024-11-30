/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 * /**
 * A class that models a pizza cutter.
 * Implements Singleton Design Pattern to ensure only one instance exists.
 * Note: Public variable `numSlices` has been refactored for encapsulation (OCP).
 * @author modified by KamrulHasan
 */
 
 public class PizzaCutter {

    private static PizzaCutter instance = null; // Singleton instance
    private int numSlices; // Number of slices (now private)

    // Private constructor prevents instantiation
    private PizzaCutter() {
    }

    // Public static method to get the Singleton instance
    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();
        }
        return instance;
    }

    // Getter and setter for numSlices to follow OCP
    public void setNumSlices(int slices) {
        if (slices > 0) {
            this.numSlices = slices;
        } else {
            System.out.println("Invalid number of slices!");
        }
    }

    public int getNumSlices() {
        return numSlices;
    }
}