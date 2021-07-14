package tar_3;



public class Shes_6magicnum {

	public static void main(String[] args) {
		System.out.println("Ill give you the mushlam number ");
		int num = MyConsole.readInt("Enter your number : "); // the main number from the user type name = new type();
		int devisor = 0;
		for (int i = 1; i <  num ; i++) {
		if (num % i == 0 )  { 
		devisor += i;
		}	
		}
		if (devisor == num) { 
			System.out.println("This number is mushlam!");
		}
		else {
		System.out.println("This number is not mushlam!");
		}
	}

}
