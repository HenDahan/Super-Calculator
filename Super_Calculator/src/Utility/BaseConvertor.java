package Utility;

public class BaseConvertor {
	
	public static boolean checkValidBase(String num, int N){
		boolean check;
		if (N == 2)
			check =  isBinaryNumber(num);
		else if (N == 8)
			check = isOctalNumber(num);
		else if (N == 10)
			check = isDecimalNumber(num);
		else 
			check = isHexadecimalNumber(num);
		
		return check;
		
	}

	
	
	public static String convert2toN(String num, int N){
		String answer;
		if (!(isBinaryNumber(num))) {
			return "-1";
		}
		else if (N == 8) {
			answer = getOctalFromBinaryNumber(""+num);
		}
		else if (N == 10) {
			answer = String.valueOf(getDecimalFromBinaryNumber(""+num));
		}
		else {
			answer = getHexadecimalFromBinaryNumber(""+num);
		}
		return answer;
		
	}
	
	public static String convert8toN(String num, int N){
		String answer;
		if (!(isOctalNumber(num))) {
			return "-1";
		}
		else if (N == 2) {
			answer = getBinaryFromOctalNumber(num);
		}
		else if (N == 8) {
			answer = String.valueOf(getDecimalFromOctalNumber(num));
		}
		else {
			answer = getHexadecimalFromOctalNumber(num);
		}
		return answer;
			
		}
	
	public static String convert10toN(String num, int N){
		String answer;
		if (!(isDecimalNumber(num))) {
			return "-1";
		}
		else if (N == 2) {
			answer = getBinaryNumber(num);
		}
		else if (N == 8) {
			answer = getOctalNumber(num);
		}
		else {
			answer = getHexadecimalNumber(num);
		}
		return answer;
		
	}
	
	public static String convert16toN(String num, int N){
		
		String answer;
		if (!(isHexadecimalNumber(num))) {
			return "-1";
		}
		else if (N == 2) {
			answer = getBinaryFromHexadecimalNumber(num);
		}
		else if (N == 8) {
			answer = getOctalFromHexadecimalNumber(num);
		}
		else {
			answer = String.valueOf(getDecimalNumber(num));
		}
		return answer;
		
	}
	
	
	
	//Functions to get the info of all the converstions.
	
