package animal;

public class Dog extends Mammal  {
	String pinner; 
	public Dog (String _navn, int ben, String _pinner) {
		super(_navn, ben);
		pinner = _pinner; 
	}


	@Override
	public String getInfo() {
		String info ="hunden " + this.navn + "har " + this.ben + "ben og liker " + this.pinner;
		return info;
	}

}

