package tar_3;


public class Shes_2 {

	public static void main(String[] args) {
		System.out.println("Insert a number and ill draw you a tringle  ");
		int abs = MyConsole.readInt("Enter number here : ");
		while (abs == 0 ) { 
			System.out.println("0 is not vaild, choose a new number ");
			abs = MyConsole.readInt("Enter number here : ");
		}
		int num = abs < 0? -abs : abs; 

		for (int i = 0; i < num ; i++) {
			for (int j = i+1; j > 0 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}



	}

}
