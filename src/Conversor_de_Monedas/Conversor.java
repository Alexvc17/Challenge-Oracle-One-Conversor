package Conversor_de_Monedas;

import javax.swing.*;


public class Conversor {
	
	
	public void ConversorPesosColDolar(double valor) {
		
		double Dolar = valor /  3967.67;
		Dolar = Math.round(Dolar * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Dolar + " dólares");
		
	}
	
	public void ConversorPesosColEuro(double valor) {
		
		double Euro = valor / 4342.58;
		Euro = Math.round(Euro * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Euro + " euros");
		
	}
	
	public void ConversorPesosColLibra(double valor) {
		
		double Libra = valor / 5062.89;
		Libra = Math.round(Libra * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Libra + " libras");
		
	}
	
	public void ConversorPesosColYen(double valor) {
		
		double Yen = valor / 28.45;
		Yen = Math.round(Yen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Yen + " yenes");
		
	}
	
	public void ConversorPesosColWon(double valor) {
		
		double Won = valor / 3.09;
		Won = Math.round(Won * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Won + " Wons");
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////77
	public void ConversorPesosDolarCol(double valor) {
		
		double Dolar = valor *  3967.67;
		Dolar = Math.round(Dolar * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Dolar + " pesos Colombianos");
		
	}
	
	public void ConversorPesosEuroCol(double valor) {
		
		double Euro = valor * 4342.58;
		Euro = Math.round(Euro * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Euro + " pesos Colombianos");
		
	}
	
	public void ConversorPesosLibraCol(double valor) {
		
		double Libra = valor * 5062.89;
		Libra = Math.round(Libra * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Libra + " pesos Colombianos");
		
	}
	
	public void ConversorPesosYenCol(double valor) {
		
		double Yen = valor * 28.45;
		Yen = Math.round(Yen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Yen + " pesos Colombianos");
		
	}
	
	public void ConversorPesosWonCol(double valor) {
		
		double Won = valor * 3.09;
		Won = Math.round(Won * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes $" + Won + " pesos Colombianos");
		
	}
	

	
}
