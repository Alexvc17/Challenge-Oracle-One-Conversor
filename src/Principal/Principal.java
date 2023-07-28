package Principal;

import javax.swing.*;

import Conversor_de_Monedas.OpcionesConversion;

public class Principal {
	public static void main(String[] args) {
		
		       OpcionesConversion conversor = new OpcionesConversion();
				
				while(true) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					if(input == null) {
						JOptionPane.showMessageDialog(null, "Fin del programa");
		                break;
					}
					double valor = Double.parseDouble(input);
					conversor.convertirMonedas(valor);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println(" ");
					}else {
						JOptionPane.showMessageDialog(null, "Fin del programa");
						break;
					}
					
					
		}
	}
}
