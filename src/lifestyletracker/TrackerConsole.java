/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lifestyletracker;

import java.util.Scanner;

/**
 *
 * @author sbc-student
 */
public class TrackerConsole {

    public static void main(String[] args) {
        LifestyleTracker tracker = new LifestyleTracker();
        Scanner scanner = new Scanner(System.in);
        String name;
        
        if (args.length == 0) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } else {
            name = args[0];
        }

        System.out.println("Welcome " + name + "!");

        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            
            switch (command) {
                case "Food" -> tracker.addFood(parts[1], Double.parseDouble(parts[2]));
                case "Activity" -> tracker.addActivity(parts[1], Double.parseDouble(parts[2]));
                case "Eat" -> tracker.eat(parts[1], Double.parseDouble(parts[2]));
                case "Perform" -> tracker.perform(parts[1], Double.parseDouble(parts[2]));
                case "Report" -> System.out.println(tracker.report());
                default -> System.out.println("Invalid command");
            }
        }

    }

}
