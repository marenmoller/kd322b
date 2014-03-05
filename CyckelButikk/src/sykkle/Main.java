package sykkle;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	

	//	Arraylist<Bike> myBike = NewArraylist<Bike> ;
		 ArrayList<Bike> myBike = new ArrayList<Bike> ();  
	
			//Bike [] myBike = new Bike [10];
			Bike Bike1 = new Bike("red",19, 1200);
			Bike Bike2 = new Bike ("green",17, 5000);
			Bike Bike3 = new Bike ("purple",8, 6000);
			Bike Bike4 = new Bike ("blue",10, 1400);
			Bike Bike5 = new Bike ("orange",15, 2000);
			Bike Bike6 = new Bike ("brown",16, 6400);
			Bike Bike7 = new Bike ("grey",6, 4500);
			Bike Bike8 = new Bike ("white",10, 3200);
			Bike Bike9 = new Bike ("yellow",20, 30000);
            Bike Bike10 = new Bike ("black",5,2600);
            
            
            myBike.add(Bike1);
            myBike.add(Bike2);
            myBike.add(Bike3);
            myBike.add(Bike4);
            myBike.add(Bike5);
            myBike.add(Bike6);
            myBike.add(Bike7);
            myBike.add(Bike8);
            myBike.add(Bike9);
            myBike.add(Bike10);
            
            
            
            
    for (int i = 0; i<myBike.size(); i++){
    		System.out.println("Prisen på sykkelen" + myBike.get(i).getPrice() + "\t the size is" + myBike.get(i).getSize() + "\t the color is" + myBike.get(i).getColor());
    	}
    }
            
	}


			