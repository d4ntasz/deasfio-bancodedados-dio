
public class Main {

	public static void main(String[] args) {
		Cliente hiago = new Cliente();
		hiago.setNome("Hiago");
		
		Conta cc = new ContaCorrente(hiago);
		Conta poupanca = new ContaPoupanca(hiago);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
