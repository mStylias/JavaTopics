package com.StyleM;

// An example of a singleton class utilizing a private constructor
// Its purpose in this example is to store all the available colors that a car can have
class CarColors {
    // Static variable reference of single_instance
    // of type CarColors
    private static CarColors single_instance = null;

    // Declaring an array of strings representing the available colors of the cars
    private String[] availableColors;

    // Getter for availableColors
    public String[] getAvailableColors() {
        return availableColors;
    }

    // Constructor
    // Here we will be creating a private constructor
    // restricted to this class itself
    private CarColors()
    {
        availableColors = new String[] { "Red", "Blue", "White", "Silver" };
    }

    // Static method to get or create if it doesn't already exist
    // an instance of the Singleton class
    public static CarColors getInstance()
    {
        if (single_instance == null)
            single_instance = new CarColors();

        return single_instance;
    }
}