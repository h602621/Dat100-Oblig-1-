package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class B5 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

		
		String poengTxt = showInputDialog("Skriv inn poeng");
		int poeng = parseInt(poengTxt);
		
		
		
		 if (poeng < 0 || poeng > 100)
		{
			System.out.println("Feil, skriv et tall mellom 0-100");
				
		}
		
		 else if (poeng <= 39)
		{
			System.out.println("Du fikk en F");
		}
		
		else if (poeng <= 49)
		{
			System.out.println("Du fikk en E");
		}
		
		else if (poeng <= 59)
		{
			System.out.println("Du fikk en D");
		}
		
		else if (poeng <= 70)
		{
			System.out.println("Du fikk en C");
		}
		
		else if (poeng <= 89)
		{
			System.out.println("Du fikk en B");
		}
		
		else if (poeng <= 100)
		{
			System.out.println("Du fikk en A");
		}
		
		}
		 
	}

}