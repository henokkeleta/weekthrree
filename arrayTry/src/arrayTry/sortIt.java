package arrayTry;

public class sortIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]unsorted = {40,65,43,7,3,2,100};
		int[]newArray=sort1(unsorted);
		for(int i=0;i<newArray.length;i++)
		{ 
			System.out.println(newArray[i]);
		}

	}
     public static int[]sort1(int[]anyArray)
     { 
    	 int temp;
    	 int i;
    	
    	 int[]newArray1 = new int[anyArray.length];
    	  for(int j=0;j<anyArray.length ;j++)
		  { 
    	    int  least=anyArray[j];
    	      for(i=0;i<anyArray.length ;i++)
                {  
    		    anyArray[i]=SmallestElement(anyArray);
    		    
    		   // anyArray[i+1]=anyArray[i];
    		   
    		  }
    	     newArray1[j]=anyArray[j];
    	 }
    	 return newArray1;
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
