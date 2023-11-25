/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifestyletracker;

import java.util.ArrayList;

/**
 *
 * @author sbc-student
 */
public class LifestyleTracker {

    //list(database) of food and activities
    private ArrayList<Food> foodList = new ArrayList<Food>();
    private ArrayList<Activity> activityList = new ArrayList<Activity>();
    //for records
    private ArrayList<String> foodHistory = new ArrayList<>();
    private ArrayList<String> activityHistory = new ArrayList<>();
    //for tracking calories
    private double totalCaloriesEaten;
    private double totalCaloriesBurned;

    public LifestyleTracker() {
    }

    public String addFood(String foodName, double foodCalorie) {
        for (Food f : foodList) {
            if (f.getFoodName().equals(foodName)) {
                f.updateCalories(foodCalorie);
                return foodName + " already exists. Calorie value updated.";
            }
        }

        Food newFood = new Food(foodName, foodCalorie);
        foodList.add(newFood);
        return "New food " + foodName + " added.";
    }

    public String addActivity(String activityName, double actCalorieValue) {
        for (Activity a : activityList) {
            if (a.getActivityName().equals(activityName)) {
                a.updateCalories(actCalorieValue);
                return activityName + " already exists. Calorie value updated.";
            }
        }

        Activity newActivity = new Activity(activityName, actCalorieValue);
        activityList.add(newActivity);
        return "New activity " + activityName + " added.";

    }

    public String eat(String foodName, double foodServings) {
        if (foodServings < 0) {
            return foodName + " servings must be >= 0";
        }

        Food food = findFood(foodName);
        if (food == null) {
            return "Food " + foodName + " does not exist";
        }

        String entry = foodServings + " servings of " + foodName;
        foodHistory.add(entry);
        totalCaloriesEaten += foodServings * food.getFoodCalories();

        return entry + " recorded.";
    }

    private Food findFood(String foodName) {
        for (Food f : foodList) {
            if (f.getFoodName().equals(foodName)) {
                return f;
            }
        }
        return null;
    }

    public String perform(String activityName, double activityHours) {
        if (activityHours < 0) {
            return activityName + " hours must be >= 0";
        }

        Activity activity = findActivity(activityName);
        if (activity == null) {
            return "Activity " + activityName + " does not exist";
        }

        String entry = activityHours + " hours of " + activityName;
        activityHistory.add(entry);
        totalCaloriesBurned += activityHours * activity.getActCalorieValue();

        return entry + " recorded.";
    }

    private Activity findActivity(String activityName) {
        for (Activity a : activityList) {
            if (a.getActivityName().equals(activityName)) {
                return a;
            }
        }
        return null;
    }

    public String report() {
        String report = "";

        report += "Food Eaten:\n";
        for (String food : foodHistory) {
            report += food + "\n";
        }
        report += "Total Calories Consumed: " + totalCaloriesEaten + "\n\n";

        report += "Activities Performed:\n";
        for (String activity : activityHistory) {
            report += activity + "\n";
        }
        report += "Total Calories Burned: " + totalCaloriesBurned + "\n\n";

        double netCalories = totalCaloriesEaten - totalCaloriesBurned;
        if (netCalories < 0) {
            report += "Predicted Weight Loss: " + Math.abs(netCalories) / 3500 + " lbs";
        } else if (netCalories > 0) {
            report += "Predicted Weight Gain: " + netCalories / 3500 + " lbs";
        } else {
            report += "Predicted No Weight Change";
        }

        return report;

    }

    @Override
    public String toString() {
        return "LifestyleTracker{" + "foodList=" + foodList + ", activityList=" + activityList + ", foodHistory=" + foodHistory + ", activityHistory=" + activityHistory + ", totalCaloriesEaten=" + totalCaloriesEaten + ", totalCaloriesBurned=" + totalCaloriesBurned + '}';
    }

}
