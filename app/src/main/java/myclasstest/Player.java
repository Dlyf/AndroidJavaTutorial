package myclasstest;

// héritage, programmation fonctionnel, polimorphisme, principe solid

/*
    a general rule all of your variables should be private

    in short setting the variables to private is called data encapsulation and setting the variables or methods to
    private will make them accessible only inside of the class itself.
 */

/**
 * 24 mai 2019
 */
public class Player {

    // = a visibility modifier, it can be accessed inside of the class where it is created
//    public int health;
    // = private, this variable can only be accessed inside of this class where it is created
    // putting these variables to private is called the encapsulation. This class can manipulate and control these variables.
    private int health;
    private int power;
    private String name;

    // Create an object with the help of constructors, type with the same name class player
    public Player() {
/*        // class - constructor
        health = 11;
        power = 99;
        name = "Joker";*/


    }
    // add parameter
    public Player(int health, int power, String name) {
        // "This" is referring to the class where we write this keyword. It is referring to th player class
        this.health = health;
        this.power = power;
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    // constructor
    public void playerInfo() {

        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }

} // player
