public class Cliente {

    private String nomeTitular;
    private String cpf;
    private String endereco;
    private String email;
    private int telefone;

    public Cliente(double saldo, String nomeTitular, String cpf, String endereco, String email, int telefone) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    protected String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }


    public void updateEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updateTelefone(int telefone) {
        this.telefone = telefone;
    }
}
