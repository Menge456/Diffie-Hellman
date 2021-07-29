import java.util.Scanner;
import java.math.BigInteger;
public class User {
	private BigInteger a;
	private static BigInteger g = new BigInteger("-1");
	private static BigInteger p = new BigInteger("-1");
	public User() {

		Scanner sc = new Scanner(System.in);
		
		
		while(Integer.parseInt(p.toString()) < 0) {
			System.out.print("Choose a prime (p). ");
			p = new BigInteger(sc.nextLine());
			System.out.println();
		}
		
		while(Integer.parseInt(g.toString()) < 0 || Integer.parseInt(g.toString()) > Integer.parseInt(p.toString()) ){
			System.out.print("Choose a number less than p (g). ");
			g = new BigInteger(sc.nextLine());
			System.out.println();
		}
	
		
		a =  new BigInteger(((int)(Math.random() * Integer.parseInt(p.toString())) + 1) + "");
		System.out.println("a " + a);
		
	}
	//sends the code into the other user's receive for it to correctly do g^ab
	public BigInteger send(User b) {
		
		return b.receive(g.modPow(a, p));
	}
	
	private BigInteger receive(BigInteger c) {
		
		return c.modPow(a, p);
	}
	
}
