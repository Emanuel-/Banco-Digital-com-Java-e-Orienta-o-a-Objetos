
public class Main {

	public static void main(String[] args) {
		
		Cliente emanuel = new Cliente();
		emanuel.setNome("Emanuel Roberto");
		
		Conta cc = new ContaCorrente(emanuel);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(emanuel);
		
		cc.transferir(25, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
