package unit_5_ex_1;

// Class for calling the other classes and printing all of their objects.
public class Print {
    public static void main(String[] args) {
        // Calling the other classes and creating objects for each of them.
        Pirate pirate = new Pirate();
        Ship ship = new Ship();
        Treasure treasure = new Treasure();

        // Putting all of the objects together so we can see all of the information at once. We get the properties of the objects by using a . and then the variable name.
        System.out.println("The pirate has a beard volume of " + pirate.beardVolume + " and is missing " + pirate.missingLimbs + " limbs. The pirate is sailing in a " + ship.type + " that has " + ship.crewSize + " crew members. The pirate has " + treasure.amount + " gold coins and " + treasure.chests + " treasure chests.");
    }
}