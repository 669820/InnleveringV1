package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class KarakterV3 {

	

	    public static void main(String[] args) {
	        int numberRead = 0;
	        while(true) {
	            if(numberRead == 10) {
	                break;
	            }
	            String karakter = showInputDialog("poengsum: ");
	            int poeng = parseInt(karakter);
	            if(poeng<0) {
	                System.out.println("Ugyldig, skriv inn på ny.");
	                numberRead = numberRead-1;
	            }
	            else if(poeng<=39 && poeng>=0) {
	                System.out.println("F");
	            }
	            else if(poeng<=49 && poeng>=40) {
	                System.out.println("E");
	            }
	            else if(poeng<=59 && poeng>=50) {
	                System.out.println("D");
	            }
	            else if(poeng<=79 && poeng>=60) {
	                System.out.println("C");
	            }
	            else if(poeng<=89 && poeng>=80) {
	                System.out.println("B");}
	            else if(poeng<=100 && poeng>=90) {
	                System.out.println("A");}
	            else {
	                System.out.println("Ugyldig, skriv inn på ny.");
	                numberRead = numberRead-1;
	                }
	            numberRead = numberRead+1;
	        }        
	    }
	}
