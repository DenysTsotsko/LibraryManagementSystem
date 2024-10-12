package main;


import models.Menu;
import services.AdminService;
import services.LibraryService;
import services.UserService;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){

        AdminService adminService = new AdminService();
        LibraryService libraryService = new LibraryService();
        UserService userService = new UserService();

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        menu.mainMenu(scanner);
    }

}
