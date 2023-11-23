/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifestyletracker;

/**
 *
 * @author sbc-student
 */
public class Food {

    private String foodName;
    private double foodCalories;

    public Food(String foodName, double foodCalories) {
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodCalories() {
        return foodCalories;
    }

    public double updateCalories(double newfoodCalories) {
        return this.foodCalories = newfoodCalories;
    }

    @Override
    public String toString() {
        return "Food{" + "foodName=" + foodName + ", foodCalories=" + foodCalories + '}';
    }
    
}
