package Calculator;

public class Advanced_Calculator 
{
	
	public static String Advanced(String str)
	{
		String[] buffer = str.split(" ");
		String result = "";
		String op;
		String temp;
		int i;
		for (i = 0; i < buffer.length; i++)
		{

			if(buffer[i].equalsIgnoreCase("root"))// == "root")
			{

	        	op = buffer[i-1];
	        	for (int j=0; j<i-1; j++)
	        		result = result + " " + buffer[j];
	        	if (result.length() >= 3)
	        		result = GFG.infixToPrefix(result);	
				temp = Double.toString(Math.sqrt(Double.valueOf(buffer[i+2])));
				if (op.length() >= 1)
					result = Basic_Calculator.Basic_calc(result, op.charAt(0), temp);
				else
					result = temp;
			}
     

	        if (buffer[i].equalsIgnoreCase("!"))
	        {

	        	op = "";
	        	if (buffer.length > 2)
	        	{
	        	op = buffer[i-2];
	        	for (int j=0; j<i-2; j++)
	        		result = result + " " + buffer[j];
	        	}
	        	Double num = Double.valueOf(buffer[i-1]);
	        	for (int j=(int) (num-1); j>0; j--)
	        		num = num*j;
	        	
	    		temp = Double.toString(num);

	        	if (result.length() >= 3)
	        		result = GFG.infixToPrefix(result);	
					        	
				if (op.length() >= 1)
					result = Basic_Calculator.Basic_calc(result, op.charAt(0), temp);
				else
					result = temp;
	        }
	        		 
		

		}
		if (result == "")
			result = GFG.infixToPrefix(str);
		return result;
		
	
	}
}