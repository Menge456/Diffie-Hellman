import java.util.Scanner;

//creates a model of the DH system of sending keys
public class DH {
	private Scanner sc = new Scanner(System.in);
	int g;
	int p;
	private int a;

	
	public DH(int a) {
		this.a = a;
	
		System.out.print("Choose a number (g). ");
		g = sc.nextInt();
		System.out.println();
		
		System.out.print("Choose another number(p). ");
		p = sc.nextInt();
		
	}
	
	
	//creates a ciphertext between the two
	//ab == true, a is sending their key
	//ab = false, b is sending their key
	public int send() {
		int c = 1;
		for(int i = 0; i < a; i++) 
			c *= g;
		
		c %= p;
		
		return c;
	}
	
}
