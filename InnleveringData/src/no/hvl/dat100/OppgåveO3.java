package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgåveO3 {

	public static void main(String[] args) {
		
		String Fakultet = "heltall: ";
		
		int n = Integer.parseInt(showInputDialog(Fakultet));
		
		int x = n;
		int y = 1;
		while (n >1 ) {
			y *= n;
			n --;
		}
		showMessageDialog(null, x+"! = " + y);
		
	}

}
