
public class Calculator {
	private String operator;
	private int result;
	private int operand;
	
	// skapar en ny kalkulator "instance"
	public Calculator(){
		// void osv...
	}
	
	// returnerar inslagna  operatører dvs nummer som ær inslagna?
	public String getOperator(){
		return operator;
	}
	
	//viser resultater//
	
	public int getResult(){
		return result;
	}
	
	public int getOperand(){
		return operand;
	}
	
	// knappen//
	public void numberButtonPressed (int number) {
		operand = operand*10 + number; 
	}
	
	//vasker ut og resultater dvs pluss, minus, multiplikasjon og dividering(?)//
	public void clear (){
		operator = "";
		result = 0;
		operand = 0;
	}
	
    
    public void plus(){
       result = operand;
       operand = 0;
       operator = "+";
    }
   
    public void minus(){
            result = operand;
            operand = 0;
            operator = "-";
    }
   
    public void mult(){
            result = operand;
            operand = 0;
            operator = "*";
    }
   
    public void equals(){
            if (operator.equals("*")){
                    result= result * operand;
            }else if(operator.equals("-")){
                    result= result - operand;
            }else if(operator.equals("+")){
                    result= result + operand;
            }
            operand = 0;
    }
}
	
	
	
