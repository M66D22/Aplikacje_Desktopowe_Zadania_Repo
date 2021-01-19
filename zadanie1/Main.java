import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		String hasloZKlawiatury = "";
		String hasloStale = "Miszek";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj haslo, a ja porownam je z haslem zapisanym w programie.");
		System.out.println("");
		System.out.println("");
		System.out.println("Podaj haslo: ");
		hasloZKlawiatury = sc.next();
		System.out.println("Haslo wczytane z klawiatury to: "+hasloZKlawiatury);
		
		
		if (hasloZKlawiatury.equals(hasloStale)){
			System.out.println("Haslo sie zgadza!");
		}
		else{
			System.out.println("Haslo sie nie zgadza!");
		}
	}
}