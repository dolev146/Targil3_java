package tar_3;


public class Shes_7Starupside {

	public static void main(String[] args) {
		System.out.println("Insert a number and ill draw you an upside tringle ! ");
		
		// validating the number we get
		int abs = MyConsole.readInt("Enter number here : ");
		while (abs == 0 ) { 
			System.out.println("0 is not vaild, choose a new number ");
			abs = MyConsole.readInt("Enter number here : ");
		}
		int num = abs < 0? -abs : abs; 
		
		
		// after we finished validating the number we will explain the solution
		
		//  s for the amount of spaces space 
		int s =0;
		
		// the big loop with i will be counting the amount of rows we will have in the squers :)
		for (int i = num; i > 0 ; i--) {
			
			
			// we figured out that the amount of the spaces that are need are num - 1 ==> the condition that meet this 
			//  critiria is  l>0 && num>l
			for (int l = s; l>0 && num>l; l--) {
				System.out.print("  ");

			}
			
			// for the stars we need num for the first row and then just go down j--  
			for (int j = i; j > 0 ; j--) {
				System.out.print("* ");
			}
			s ++;
			System.out.println();
		}

	}

}

