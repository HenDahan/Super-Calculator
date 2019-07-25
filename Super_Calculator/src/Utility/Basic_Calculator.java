package Calculator;

public class Basic_Calculator {
	
    public static String Basic_calc(String str1, char op, String str2) 
    {
        Double num1 = Double.valueOf(str1);
        Double num2 = Double.valueOf(str2);
        char operation = op;
        
        /////
        System.out.println(str1+" "+op+" "+str2);
        System.out.println(num1+"operation="+operation+"num2="+num2);
        ////////
        if (operation == '+')
        {
            return Double.toString(num1 + num2);
        }
        
        if  (operation == '-')
        {
            return Double.toString(num1 - num2);
        }

        if (operation == '/')
        {
        	if (num2 == 0)
        		return "Can not be divided by 0.";
            return Double.toString(num1 / num2);
        }
        if (operation == '*')
        {
            return Double.toString((num1 * num2));
        }
        
        if (operation == '^')
        {
            return Double.toString(Math.pow(num1, num2));
        }
        /*
        if (operation == '!')
        {
            return Double.toString(Math.pow(num1, num2));
        }
          */ 	      


        return "Calculation problem";
        
    }
    

}
