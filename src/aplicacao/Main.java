package aplicacao;

public class Main {

    public static void main(String[] args) {
        IphoneClasse iphone = new IphoneClasse();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;
        AparelhoTelefonico telefone = (AparelhoTelefonico) iphone;

        System.out.println("----------->");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        System.out.println("----------->");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();

        System.out.println("----------->");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }

}