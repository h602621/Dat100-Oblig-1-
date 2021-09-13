package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class B4 {

	public static void main(String[] args) {

		String bruttoTxt = showInputDialog("Skriv in bruttolønn");
		int bruttoHel = parseInt(bruttoTxt);
		
		double brutto = bruttoHel;

		
		double proEn = 1.7;
		double proTo = 4.0;
		double proTre = 13.2;
		double proFire = 16.2;
		
		double satsEn = (brutto*proEn)/100; 
		double satsTo = (brutto*proTo)/100;
		double satsTre = (brutto*proTre)/100;
		double satsFire = (brutto*proFire)/100;
		
		int sats1 = (int)satsEn;
		int sats2 = (int)satsTo;
		int sats3 = (int)satsTre;
		int sats4 = (int)satsFire;
		
		
		
		
		
		if (brutto <= 164100)
		{
			System.out.println("Skattetrinn 0: Du betaler ikke skatt" + brutto);
		}
		else if (brutto <= 230950)
		{
			System.out.println("Skattetrinn 1: Dette betaler du i skatt " + sats1 + " det er 1.7%");
		}
		
		else if (brutto <= 580650)
		{
			System.out.println("Skattetrinn 2: Dette betaler du i skatt " + sats2 + " det er 4.0%");
		}
		
		else if (brutto <= 934050)
		{
			System.out.println("Skattetrinn 3: Dette betaler du i skatt " + sats3 + " det er 13.2%");
		}
		
		else if (brutto <= 934051)
		{
			System.out.println("Skattetrinn 4: Dette betaler du i skatt " + sats4 + " det er 16.2%");
		}
		
	}

}