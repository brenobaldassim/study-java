public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar(){}
    public void selecionarMusica(){}

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender(){}
    public void iniciarCorreioVoz(){}
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }
    public void adicionarNovaAba(){}
    public void atualizarPagina(){}
    
}
