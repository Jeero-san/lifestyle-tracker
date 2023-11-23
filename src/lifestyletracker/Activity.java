/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifestyletracker;

/**
 *
 * @author sbc-student
 */
public class Activity {

    private String activityName;
    private double actCalorieValue;

    public Activity(String activityName, double actCalorieValue) {
        this.activityName = activityName;
        this.actCalorieValue = actCalorieValue;
    }

    public String getActivityName() {
        return activityName;
    }

    public double getActCalorieValue() {
        return actCalorieValue;
    }

    public double updateCalories(double newCalorieValue) {
        return this.actCalorieValue = newCalorieValue;
    }

    @Override
    public String toString() {
        return "Activity{" + "activityName=" + activityName + ", actCalorieValue=" + actCalorieValue + '}';
    }
    
}
