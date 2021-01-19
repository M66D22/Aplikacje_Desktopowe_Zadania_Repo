import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String imie, nazwisko;
		int wiek;
		float waga, wzrost;
		float BMI;
		System.out.println("Podaj imie: ");
		imie = sc.nextLine();
		System.out.println("Podaj nazwisko: ");
		nazwisko = sc.nextLine();
		System.out.println("Podaj wiek: ");
		wiek = sc.nextInt();
		System.out.println("Podaj wage: ");
		waga = sc.nextFloat();
		System.out.println("podaj wzrost: ");
		wzrost = sc.nextFloat();
		
		BMI = waga / (wzrost*wzrost) * 1000;
		System.out.println("Twoje bmi wynosi: "+BMI);
		
		if (BMI < 1.699){
			System.out.println("Wychudzenie!");
		}
		else if (BMI < 1.849 || BMI > 1.699){
			System.out.println("Niedowaga!");
		}
		else if (BMI <2.499 || BMI > 1.849){
			System.out.println("Wartosc prawidlowa!");
		}
		else if (BMI < 2.999 || BMI > 2.499){
			System.out.println("Nadwaga");
		}
		else if (BMI < 3.499 || BMI > 2.999){
			System.out.println("1 stopien otylosci");
		}
		else if (BMI < 3.999 || BMI > 3.500){
			System.out.println("1 stopien otylosci");
		}
	}
}