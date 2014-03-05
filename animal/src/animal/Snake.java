package animal;

public class Snake extends Animal  {
	
	String gift; 
	public Snake(String _navn, String _gift) {
		super(_navn);
		gift = _gift; 
	   
		// TODO Auto-generated constructor stub
	}

	
	@Override 
	public String getInfo (){
		String info = "Slangen " + this.navn + "og er " + this.gift;
			return info; 
	}

}
