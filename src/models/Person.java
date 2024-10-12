package models;

import java.util.Random;

public class Person {
    protected String name;
    protected String password;
    protected int ID;

    private int generatePersonID(){
        Random random = new Random();
        return random.nextInt(2000);
    }

}
