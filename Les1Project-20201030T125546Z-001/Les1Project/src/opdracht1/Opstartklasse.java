package opdracht1;

import java.util.Scanner;

public class Opstartklasse {

	Rekening rekening1 = new Rekening("1",5000,false);
	
	Scanner invoer = new Scanner(System.in);
	
	System.out.println("Hoe veel geld wil je opnemen?");
	double opname = invoer.nextDouble();

	//alles werkt hier behalve het saldo er af halen

	rekening1.setSaldo(rekening1.getSaldo() - this.opname);
	 
	invoer.close();
	
}