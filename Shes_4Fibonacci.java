package tar_3;


public class Shes_4Fibonacci {

	public static void main(String[] args) {
		System.out.println("fibonaccie seires index ");
		int count = MyConsole.readInt("Enter index number : ");
		int num1 = 1; 
		int num2 = 1; 
		@SuppressWarnings("unused")
		int temp = 1;
		int numx = 0;
		if (count< 3)	{
			System.out.println("Your number is 1");
		}else {
	    for (int i = 2; i < count ; i++) {
		numx = num1+num2; 
		if ( count > 2 ) { 
			temp = num1; 
			num1 = num2;
			num2 = numx;
			
		}
			
	}
	    
	    System.out.println("your fibbonacci number is "+numx);
		}
	
	}

}
