package myclasstest;

/**
 * 03/06/2019 Inheritence
 * our Warrior class will extend this player class
 */
public class Warrior extends Player{

    public Warrior(int health, int power, String name) {
        // super = we'll call the constructor that has these three parameters it will call the
        // constructor
        super(health, power, name);

    }
    @Override
    public void playerInfo() {
        System.out.println("The Power is " + getPower());
    }

} // Warrior
