package sykkle;

public class Bike {

	private String color; 
	private int price; 
	private int size;
	private static int nbrOfBikes;
	
	
	
	/** lager en sykkel med instance-variables limited by values in Constants.java*/
	
	public Bike(String _color, int _size){ 
		color = Constants.colorCheck(_color);
	if (_size < Constants.MIN_SIZE ){
	size =_size;
	}	else {
		_size = Constants.MIN_SIZE; 
		
	}
	 if (size < Constants.MAX_SIZE ){
		 _size =_size;
	 }
	 
	 else {
		 
		 _size = Constants.MAX_SIZE; 
	 }
	}
	
	/** creates a bike with instance-variables limited by values in Constants.java*/
	
	public Bike(String _color, int _size, int _price ){
	//farg ar samma som farg
		
		color =Constants.colorCheck(_color);
		// minsta mojliga storlek
		
	if ( _size > Constants.MIN_SIZE ){
	// om storleken er storre an minsta storlek
			size =_size;
	}
	else {
		_size = Constants.MIN_SIZE; 
		//om size er mindre enn miste storrelsen så skriver den minste storrelsen 
	}
	 if (_size < Constants.MAX_SIZE ){
		 _size =_size;
		 //om storleken er mindre en maxstorleken så skriver den ut den angivna storlkene 
	 }
	 
	 else {
		 
		 _size = Constants.MAX_SIZE; 
		 //om size er storre enn max storleken så skriver den ut maxstorrelsen 
	 }
	if (_price > Constants.MIN_PRICE){ 
	      price = _price;
	      // om priser er storre en minste prisen 
	}
	else {
		
		_price = Constants.MIN_PRICE; 
		//om prisen er mindre en miste prisen sa skriver den minstepris
	}
	
	if (_price < Constants.MAX_PRICE)
	{
		price = _price;
		//om prisen er mindre en max prisen så skriver den ut angivne pris 
	}
	else {
		_price = Constants.MAX_PRICE; 
		// om prisen er storre en max prisen skriver den ut max prisen 
	}
	}
	
	public String getColor(){
		return color;
	}
	
	public int getSize (){
		return size;
	}
	
	
	public int getPrice (){
		return price;
	}
	
	public int setPrice (){
		return price;
	}
	
	public static int getNumberOfBikes (){
		return nbrOfBikes;
	}
	
	
	
}
