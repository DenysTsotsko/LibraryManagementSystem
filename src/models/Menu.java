package models;

import java.util.*;

public class Menu {
    boolean isRunning = true;
    public void mainMenu(Scanner scanner){
        while(isRunning) {
            System.out.println("Welcome to the Library Management System");
            System.out.print("Are you user or admin? (STOP to exit)\n>>> ");

            String role = scanner.nextLine();

            if (role.equalsIgnoreCase("User")) {
                userMenu();
            } else if (role.equalsIgnoreCase("Admin")) {
                adminMenu();
            } else if (role.equalsIgnoreCase("stop")) {
                System.out.println("The program is stopped");
                isRunning = false;
            } else{
                System.out.println("No such choice, please try again");
                System.out.println();
            }
        }
    }

    public void userMenu(){
        System.out.println("You are at user's menu");
        System.out.println();

        System.out.println("Choose below:\n1.");
    }


    public void adminMenu(){}


}
