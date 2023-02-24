package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
		if (input.length() == 2){
		char I = input.toLowerCase().charAt(0);
		char J = input.toLowerCase().charAt(1);

		if ((I == '1' || I == '2' || I == '3' || I == '4' || I == '5' || I == '6' || I == '7' || I == '8')
		&& (J == 'a' || J == 'b' || J == 'c' || J == 'd' || J == 'e' || J == 'f' || J == 'g' || J == 'h'))
		return true;

		 
		}
		return false;
}
}