public class Ghost extends Monster {

    public Ghost() {
	super();
	rating = 0.9;
    }

    public String toString() {
	String message = super.toString();
	return message + " Special stat: rating = 0.9";
    }

}
