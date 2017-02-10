import java.util.*;
public class StringOperations {
	
	static void displayVowels(String str)
	{
		System.out.print("All vowels in the string:");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U')
			{System.out.println(str.charAt(i));}
		}
		 
	}
	
	static String convertInt2String(int number)
	{
		String str=""+number;
		return str;
	}
	
	static boolean isOperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		{
			return true;
		}
		else
			return false;
	}
	
	static void displayConsonents(String str)
	{
		
		String consonants="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		System.out.print("All consonents in the string:");
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=0;j<consonants.length();j++)
			{
				if(str.charAt(i)==consonants.charAt(j))
					{System.out.println(str.charAt(i));}
			}
		}
		 
	}
	
	static void displayDigits(String str)
	{
		
		String digits="0123456789";
		System.out.print("All digits in the string:");
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=0;j<digits.length();j++)
			{
				if(str.charAt(i)==digits.charAt(j))
					{System.out.println(str.charAt(i));}
			}
		}
		 
	}
	
	static boolean isValidString(String str)
	{
		boolean isValidString=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')
			{
				isValidString=true;
			}
			else
				isValidString=false;
			break;
		}
		return isValidString;
	}
	
	
	static int performOperation(int op1, int op2, char operator)
	{
		 switch(operator)
		 {
		 case '+':
			 return op1+op2;
			 
		 case '-':
			 return op1-op2;
			 
		 case '*':
			 return op1*op2;
		 case '/':
			 return op1/op2;
		 }
		 return 0;
	}
	static int convertString2Int(String str)
	{
		int number=0;
		for(int i=0;i<str.length();i++)
		{
			
			switch(str.charAt(i))
			{
			case '1':
				number=(number*10)+1;
				break;
			case '2':
				number=(number*10)+2;
				break;
			case '3':
				number=(number*10)+3;
				break;
			case '4':
				number=(number*10)+4;
				break;
			case '5':
				number=(number*10)+5;
				break;
			case '6':
				number=(number*10)+6;
				break;
			case '7':
				number=(number*10)+7;
				break;
			case '8':
				number=(number*10)+8;
				break;
			case '9':
				number=(number*10)+9;
				break;
			case '0':
				number=(number*10)+0;
				break;
			}
		}
		return number;
	}
/* breakString functions breaks the whole string into set of operands and operators*/
	static void breakString(String str)
	{
		
		String operand1=new String();
		String operand2=new String();
		char operator=' ';
		boolean anyOperatorOccuredYet=false;
		if(isValidString(str)==true) /*This if condition looks for validity of the string to participate in arithmatic operation*/
		{ 
			for(int i=0;i<str.length();i++)
			{
				if(isOperator(str.charAt(i))&&anyOperatorOccuredYet==false)
				{
					operator=str.charAt(i);
					anyOperatorOccuredYet=true;
				}
				else if(isOperator(str.charAt(i))&&anyOperatorOccuredYet==true)/*This conditon focuses on strings with multiple operators*/
				{
					operand1=convertInt2String(performOperation(convertString2Int(operand1), convertString2Int(operand2), operator));
					operator=str.charAt(i);
					operand2="";
				}
				else if(anyOperatorOccuredYet==true)
				{
					operand2=operand2+str.charAt(i);
				}
				else if(anyOperatorOccuredYet==false)
				{
					operand1=operand1+str.charAt(i);
				}
				else if(str.charAt(i)==' ')
				{ continue; }
				
			}
			/*The substrings operand1, operand2 are fed into function convertString2Int() to get integer equvalents of those substrings */
			/*The output of convertString2Int() and character operator is fed into performOperation() function which performs arithmatic operation and return result in integer */
			if(anyOperatorOccuredYet==true)
		    System.out.println("Result is: "+performOperation(convertString2Int(operand1), convertString2Int(operand2), operator));
			else if(anyOperatorOccuredYet==false)
				{System.out.println(convertString2Int(operand1));}
			
		}
		else
		{System.out.println("String you entered is not valid to perform arithmatic operations");}
	}
	
	public static void main(String args[])
	{
		int choice=0;
String str=new String();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string"); /* Ask user to enter a string*/
str=sc.nextLine();
System.out.println("String given is: "+ str);
/* Ask user to select an operation*/
System.out.println("Enter \n 1: Display vowels \n 2: Display consonents \n 3: Display digits \n 4:Perform arithmatic operations");
choice=sc.nextInt();
switch(choice)
{
case 1:
	/* If user selects to display vowels, displayVowels() function is called*/
	displayVowels(str);
	break;
case 2:
	/* If user selects to display consonants, displayConsonents() function is called*/
	displayConsonents(str);
	break;
case 3:
	/* If user selects to display digitd, displayDigits() function is called*/
	displayDigits(str);
	break;
case 4:
	/* If user selects to perform arithmatic operation on the string, breakString() function is called*/
	breakString(str);
	break;
	default:
		System.out.println("Invalid choice");
		break;
	
}
sc.close();
	}
}
