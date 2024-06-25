package iphone.aplicativos;

public class AparelhoTelefonico {
  ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
  
  public void ligar(String numero) {
    reprodutorMusical.pausar();
    System.out.println("CHAMANDO " + numero);
  }
  public void atender() {
    reprodutorMusical.pausar();
    System.out.println("CHAMADA ACEITA");
  }
  public void desligar() {
    System.out.println("CHAMADA FINALIZADA");
    reprodutorMusical.tocar();
  }
  public void iniciarCorreioVoz() {
    reprodutorMusical.pausar();
    System.out.println("CORREIO DE VOZ INICIADO");
  }
  public void finalizarCorreioVoz() {
    System.out.println("CORREIO DE VOZ FINALIZADO");
    reprodutorMusical.tocar();
  }
}
