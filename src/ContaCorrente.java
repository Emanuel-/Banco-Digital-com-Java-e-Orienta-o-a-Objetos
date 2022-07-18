
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Corrente ===");
		//System.out.println(String.format("Agencia: %d", super.agencia));
		
		super.imprimirInfosComuns();
		
	}
	
}
