public class Iphone implements AparelhoEletronico,NavegadorInternet,ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pra o número: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}