package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class OppgåveB3 {

	public static void main(String[] args) {

		final int trinn1 = 190349;
		final int trinn2 = 267900;
		final int trinn3 = 643800;
		final int trinn4 = 969200;
		final int trinn5 = 2000000;

		String inntektTxt = showInputDialog("Din inntetk: ");
		int inntekt = Integer.parseInt(inntektTxt);

		double trinnskatt = 0.0;

		if (inntekt >= trinn1 && inntekt < trinn2) {
			trinnskatt = 0.017;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= trinn2 && inntekt < trinn3)
			
		{
			trinnskatt = 0.04;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= trinn3 && inntekt < trinn4)
			
		{
			trinnskatt = 0.134;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= trinn4 && inntekt < trinn5)
			
		{
			trinnskatt = 0.164;
			trinnskatt = inntekt * trinnskatt;
		}
		if (inntekt >= trinn5)
			
		{
			trinnskatt = 0.174;
			trinnskatt = inntekt * trinnskatt;
		}
		showMessageDialog(null, "Skatt: " + trinnskatt + "kr");

	}
}