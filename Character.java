public class Character {
	
	private String name;
	private int health;
	private int mana;  // Initialized private variables
	
	public Character(String name, int health, int mana) {
		this.name = name;
		this.health = health;
		this.mana = mana;  // Constructor with fields 
		
	}
	
	// Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	// Getters
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMana() {
		return mana;
	}
	
	public void attackCommand(Character target) {
		System.out.println(name + " deals 6 damage to " + target.getName() + ".");
        target.setHealth(target.getHealth() - 6);
	}  // Attack method which takes health from a given target
	
	public String toString() {
        return "Character " + name + ": Health - " + health + " || Mana - " + mana;
    }  // Displays the information of the character
	
}
