public class Earthworm extends Monster {

    public Earthworm() {
	super();
	defense = 80;
    }

    public String toString() {
	String message = super.toString();
	return message + " Special stat: defense = 80";
    }

}
