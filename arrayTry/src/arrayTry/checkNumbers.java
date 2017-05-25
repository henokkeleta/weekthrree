package arrayTry;

public class checkNumbers {

	public static void main(String[] args) {
		int[]ary={1,3,67,54,89,100};
	System.out.println("the latgest element is:"+LargestElement(ary));
	System.out.println("the smallest element:"+SmallestElement(ary));
	}
    public static int LargestElement(int[] anyArray)
    { 
    	int i=0;
    	int largest = anyArray[0];
    	for(i=0;i<anyArray.length;i++)
    	{ 
    		if(anyArray[i]>largest)
    		{ 
    			largest=anyArray[i];
    		}
    		
    	}return largest;
    }
    public static int SmallestElement(int[] anyArray)
    { 
    	int least = anyArray[0];
    	for(int i=0;i<anyArray.length;i++)
    	{ 
    		if(anyArray[i]<least)
    		{ 
    			least=anyArray[i];
    		}
    		
    	}return least;
    }
}
