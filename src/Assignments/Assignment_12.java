package Assignments;

public class Assignment_12 {
	
	public static void main(String[] args) {
		int array[]=new int []{1,0,0,1,1,1,0,0,1,1,0};
		System.out.println("Size of array is "+ array.length);
		
		
     for(int i=0;i<array.length;i++)
     {
    	 for(int j=i+1;j<array.length;j++)
    	 {
    		 int temp=0;
    	 if(array[i]>array[j])
    	 {
    		
    		 temp=array[i];
    		 array[i]=array[j];
    		 array[j]=temp;
    				
    	 }
    	 } 
    	 System.out.println(array[i]); 	 
     }
     
     
     
     
		
	}

}
