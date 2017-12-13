public class Thief extends Protagonist {
    
    public Thief(String s) {
	super(s);
	defense = 60;
    }

    public String toString() {
        String message = super.toString() ;
        return message + "Special stat: defense = 60";
    }

}
