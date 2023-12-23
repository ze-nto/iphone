package classes;

import interfaces.Phone;

public class IphonePhone implements Phone {


  public void open() {
    System.out.println("\n******** Starting Phone App **********");
  }

  @Override
  public void call(String number) {
    System.out.println("Calling to " + number);
  }

  @Override
  public void answer() {
    System.out.println("Answer to call");
  }

  @Override
  public void voiceMailer() {
    System.out.println("Voice mailer starting");
  }
}
