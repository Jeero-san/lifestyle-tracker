/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lifestyletracker;

/**
 *
 * @author sbc-student
 */
public class TrackerConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food food1 = new Food("Bread", 60);
        Activity activity1 = new Activity("Jog",100);
        
        System.out.println(food1);
        System.out.println(food1.getFoodName());
        System.out.println(food1.getFoodCalories());
        System.out.println(activity1);
        System.out.println(activity1.getActivityName());
        System.out.println(activity1.getActCalorieValue());
        food1.updateCalories(100);
        System.out.println(food1);
        activity1.updateCalories(500);
        System.out.println(activity1);
        
        
    }
    
}
