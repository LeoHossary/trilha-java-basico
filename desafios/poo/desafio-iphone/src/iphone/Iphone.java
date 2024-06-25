package iphone;

import iphone.aplicativos.AparelhoTelefonico;
import iphone.aplicativos.NavegadorInternet;
import iphone.aplicativos.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("No Meu Coração Você Vai Sempre Estar - Ed Motta");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar("912345678");
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.finalizarCorreioVoz();

        NavegadorInternet navegadorInternet = new NavegadorInternet();

        navegadorInternet.exibirPagina("www.youtube.com");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
    }
}