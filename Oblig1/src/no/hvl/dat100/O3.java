package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class O3 {

	public static void main(String[] args) {
		
		String nTall = showInputDialog("Skriv inn et tall ");
		
		int n = Integer.parseInt(nTall);
		int total = 1; 
		
       
		
	String outTxt = "";
	String outTxtt = "";
	for (int i = n; i >= 1 ; i--) {
		 if (i == 1 )	
		    {
		 		outTxt += i;
		 	}
		 	  else {
                outTxt += i + "*";
                total = total*i; 
                
		 		   }
		  }
	
	showMessageDialog(null,outTxt + "=" + total);	
	}
}