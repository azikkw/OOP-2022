package Practice4;

public class Example3
{
    public static void main(String[] args)
    {
		int i;
		int[] data = {50, 320, 97, 12, 2000};
	
		try {
		    for (i = 0; i < 10; i++) {
		    	System.out.println(data[i]);
		    }
		} 
	    catch (ArrayIndexOutOfBoundsException aioobe) {
		    System.out.println("Done");
		}
		
		System.out.println();
		
	    for (i = 0; i < 10; i++) {
	    	if(i < data.length) System.out.println(data[i]);
	    	else {
	    		break;
	    	}
	    }
	    
	    
    }
}
