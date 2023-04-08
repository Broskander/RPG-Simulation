public class Warrior extends Character implements WarriorAttack{
	
	private int strength;  // private variable added
	
	public Warrior(String name, int health, int mana, int strength) {
		super(name, health, mana);
		this.strength = strength;  // Warrior contructor that is the same as Character but adds strength
	}
	
	// Setter
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    // Getter
    public int getStrength() {
        return strength;
    }
    
    public void swordAttack(Character target) {
    	
    	// Prompts the method to decrease targets health using dmg to measure the damage
        int dmg = getStrength();
        target.setHealth(target.getHealth() - dmg);
        System.out.println(getName() + " slashes " + target.getName() + " for " + dmg + " damage."); 
        
        // Reduce the strength by 8 after attacking
        setStrength(getStrength() - 8);
        System.out.println(getName() + " lost 8 strength.");
    }
    
    public String toString() {
        return "Warrior " + super.toString() + "|| Strength - " + strength;
    }  // Displays the information of the character

}
