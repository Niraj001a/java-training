package handson;

public class OddEvenAdd {
	
	public static void main(String[] args) {
		
//		Array declaration and initialization
		int arr []= {1,4,3,7,6,3,3,2,8,3,9,13,80,45};
		int oddSum =0;
        int evenSum=0;		
        

        for(int i=0;i<arr.length;i++) {
//          Adding all Even number to the Even Container
        	if(arr[i]%2==0) {
        		evenSum+=arr[i];
        	}
//          Adding all Odd number to the Odd Container
        	else {
        		oddSum+=arr[i];
        	}
        }
        System.out.println("The addition of all Even in array is : "+evenSum);
        System.out.println("The addition of all Odd in array is : "+oddSum);
	}

}
