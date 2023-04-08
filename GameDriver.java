import java.util.Random;
import <insert package>.Character;
import <insert package>.Warrior;
import <insert package>.Mage;
import <insert package>.Druid;


public class GameDriver {
	public static void main(String[] args) {
		
        Random rand = new Random();  // Allows for a random number generator 
        
     // Creates all of the characters respectively
        Warrior warrior = new Warrior("Guts", rand.nextInt(75) + 1, rand.nextInt(50) + 1, rand.nextInt(75) + 1);
        Mage mage = new Mage("Harry Potter", rand.nextInt(50) + 1, rand.nextInt(100) + 1, rand.nextInt(75) + 1);
        Druid druid = new Druid("Malfurion", rand.nextInt(75) + 1, rand.nextInt(50) + 1, rand.nextInt(50) + 1, rand.nextInt(50) + 1);
        Character skeleton = new Character("Dry Bones", rand.nextInt(25) + 1, rand.nextInt(5) + 1);
        Character zombie = new Character("Walker", rand.nextInt(30) + 1, rand.nextInt(10) + 1);
        Character goblin = new Character("Griphook", rand.nextInt(40) + 1, rand.nextInt(35) + 1);
        
        // Prints all of the stats before any actions
        System.out.println(warrior.toString());
        System.out.println(mage.toString());
        System.out.println(druid.toString());
        System.out.println(skeleton.toString());
        System.out.println(zombie.toString());
        System.out.println(goblin.toString());
        
        System.out.println("\n");
        
        // Actions
        warrior.swordAttack(skeleton);
        mage.fireballSpell(zombie);
        goblin.attackCommand(warrior);
        druid.heal(warrior);
        druid.swordAttack(goblin);
        
        System.out.println("\n");
        
        // Print out the stats after actions
        System.out.println(warrior.toString());
        System.out.println(mage.toString());
        System.out.println(druid.toString());
        System.out.println(skeleton.toString());
        System.out.println(zombie.toString());
        System.out.println(goblin.toString());
        
	}
}
