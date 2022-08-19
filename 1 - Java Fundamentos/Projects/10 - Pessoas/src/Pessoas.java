
public class Pessoas {

	public static void main(String[] args) {


		Fisica fis = new Fisica();
		fis.nome = "Thiago";
		fis.cpf = "111111111";
		fis.identidade = "1560455";
		fis.situacaoPessoa = "A";
		
		Juridica jur = new Juridica();
		jur.nome = "CASAS DO SILVA";
		jur.cnpj = "45678913";
		jur.inscEstadual = "456789";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da pessoa Física");
		System.out.println(fis.toString());
		
		System.out.println("Dados da pessoa Jurídica");
		System.out.println(jur.toString());

	}

}
