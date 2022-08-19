
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		
		// Testando uma igualdade
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2) {
			System.out.println("Número 1 e numero 2 são iguais");
		}

		
		// Testando uma Desigualdade
		num1 = 10;
		num2 = 30;
		if (num1 != num2) {
			System.out.println("Número 1 e numero 2 são diferentes");
		}
		
		// Testando maior
		num1 = 10;
		num2 = 30;
		if (num1 > num2) {
			System.out.println("Número 1 maior que número 2");
		} else {
			System.out.println("Número 2 maior que número 1");
		}
		
		//Operadores Lógicos
		//&& = e / AND || = ou / OR
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
		}
		
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
		}
	}

}
