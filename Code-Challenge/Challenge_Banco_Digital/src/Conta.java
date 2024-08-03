public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    // Create Constructor for this class
    public Conta(int agencia, int numero, double saldo, Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void updateSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public void sacar(double valor) throws Exception{
        if(saldo >= valor) saldo -= valor;
        else throw new Exception("Saldo Insuficiente");
        
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) throws Exception{
        try {
            this.sacar(valor);
        } catch (Exception e) {
            throw new Exception("Falha ao transferir saldo");
        }
        
        contaDestino.depositar(valor);
    }

    // Method to implement in subclasses
    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNomeTitular()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
