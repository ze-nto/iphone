package classes;

import interfaces.InternetBrowser;

import java.util.Scanner;

public class IphoneBrowser implements InternetBrowser {

  public void open() {
    System.out.println("\n******** Starting o browser **********");
  }
  @Override
  public void showPage(String page) {
    System.out.println("Exibindo a página: " + page);
  }

  @Override
  public void addNewTab() {
    System.out.println("Adicionando nova aba");
    System.out.println("Esperando um endereço...");
    String endereco = new Scanner(System.in).next();
    showPage(endereco);
  }

  @Override
  public void refreshPage() {
    System.out.println("Atualizando a página");
  }
}
