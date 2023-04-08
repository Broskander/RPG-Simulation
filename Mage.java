public class Mage extends Character implements MageAttack{
	
	private int intelligence; // private variable added
    
    public Mage(String name, int health, int mana, int intelligence) {
        super(name, health, mana);
        this.intelligence = intelligence;  // Mage contructor that is the same as Character but adds intelligence
    }
    
    // Setter
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    
    // Getter
    public int getIntelligence() {
        return intelligence;
    }
    
    public void fireballSpell(Character target) {
    	
    	// Prompts the method to decrease targets health and uses dmg to measure deduction to health
        int dmg = getIntelligence();
        target.setHealth(target.getHealth() - dmg);
        System.out.println(getName() + " casts a spell at " + target.getName() + ", dealing " + dmg + " damage.");
        
        // Reduce mana by 16 after casting spell
        setMana(getMana() - 16);
        System.out.println(getName() + " lost 16 mana.");
    }
    
    // toString method
    public String toString() {
        return "Mage " + super.toString() + " || Intelligence - " + intelligence;
    }  // Displays the information of the character

}
