package Practice4;

import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
    	double leftOperand, result, rightOperand;
    	String leftString, operator, rightString;
    	StringTokenizer tokenizer;
    	Scanner in = new Scanner(System.in);

    	tokenizer = new StringTokenizer(in.nextLine(), "+-*/ ", true);
    	
    	Object num;

       	try
       	{
       		leftString = tokenizer.nextToken();
       		operator = tokenizer.nextToken();
       		rightString = tokenizer.nextToken();

       		leftOperand = Double.parseDouble(leftString);
       		rightOperand = Double.parseDouble(rightString);
          
       		if(operator.equals("+") && operator.equals("-")) {
       			result = leftOperand + rightOperand;
       			result = leftOperand - rightOperand;
    		   	System.out.println("dasdasdas");
       		}
       		else if(operator.equals("+")) result = leftOperand + rightOperand;
       		else if(operator.equals("-")) result = leftOperand - rightOperand;
       		else if(operator.equals("*")) result = leftOperand * rightOperand;
       		else if(operator.equals("/")) result = leftOperand / rightOperand;
       		else {
       			result = 0.0;
       		}

       		System.out.println("Result: " + result);
       	}
       	catch(NoSuchElementException nsee) {
       		System.out.println("Invalid syntax");
       	}
       	catch(NumberFormatException nfe) {
//       		if(num instanceof Double){
//       			System.out.println(" ");
//       		}
       		System.out.println("One or more operands is not a number");
       	}
    }
}
