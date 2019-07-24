package Utility;
import java.lang.Math;

public class Function {
	
	public static String square(double a, double b, double c) {
		String answer;
		double DELTA = (b*b-4*a*c);
		double x1, x2;
		if (DELTA >= 0) {
			x1 = (-b+Math.sqrt(DELTA))/(2*a);
			x2 = (-b-Math.sqrt(DELTA))/(2*a);
			answer = "X1 = "+x1+", X2 = "+x2;
		
			}
		else
			answer = "There are no roots for this function.";
			
		
		return answer;
	}

	
    public static String cube(double a, double b, double c, double d) {
    	
    	String answer="a";
        System.out.println(answer);

        double[] result;
        if (d != 1) {
            a = a / d;
            b = b / d;
            c = c / d;
        }

        double p = b / 3 - a * a / 9;
        double q = a * a * a / 27 - a * b / 6 + c / 2;
        double D = p * p * p + q * q;
        System.out.println(answer);

        if (Double.compare(D, 0) >= 0) {
            if (Double.compare(D, 0) == 0) {
                double r = Math.cbrt(-q);
                result = new double[2];
                result[0] = 2 * r;
                result[1] = -r;
                System.out.println(answer);

            } else {
                double r = Math.cbrt(-q + Math.sqrt(D));
                double s = Math.cbrt(-q - Math.sqrt(D));
                result = new double[1];
                result[0] = r + s;
                answer = "result 0 is "+ result[0];
                System.out.println(answer);
            }
        } else {
            double ang = Math.acos(-q / Math.sqrt(-p * p * p));
            double r = 2 * Math.sqrt(-p);
            result = new double[3];
            answer = "before this weird loop";
            System.out.println(answer);

            for (int k = -1; k <= 1; k++) {
                double theta = (ang - 2 * Math.PI * k) / 3;
                result[k + 1] = r * Math.cos(theta);
            }

        }
        answer = "before this last loop "+ result[0] +" "+result[1]+" "+ result[2];
        System.out.println(answer);
        for (int i = 0; i < result.length; i++) {
            System.out.println(answer);

            result[i] = result[i] - (a / 3);
        }
        answer = "X1 = "+result[0]+", X2 = "+result[1]+", X3 = "+result[2];
        System.out.println(answer);

        return answer;
    }
    
    public static String edgePointsSquare(double a, double b, double c) {
    	double y3 = (-1 * c);
    	double x1, x2, y1, y2, x3 = 0;
		String answer;
		double DELTA = (b*b-4*a*c);
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
			
			
			
			if (x1 == x2) 
				answer = "("+x1+" , "+y1+"), ("+x3+" , "+y3+")"; 
			else
				answer = "("+x1+" , "+y1+"), ("+x2+" , "+y2+"), ("+x3+" , "+y3+")"; 
		
			}
		else
			answer = "("+x3+" , "+y3+")"; 
    	
		return answer;
    }
    
	
	

}
