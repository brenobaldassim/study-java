public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
		cliente.setNomeTitular("Breno Baldassim");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(200);
		cc.transferir(400, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
