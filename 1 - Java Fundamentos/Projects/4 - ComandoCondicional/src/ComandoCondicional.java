
public class ComandoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("If normal - Número 1 é menor que número 2");
		} 
		System.out.println("--------------------");
		
		if (num1 > num2) {
			System.out.println("If com else - Número 1 é maior que número 2");
		} else {
			System.out.println("If com else - Número 1 é menor que número 2");
		}
		
		
		// Situação composta - num1 < num2
		if (num1 > num2) {
			System.out.println("Condição composta 1 - Número 1 é maior que número 2");
		} else if (num1 < num2) {
			System.out.println("Condição composta 1 - Número 1 é menor que número 2");
		} else {
			System.out.println("Condição composta 1 - Número 1 é igual ao número 2");
		}
		
		// Situação composta - num1 == num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condição composta 2 - Número 1 é maior que número 2");
		} else if (num1 < num2) {
			System.out.println("Condição composta 2 - Número 1 é menor que número 2");
		} else {
			System.out.println("Condição composta 2 - Número 1 é igual ao número 2");
		}
		
		// Comando condicional SWITCH
		char opcao = '5';
		switch (opcao) {
		case '1': {
			System.out.println("Incluir");
			break;
		}
		case '2': {
			System.out.println("Editar");
			break;
		}
		case '3': {
			System.out.println("Apagar");
			break;
		}
		case '4': {
			System.out.println("Consultar");
			break;
		}
		default:
			System.out.println("Opção Inválida: " + opcao + "Redigite");
		}
	}

}
