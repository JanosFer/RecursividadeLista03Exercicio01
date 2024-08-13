package controller;

public class DigitosController {
	public DigitosController() {
		super();
	}
	
	public int contar(String n, int tamanho) {
		//Condição de Parada: Se o tamanho do número chegar a 0, a função recursiva para de ser chamada e retorna 0.
		
		if(tamanho == 0) {
			return 0;
		}else {
			//Se o último caractere for '-' (no caso de um número negativo), soma-se 0 com a recursiva e diminui o tamanho do número em 1, senão, soma-se 1 com a recursiva e diminui o tamanho do número em 1 . 
			
			if(n.charAt(tamanho-1) == '-') {
				return 0 + contar(n, tamanho-1);
			}else {
				return 1 + contar(n, tamanho-1);
			}
		}
	}
}
