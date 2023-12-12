package handson;

public class SecondHighestNumber {
	
	
	public static void main(String[] args) {
		
		int arr[]= {19,81,3,24,522};	
		
//		Printing Array to show
		for(int i=0;i<arr.length;i++) {
			System.out.println(" The value at place "+i+"  :  "+arr[i]);
		}
		
//		Finding Highest
		int highest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(highest<arr[i]) {
				
				highest=arr[i];
			}
		}
		
//Finding Second Highest
		int secHigh=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(secHigh<arr[i]&& highest!=arr[i]) {
				
				secHigh=arr[i];
			}
		}
		System.out.println("\n\nThe second highest Number in array :" +secHigh);
	}

}
