public class Medic extends Protagonist {
    
    public Medic(String s) {
	super(s);
	health = 300;
    }

    public String toString() {
      String message = super.toString();
      return message + "Special stat: HP = 300";
    }
    
}
