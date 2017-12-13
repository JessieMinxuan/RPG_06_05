public class Archer extends Protagonist {
    
    public Archer(String s) {
	super(s);
	rating = 0.6;
    }

    public String toString() {
	String message = super.toString();
	return message + " Special stat: rating = 0.6"; 
    }
 
}
