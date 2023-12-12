package handson;

public class RepeatingNumber {

	public static void main(String[] args) {
		int rep=0;
		int flag=0;
int arr[]= {19,81,3,19,522,43,23,81,3,4};	
		
//		Printing Array to show
System.out.print("the Array number are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		Checking Similar number 
		for(int j=0;j<arr.length;j++) {
		
		for(int i=j+1;i<arr.length;i++) {
			
			if(arr[j]==arr[i]) {
				rep=arr[j];
				flag++;
				break;
			}
			
		   }
		if(flag==1) {
			break;
		}
		}
		System.out.println("\nThe First Repeating Number was: "+ rep);
	}

}
