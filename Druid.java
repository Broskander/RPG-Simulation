public class Druid extends Warrior implements WarriorAttack {
	
	private int wisdom; // Private variable added
	
	public Druid(String name, int health, int mana, int strength, int wisdom) {
		super(name, health, mana, strength);
        this.wisdom = wisdom;  // Mage contructor that is the same as Character but adds wisdom
	}
	
	// Setter
	public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    
	// Getter
    public int getWisdom() {
        return wisdom;
    }
    
    public void heal(Character target) {
        
        // Simple heal - increases target's health by druid's wisdom
        int amount = getWisdom();
        target.setHealth(target.getHealth() + amount);
        System.out.println(getName() + " heals " + target.getName() + " for " + amount + " health.");
        
        // Reduce druid's wisdom by 5 after healing
        setWisdom(getWisdom() - 5);
        System.out.println(getName() + " lost 5 wisdom.");
    }
    
    @Override
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
    	return "Druid " + super.toString() + " || Wisdom - " + wisdom;
    }  // Displays the information of the character
    

}