	private static int getDecimalNumber(String number) {

		/*
		 * Converting String to StringBuilder.
		 */
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(string.charAt(i))) {
				digit = string.charAt(i) - 48;
			} else {
				digit = getHexadecimalCharacterDigit(string.charAt(i));
			}
			power = (int) Math.pow(16, i);
			sum = sum + digit * power;

		}
		return sum;
}
	
	private static String getOctalFromHexadecimalNumber(String number) {

		// Convert Hexadecimal to Decimal
		int decimal = getDecimalFromHexadecimalNumber(number);
		// Convert Decimal to Octal
		String octal = getOctalFromDecimalNumber(decimal);
		return octal;
	}
	

	private static String getBinaryFromHexadecimalNumber(String number) {

		// Convert Hexadecimal to Decimal
		int decimal = getDecimalFromHexadecimalNumber(number);
		// Convert Decimal to Binary
		String binary = getBinaryFromDecimalNumber(decimal);
		return binary;
	}

	private static int getDecimalFromHexadecimalNumber(String number) {

		/*
		 * Converting String to StringBuilder.
		 */
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(string.charAt(i))) {
				digit = string.charAt(i) - 48;
			} else {
				digit = getHexadecimalCharacterDigit(string.charAt(i));
			}
			power = (int) Math.pow(16, i);
			sum = sum + digit * power;

		}
		return sum;
	}

	private static int getHexadecimalCharacterDigit(char ch) {

		int digit = 0;
		switch (ch) {
		case 'A':
		case 'a':
			digit = 10;
			break;
		case 'B':
		case 'b':
			digit = 11;
			break;
		case 'C':
		case 'c':
			digit = 12;
			break;
		case 'D':
		case 'd':
			digit = 13;
			break;
		case 'E':
		case 'e':
			digit = 14;
			break;
		case 'F':
		case 'f':
			digit = 15;
			break;
		}

		return digit;
	}

	private static boolean isHexadecimalNumber(String number) {

		/*
		 * Regular expression that matches string containing only digits [0-9]
		 * and alphabets [A-F] or [a-f]
		 */
		String pattern = "^[0-9a-fA-F]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}
	
	private static String getHexadecimalFromOctalNumber(String number) {

		// Convert Octal to Decimal
		int decimal = getDecimalFromOctalNumber(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal=getHexadecimalFromDecimalNumber(decimal);
		return hexadecimal;
	}
	
	
	private static String getBinaryFromOctalNumber(String number) {

		// Convert Octal to Decimal
		int decimal = getDecimalFromOctalNumber(number);
		// Convert Decimal to Binary
		String binary = getBinaryFromDecimalNumber(decimal);
		return binary;
	}

	private static String getBinaryFromDecimalNumber(int decimal) {

		int remainder = 0;
		StringBuilder binary = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 2;
			// Converting Integer to String and adding into StringBuilder.
			binary.append(String.valueOf(remainder));
			decimal = decimal / 2;
		}

		// Reverse String using library function of StringBuilder class.
		return binary.reverse().toString();
	}

	private static int getDecimalFromOctalNumber(String number) {

		// Converting String to StringBuilder.
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(8, i);
			sum = sum + digit * power;
		}
		return sum;
	}

	private static boolean isOctalNumber(String number) {

		/*
		 * Regular expression that matches string containing only octal
		 * digits[0-7].
		 */
		String pattern = "^[0-7]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
}
	
	private static String getOctalNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder octal = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 8;
			// Converting Integer to String and adding into StringBuilder.
			octal.append(String.valueOf(remainder));
			decimal = decimal / 8;
		}

		// Reverse String using library function of StringBuilder class.
		return octal.reverse().toString();
}
	
	private static String getBinaryNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder binary = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 2;
			// Converting Integer to String and adding into StringBuilder.
			binary.append(String.valueOf(remainder));
			decimal = decimal / 2;
		}

		// Reverse String using library function of StringBuilder class.
		return binary.reverse().toString();
}
	
	private static String getHexadecimalNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder hexadecimal = new StringBuilder();
		String result;
		while (decimal != 0) {
			remainder = decimal % 16;
			if (remainder >= 10 && remainder <= 15) {
				char hexChar = getHexadecimalCharacter(remainder);
				// Convert char to String.
				result = String.valueOf(hexChar);
			} else {
				// Convert int to String.
				result = String.valueOf(remainder);
			}
			// Add string to StringBuilder.
			hexadecimal.append(String.valueOf(result));
			decimal = decimal / 16;
		}

		// Reverse String using library function of StringBuilder class.
		return hexadecimal.reverse().toString();
	}


	private static boolean isDecimalNumber(String number) {

		// Regular expression that matches String containing only digits [0-9].
		String pattern = "^[0-9]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
}
	
	private static String getHexadecimalFromBinaryNumber(String number) {

		// Convert Binary to Decimal
		int decimal = getDecimalFromBinaryNumber(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal = getHexadecimalFromDecimalNumber(decimal);
		return hexadecimal;
	}

	private static String getHexadecimalFromDecimalNumber(int decimal) {

		int remainder = 0;
		StringBuilder hexadecimal = new StringBuilder();
		String result;
		while (decimal != 0) {
			remainder = decimal % 16;
			if (remainder >= 10 && remainder <= 15) {
				char hexChar = getHexadecimalCharacter(remainder);
				// Convert char to String.
				result = String.valueOf(hexChar);
			} else {
				// Convert int to String.
				result = String.valueOf(remainder);
			}
			// Add string to StringBuilder.
			hexadecimal.append(String.valueOf(result));
			decimal = decimal / 16;
		}

		// Reverse String using library function of StringBuilder class.
		return hexadecimal.reverse().toString();
	}

	private static char getHexadecimalCharacter(int remainder) {
		char ch = '\u0000';
		switch (remainder) {
		case 10:
			ch = 'A';
			break;
		case 11:
			ch = 'B';
			break;
		case 12:
			ch = 'C';
			break;
		case 13:
			ch = 'D';
			break;
		case 14:
			ch = 'E';
			break;
		case 15:
			ch = 'F';
			break;
		}
		return ch;
	}
	
	

	private static String getOctalFromBinaryNumber(String number) {

		// Convert Binary to Decimal.
		int decimal = getDecimalFromBinaryNumber(number);
		// Convert Decimal to Octal.
		String octal = getOctalFromDecimalNumber(decimal);
		return octal;
	}

	private static String getOctalFromDecimalNumber(int decimal) {

		int remainder = 0;
		StringBuilder octal = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 8;
			// Converting Integer to String and adding into StringBuilder.
			octal.append(String.valueOf(remainder));
			decimal = decimal / 8;
		}

		// Reverse String using library function of StringBuilder class.
		return octal.reverse().toString();
	}

	private static int getDecimalFromBinaryNumber(String number) {

		// Converting String to StringBuilder.
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(2, i);
			sum = sum + digit * power;
		}
		return sum;
	}

	private static boolean isBinaryNumber(String number) {

		
		String pattern = "^[01]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}




}
