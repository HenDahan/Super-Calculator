package Utility;

public class Basic_Calculator {
	public static String calc(String str)
	{
		str = str.replaceAll("\\s+","");
		int size = str.length();
		String op1,op2;
		char op;
		int start_i, end_i;//, i=0;
		
		//while (str.charAt(i) != '\0')
		for (int i = 0; i < size; i++)
		{
			////////////////////////////////////////////////////////////
			System.out.println("size="+size);
			////////////////////////////////////////////////////////////////////
			if(str.charAt(i) == '^')
			{
				op1 = ExtractPreNum(str,i);
				op = str.charAt(i);
				op2 = ExtractPostNum(str,i);
				
				
				start_i = i-op1.length();
				end_i = i+op2.length();
				
				/////////////////////////////////////////////////////////////////////////////
				System.out.println("op1="+op1+"op="+op+"op2="+op2+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				/////////////////////////////////////////////////////////////////////////////
				String tmp = Calculator(op1, op, op2);
				if (tmp.length() > end_i-start_i)
					size = size + (tmp.length()-(end_i-start_i));
				str = InsertString(str,start_i,end_i,tmp);
				size = str.length();
			}
			
			if(str.charAt(i) == '!')
			{
				op1 = ExtractPreNum(str,i);
				op = str.charAt(i);
				
				if ( str.charAt(i-1) == ' ')
					start_i = i-1-op1.length();//str.indexOf(op1.charAt(0));
				else
					start_i = i-op1.length();
				end_i = i;
			////////////////////////////////////////////////////////////////////////////////

				System.out.println("op1="+op1+"op="+op+"op2=");
				System.out.println("i="+i);
			/////////////////////////////////////////////////////////////////////////////
		
				String tmp = Calculator(op1, op, null);
				
				if (tmp.length() > end_i-start_i)
					size = size + (tmp.length()-(end_i-start_i));
				//str = InsertString(str,start_i,end_i,tmp);
				
				 
				str = InsertString(str,start_i,end_i,tmp);
				size = str.length();
			}
			
			System.out.println("i="+i+",str="+str+"char[i]="+str.charAt(i)+"/////");
			/*
			if(str.length() < size)
			{
				/////////////////////////////////////////////////////////
				for ( int j = 0; j<i; j++ )
				{
					if(str.charAt(i) == '!' || str.charAt(i) == '^')
						i = j-1;
				}
			}
			*/
				
		}
		

		for (int i = 0; i < size; i++)
		{
			////////////////////////////////////////////////////////////////////////////////
			//System.out.println("i=" +i+"str="+str.charAt(i));
			//System.out.println("str="+str);
			/////////////////////////////////////////////////////////////////////////////


			if(str.charAt(i) == '/' || str.charAt(i) == '*')
			{
				op1 = ExtractPreNum(str,i);
				op = str.charAt(i);
				op2 = ExtractPostNum(str,i);
				
				if ( str.charAt(i-1) == ' ')
					start_i = i-1-op1.length();//str.indexOf(op1.charAt(0));
				else
					start_i = i-op1.length();
				
				if ( str.charAt(i+1) == ' ')
					end_i = i+1+op2.length();//str.indexOf(op2.charAt(op2.length()-1));
				else
					end_i = i+op2.length();
				////////////////////////////////////////////////////////////////////////////////
				System.out.println("op1="+op1+"op="+op+"op2="+op2);
				System.out.println("i="+i);
				/////////////////////////////////////////////////////////////////////////////

				
				str = InsertString(str,start_i,end_i,Calculator(op1,op,op2));
				size = str.length();
			}
				
		}
				
		
		
		
		return StringToCalc(str);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	
public static String Previous_parentheses(String str)
{
	String buf ="", result;
	int size = str.length();
	int start_i = 0 ,end_i = 0;
	int cOpen=0, cClose=0;
	for (int i = 0; i < size; i++)
	{
		if (str.charAt(i) == '(')
		{
			cOpen++;
			start_i = i+1;
		}
		
		if(str.charAt(i) == ')')
		{
			cClose++;
			if (cOpen == cClose)
			{
				end_i = i-1;
				break;
			}
			
		}
	}
	if (cOpen > 0)
	{
		for (int i = start_i; i<=end_i;i++)
			buf = buf + str.charAt(i);
		
		
		buf = Previous_parentheses(buf);
		
		str = InsertString(str,start_i-1,end_i+1, calc(buf));
		str = Previous_parentheses(str);
	}
	
	
	return calc(str);
}
///////////////////////////////////////////////////////////////////////////////////

private static String StringToCalc(String str) 
{
	for (int i = 0; i < str.length(); i++)
	{
		////////////////////////////////////////////////////////////////////////////////
		//System.out.println("i=" +i+"str="+str.charAt(i));
		//System.out.println("str="+str);
		/////////////////////////////////////////////////////////////////////////////
		String op1,op2;
		char op;
		int start_i,end_i;

		if(str.charAt(i) == '+' || str.charAt(i) == '-')
		{
			op1 = ExtractPreNum(str,i);
			op = str.charAt(i);
			op2 = ExtractPostNum(str,i);
			
				start_i = i-op1.length();
			
				end_i = i+op2.length();
			////////////////////////////////////////////////////////////////////////////////
			System.out.println("op1="+op1+"op="+op+"op2="+op2);
			System.out.println("i="+i);
			/////////////////////////////////////////////////////////////////////////////
			
			str = InsertString(str,start_i,end_i,Calculator(op1,op,op2));
			
		}
			
	}
	for (int i = 0; i < str.length(); i++)
	{
		if (str.charAt(0) == '-')
			break;
		
		if(str.charAt(i) == '+' || str.charAt(i) == '-')
			str = StringToCalc(str);
	}
	
		return str;
	}
///////////////////////////////////////////////////////////////////////////////////
	
private static String InsertString(String str, int start_i, int end_i, String result) {
		
////////////////////////////////////////////////////////////////////////////////
	//System.out.println("result="+result);
	//System.out.println("start="+start_i+"end="+end_i);
	/////////////////////////////////////////////////////////////////////////////
	
	String newStr = "";
	int i;
	for (i = 0; i < start_i; i++)
	{
		newStr = newStr + str.charAt(i);
	}
	newStr = newStr + result;
	for (i = end_i + 1; i < str.length(); i++)
	{
		newStr = newStr + str.charAt(i);
	}
	
	
	
		return newStr;
	}

///////////////////////////////////////////////////////////////////////////


private static String Calculator(String op1, char op, String op2) {
    
	Double num1 = Double.parseDouble(op1);
	Double num2 = 0.0;
	if (op2 != null)
		num2 = Double.parseDouble(op2);

    char operation = op;
    
    //////////////////////////////////////////////////////////////////////////////////////////////
   // System.out.println(op1+" "+op+" "+op2);
    //System.out.println(num1+"operation="+operation+"num2="+num2);
    ///////////////////////////////////////////////////////////////////////////////////////////////
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
    	/////////////////////////////////////////////////////////////////
    	//System.out.println(num1/num2+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	//////////////////////////////////////////////////////////
        return round(num1/num2,3);//Double.toString(num1 / num2);
    }
    if (operation == '*')
    {
        return round((num1 * num2),2);
    }
    
    if (operation == '^')
    {
        return Double.toString(Math.pow(num1, num2));
    }
	
    if (operation == '!')
    {
    	Double sum = num1;

		for (int i = (int) (num1 - 1); i > 0; i--)
		{
			sum = sum * i;
		}
		return Double.toString(sum);
    }
        
    
    
    return "Calculation problem";
	}
//////////////////////////////////////////////////////////////////////////
public static String round(Double k,int size)
{
	///////////////////////////////////////////////////
	//System.out.println(k);
	///////////////////////////////////////////////////////
	String result = "";
	String buf = Double.toString(k);
	
	if (buf.length() <= 3 || buf.length() <= size)
		return buf;
	for(int i = 0; i < buf.length(); i++)
	{
		if (buf.charAt(i) != '.')
			result = result + buf.charAt(i);
		else
		{
			for(int j =0; j < size; j++)
			{
				result = result + buf.charAt(i);
				i++;
			}
			break;
		}
	}
	
	
	return result;
}
////////////////////////////////
	
	private static String ExtractPostNum(String str, int i) 
	{
		
		String tmp = "";
		if (str.charAt(i+1) == ' ')
			i = i+1;
		for (int j = i+1; (j <= str.length()-1 && IsAnum(str.charAt(j))); j++)
		{
			tmp = tmp +""+ str.charAt(j);
		}
		
		return tmp;
		
	}



//////////////////////////////////////////////////////////////////////////
	private static String ExtractPreNum(String str, int i) 
	{
		String tmp = "";

			i = i;
		int num = i;
		//////////////////////////////////
		//System.out.println("i="+i);
		///////////////////////////
		for (int j = i-1; (j >=0 && IsAnum(str.charAt(j)) ); j--)
			num = j;
		
		if (num == -1)
			num = 0;
		
		for (int j = num ; j < i ; j++)
		{
			//System.out.println("tmp="+tmp);
			tmp = tmp +""+ str.charAt(j);
		}
		
		return tmp;
		
	}
	
//////////////////////////////////////////////////////////////////////////
	
	
	
	private static boolean IsAnum(char ch)
	{
		if ((ch >= '0' && ch <= '9') || ch == '.')
			return true;
		return false;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public static String Root(String str)
	{
		/////////////////////////////////////////////
		System.out.println("str ="+str);
		///////////////////////////////////////////////////////
		String buf ="";
		int size = str.length();
		int start_i = 0 ,end_i = 0;
		
		for (int i = 0; i < size; i++)
		{
			if (str.charAt(i) == 'r')
			{
				for (int j = i; j <= i+3; j++)
				{
					buf = buf + str.charAt(j);
				}
				if (buf.equalsIgnoreCase("root"))
					start_i = i;
					
			}
		}
		/////////////////////////////////////////////
		System.out.println("buf1="+buf);
		///////////////////////////////////////////////////////
		buf = "";
		for (int i = start_i; i < size; i++)
		{
			if ( (str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.' )
				buf = buf + str.charAt(i);
		}
		
		Double do_tmp = Math.sqrt(Double.parseDouble(buf));
				/////////////////////////////////////////////
		System.out.println("buf2="+buf);
		///////////////////////////////////////////////////////
		str = InsertString(str,start_i,size,Double.toString(do_tmp));
			
		return Previous_parentheses(str);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static String ABS(String str)
	{
		/////////////////////////////////////////////
		System.out.println("str ="+str);
		///////////////////////////////////////////////////////
		String buf ="";
		int size = str.length();
		int start_i = 0 ,end_i = 0;
		
		for (int i = 0; i < size; i++)
		{
			if (str.charAt(i) == 'A')
			{
				for (int j = i; j <= i+2; j++)
				{
					buf = buf + str.charAt(j);
				}
				if (buf.equalsIgnoreCase("Abs"))
					start_i = i;
					
			}
		}
		/////////////////////////////////////////////
		System.out.println("buf1="+buf);
		///////////////////////////////////////////////////////
		buf = "";
		for (int i = start_i; i < size; i++)
		{
			if ( (str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.' )
				buf = buf + str.charAt(i);
		}
		
		Double do_tmp = Double.parseDouble(buf);
		
		//if (do_tmp < 0.0)
		//	do_tmp = do_tmp*(-1);
		
				/////////////////////////////////////////////
		System.out.println("buf2="+buf);
		///////////////////////////////////////////////////////
		str = InsertString(str,start_i,size,Double.toString(do_tmp));
			
		return Previous_parentheses(str);
	}
    

}
