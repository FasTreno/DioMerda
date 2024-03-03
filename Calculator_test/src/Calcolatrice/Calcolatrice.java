package Calcolatrice;

public class Calcolatrice 
{

	    // Metodo per l'addizione
	    public double somma(double num1, double num2) {
	        return num1 + num2;
	    }

	    // Metodo per la sottrazione
	    public double sottrazione(double num1, double num2) {
	        return num1 - num2;
	    }

	    // Metodo per la moltiplicazione
	    public double Moltiplicazione(double num1, double num2) {
	        return num1 * num2;
	    }

	    // Metodo per la divisione
	    public double divisione(double num1, double num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            return Double.NaN; // Not-a-Number
	        }
	    }
}

	  

