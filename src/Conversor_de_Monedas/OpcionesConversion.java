package Conversor_de_Monedas;

import javax.swing.*;

public class OpcionesConversion {

	Conversor conv = new Conversor();
	
	public void convertirMonedas(double valor) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que quieras convertir", "Monedas",
						   JOptionPane.PLAIN_MESSAGE, null, new Object[]
						  {"De Pesos Colombianos a Dólares","De Pesos Colombianos a Euros","De Pesos Colombianos a Libras",
						   "De Pesos Colombianos a Yen","De Pesos Colombianos a Wons", "De Dólares a Pesos Colombianos","De Euros a Pesos Colombianos",
						   "De Libras a Pesos Colombianos","De Yen a Pesos Colombianos","De Wons a Pesos Colombianos"},"Seleccion")).toString();
				
		switch(opciones) {
		case "De Pesos Colombianos a Dólares":
			conv.ConversorPesosColDolar(valor);
			break;
		
		case "De Pesos Colombianos a Euros":
			conv.ConversorPesosColEuro(valor);
			break;
		
		case "De Pesos Colombianos a Libras":
			conv.ConversorPesosColLibra(valor);
			break;
			
		case "De Pesos Colombianos a Yen":
			conv.ConversorPesosColYen(valor);
			break;
			
		case "De Pesos Colombianos a Wons":
			conv.ConversorPesosColWon(valor);
			break;
			
		////////////////////////////////////
		
		case "De Dólares a Pesos Colombianos":
			conv.ConversorPesosDolarCol(valor);
			break;
			
		case "De Euros a Pesos Colombianos":
			conv.ConversorPesosEuroCol(valor);
			break;
			
		case "De Libras a Pesos Colombianos":
			conv.ConversorPesosLibraCol(valor);
			break;
			
		case "De Yen a Pesos Colombianos":
			conv.ConversorPesosYenCol(valor);
			break;
			
		case "De Wons a Pesos Colombianos":
			conv.ConversorPesosWonCol(valor);
			break;
			
		
			
		}
		
		
	}
}
