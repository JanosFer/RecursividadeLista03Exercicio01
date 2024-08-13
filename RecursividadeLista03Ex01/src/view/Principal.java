package view;

import controller.DigitosController;

public class Principal {
	public static void main(String[] args) {
		DigitosController dc = new DigitosController();
		
		int a = 9743;
		String b = a + "";
		
		System.out.println("O número de digitos de '" +a+"' é: " +dc.contar(b, b.length()));
	}
}
