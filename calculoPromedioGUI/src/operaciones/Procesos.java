package operaciones;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Procesos {

	public double calcularPromedio(double nota1, double nota2, double nota3) {

		double promedio = 0;

		promedio = (nota1 + nota2 + nota3) / 3;

		return promedio;
	}

	public String calcularDefinitiva(double promedio) {

		if (promedio >= 3) {
			return "GANA";
		} else {
			return "PIERDE";
		}

	}

	public boolean validarNotas(double n1, double n2, double n3) {
		
		if(n1 >= 0 && n1 <= 5 && n2 >= 0 && n2 <= 5 && n3 >= 0 && n3 <= 5) {
			return true;
		}else {
			return false;
		}

	}

}
