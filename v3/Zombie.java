public class Zombie extends Monster {

    public Zombie() {
	super();
	health = 500;
    }

    public String toString() {
	String message = super.toString();
	return message + " Special stat: health = 500 (2X)";
    }

}
