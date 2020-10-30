package Package1;

import java.util.Scanner;

public class Onzin {
	public static void main(String[] args) {
		
		Datum datum1 = new Datum(12, 12, 12);
		
		Scanner invoer = new Scanner(System.in);
		
		System.out.println("Vul de naam van de leerling in: ");
		String nm = invoer.nextLine();
		System.out.println("Vul de leeftijd van de leerling in: ");
		int lft = invoer.nextInt();
		
		Leerling persoon1 = new Leerling(nm, lft);
		System.out.println(persoon1.stelJeVoor());
		
		invoer.close();
	}
}

