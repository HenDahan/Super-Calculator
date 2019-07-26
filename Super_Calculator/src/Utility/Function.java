package Utility;
import java.lang.Math;

public class Function {
	
	public static String square(double a, double b, double c) {
		String answer;
		double DELTA = (b*b-4*a*c);
		double x1, x2;
		if (a == 0)
		{
			if (b != 0) {
			x1 = (-1 * c) / b;
			x1 = Math.floor(x1 * 1000)/1000;

			answer = "X1 = "+x1;
			}
			else
				answer = "There are no roots for this function.";
		}
		else {
		
			if (DELTA >= 0) {
				x1 = (-b+Math.sqrt(DELTA))/(2*a);
				x2 = (-b-Math.sqrt(DELTA))/(2*a);
				x1 = Math.floor(x1 * 1000)/1000;
				x2 = Math.floor(x2 * 1000)/1000;

				if (x1 == -0.0) x1 = 0.0;
				if (x2 == -0.0) x2 = 0.0;
				if (x1 != x2)
					answer = "X1 = "+x1+",      X2 = "+x2;
				else
					answer = "X1 = "+x1;
			
				}
			else
				answer = "There are no roots for this function.";
			
		}
		
		return answer;
	}

	
    
    public static String intersectionPointsSquare(double a, double b, double c) {
    	double y3 = (-1 * c);
    	double x1, x2, y1, y2, x3 = 0;
		String answer;
		double DELTA = (b*b-4*a*c);
		if (a == 0) {
			if (b != 0) {
				x1 = 0;
				y1 = c;
				x2 = (-1 * c)/b;
				y2 = 0;
				x2 = Math.floor(x2 * 1000)/1000;

				answer = "("+x1+" , "+y1+"),       ("+x2+" , "+y2+")"; 
			}
			else {
				if (c != 0)
					answer = "(0 , "+c+")";
				else
					answer = "There is no function.";
			}
		}
		else {
			if (DELTA >= 0) {
		
			x1 = (-b+Math.sqrt(DELTA))/(2*a);
			x2 = (-b-Math.sqrt(DELTA))/(2*a);
			y1 = (a * x1 * x1) + (b * x1) + c;
			y2 = (a * x2 * x2) + (b * x2) + c;
			x1 = Math.floor(x1 * 1000)/1000;
			x2 = Math.floor(x2 * 1000)/1000;
			x3 = Math.floor(x3 * 1000)/1000;
			y1 = Math.floor(y1 * 1000)/1000;
			y2 = Math.floor(y2 * 1000)/1000;
		
			
			
			
			if (x1 == x2) {
				if (x1 == x3 || x2 == x3)
					answer = "("+x1+" , "+y1+")";
				else
					answer = "("+x1+" , "+y1+"), ("+x3+" , "+y3+")";
			}
			else
			{
				if (x1 == x3 || x2 == x3)
					answer = "("+x1+" , "+y1+"), ("+x2+" , "+y2+")";
				else
				answer = "("+x1+" , "+y1+"), ("+x2+" , "+y2+"), ("+x3+" , "+y3+")"; 
		
			}
			}
		else
			answer = "("+x3+" , "+y3+")"; 
		}
    	
		return answer;
    }
    
    public static String edgePoints(double a, double b, double c) {
    	String answer;
    	double x, y;
    	if (a != 0) {
    		x = (-b)/(2*a);
    		y = (a * x * x) + b * x + c;
			x = Math.floor(x * 1000)/1000;
			y = Math.floor(y * 1000)/1000;

    		answer = "("+x+" , "+y+")";
    		
    	}
    	else
    		answer = "There are no edge points for this function.";
    	
    	return answer;
    	
    	
    }
    
    public static String inf(double a, double b, double c) {
    	String answer;
    	double x;
    	x = a * 10000 + b * 100;
    	if (a == 0 && b == 0)
    		answer = "Limit X -> inf = "+c;
    	else if (x > 30)
    		answer = "Limit X -> inf = INF";
    	else if (x < 1 && x > -1)
    		answer = "Limit X -> inf = 0";
    	else if (x < -30)
    		answer = "Limit X -> inf = - INF";
    	else
    		answer = "Limit X -> inf = "+x;
    	
    	return answer;
    	
    	
    	
    }
    
    public static String minusInf(double a, double b, double c) {
       	String answer;
    	double x;
    	x = a * 10000 + b * -100;
    	if (a == 0 && b == 0)
    		answer = "Limit X -> inf = "+c;
    	else if (x > 30)
    		answer = "Limit X -> inf = INF";
    	else if (x < 1 && x > -1)
    		answer = "Limit X -> inf = 0";
    	else if (x < -30)
    		answer = "Limit X -> inf = - INF";
    	else
    		answer = "Limit X -> inf = "+x;
    	
    	return answer;
    	
    }
	
	

}
