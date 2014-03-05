package sykkle;

    public class Constants {	
	public static int MIN_SIZE = 8; 
    public static int MAX_SIZE = 28; 
    public static int MIN_PRICE = 0;
    public static int MAX_PRICE = 30000;
    
   public static String[] myColors = {"red", "green", "blue", "white", "yellow"}; 
   
  /** creates a method for checking if a color is allowed or not */
   
    public static String colorCheck(String col){
    	boolean check = false;
    	for (int i = 0; i < myColors.length; i++){
    		if(col.equals(myColors[i])){
    			check = true;
    		}
    	}

    	if (check == true){
    	return col;	
    	} else{
		
		return "no color";
				}
		
	}

	}
	
	
	
