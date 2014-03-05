package animal;

public class Cat extends Mammal  {
	String purr; 
	public Cat (String _navn, int ben, String _purr) {
		super(_navn, ben);
		purr = _purr; 
	}
	

	@Override
	public String getInfo() {
		String info ="Katten " + this.navn + "har " + this.ben + "og " + this.purr;
		return info;
	}

}
