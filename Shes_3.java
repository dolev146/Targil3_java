package tar_3;


public class Shes_3 {

	public static void main(String[] args) {
		System.out.println(" First number power second number " );
		int firNum = MyConsole.readInt("Enter base number  "); 
		int secNum = MyConsole.readInt("Enter power number "); 
		int pow = 1; 
		for (int i = secNum; i > 0 ; i--) {
		pow *= firNum;
		;
		}
System.out.println("the number is "+pow);
	}

}
