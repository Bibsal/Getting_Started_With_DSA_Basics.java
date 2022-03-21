import java.util.*;
public class checkIsNumericFunction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		boolean checkingNumberic = isNumeric(str);
		System.out.println(checkingNumberic);
	}
	
	public static boolean isNumeric(String str) { 
			  try {  
			    Double.parseDouble(str);  
			    return true;
			  } catch(NumberFormatException e){  
			    return false;  
			  }  
			}

	}


