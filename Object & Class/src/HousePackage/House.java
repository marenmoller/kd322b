package HousePackage;

public class House {
	//instansvariabler, klassvariabelen//
	
	private int year; // variable før år
	private int size; // variabel før storlek
	private static int nbrOfHouses; // konstant variabel før antal hus
	public static final int MIN_SIZE=10; // konstant slut variabel før minsta antalet hus

	// konstruktorer og klassemetode//
	public House(int _year, int _size){ 
		year = _year;
		if (_size > MIN_SIZE){
			size = _size;
		} else {
			_size = MIN_SIZE;
		} nbrOfHouses = nbrOfHouses +1;
		
	}
	
	// metoder //
	// før att hæmta number of houses och søka på storlek och byggnads år osv.
	
	public static int getNbrOfHouses(){ //en statisk variabel som letar efter HUR MÅNGA hus som finns
		return nbrOfHouses; // letar efter variabeln nbrOfHouses, dvs antalet hus
	}
	
	public int getYear(){
		return year; // letar efter år
	}
	public int getSize(){
		return size; // letar efter storlek
	}
}
	
//Om det er mindre enn min_size så blir det uansett nummer 10 utskrevet. 
	
