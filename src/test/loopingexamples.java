package test;

public class loopingexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		
		int[] array1 = {11,34,55,22,23,76};
		
		String str1 = "clean India";
		
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		for(i=0;i<array1.length;i++) {
			System.out.println(i);
		}
		// array reverse order
        for(i=array1.length-1;i>=0;i--) {
            
            System.out.println(array1[i]);
        }
        for(i=array1.length-1;i>=0;i--) {
            
            System.out.println(array1[i]);
        }
        
        for(int values:array1) {
        	
        	System.out.println(values);
        }
        
        //
        
        for(int j=0;j<str1.length();j++) {
        	
        System.out.println(str1.charAt(j));
        }
		
   
		for(int k=str1.length()-1;k>=0;k--) {
        	
         revStr1 += str1.charAt(k);
         
        }
        
        System.out.println("Reversed String :" + revStr1);
        
        String[] words = str1.trim().split(" ");
        System.out.println("total words are" + words.length);
        
        //
        int x=1;
        while(x<=10) {
        	System.out.println(x);
        	x=x+1;
        	
        	//
        	
        	int n1 = 436721;
        	int count=0;
        	while(n1>0) {
        		int r = n1%10;
        		System.out.println(r);
        		count++;
        		n1 = n1/10;
        	}
        	
        System.out.println("total digits are" + count);
        
        
        //
        
        
        }

	}

}
