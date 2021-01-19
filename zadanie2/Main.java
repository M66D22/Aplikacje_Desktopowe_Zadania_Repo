import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String zdanie = "";
		int dlugosc;
		
		System.out.println("Napisz zdanie a ja pokaze ci ile ma zankow");
		System.out.println("------------------------------------------");
		System.out.println("Zdanie: ");
		zdanie = sc.nextLine();
		
		dlugosc = zdanie.length();
		if (dlugosc > Integer.MAX_VALUE){
			System.out.println("Twoje zdanie jest za dlugie zebym policzyl ilosc jego znakow!");
		}
		System.out.println("Twoje zdanie ma "+dlugosc+" znakow");
	}
}