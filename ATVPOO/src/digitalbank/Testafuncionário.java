package digitalbank;

public class Testafuncionário {

	public static void main(String[] args) {
		
		funcionario Jose = new funcionario ();
		
		Jose.setNome("Jose Francisco");
		Jose.setCpf("11204412378");
		Jose.setSalario(5.000);
		
		System.out.println("\nOs dados do funcionário cadastrados são: \t");
		System.out.println(Jose.getNome());
		System.out.println(Jose.getBonificacao());

	}

}
