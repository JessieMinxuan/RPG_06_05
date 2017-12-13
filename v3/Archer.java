public class Archer extends Protagonist {

    public Archer(String s) {
	super(s);
	rating = 0.6;
    }

    public String toString() {
	String message = super.toString();
	return message + " Special stat: rating = 0.6";
    }

    //Omit concrete-ness error message:
    //Archer.java:1: error: Archer is not abstract
    // and does not override abstract method toString() in Protagonist
    //public class Archer extends Protagonist {

}
