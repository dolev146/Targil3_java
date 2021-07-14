package tar_3;



public class Shes_5MaxNum {

	public static void main(String[] args) {
		System.out.println("tell me how many numbers and the numbers and ill give you the MAX ");
		int loopCount = MyConsole.readInt("Enter how many numbers do you want to check : ");
		double max =  Double.MIN_VALUE;
		int abs = loopCount < 0? -loopCount : loopCount; 
		for (int i = abs; i > 0; i--) {
			double num1 = MyConsole.readDouble("Enter number : "); 
			max = num1 > max ? num1 :max ; 
		}
		System.out.println("Your max number is = "+max);
	}

}
