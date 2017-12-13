public class Monster extends Character {
    
    public Monster() {
        health = 250;
        strength = (int)(20 + 40 * Math.random());
        defense = 40;
        rating = 0.3;
    }

    public String toString() {
	return "A monster appeared! HP: " + health; 
    }
    
}
