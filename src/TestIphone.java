public class TestIphone {
  public static void main(String[] args) {
    Iphone iphoneX = new Iphone();

    iphoneX.player.open();
    iphoneX.player.selectMusic();
    iphoneX.player.play();
    iphoneX.player.stop();

    iphoneX.browser.open();
    iphoneX.browser.showPage("Google.com");
    iphoneX.browser.addNewTab();
    iphoneX.browser.refreshPage();

    iphoneX.phone.open();
    iphoneX.phone.call("22334-5554");
    iphoneX.phone.answer();
    iphoneX.phone.voiceMailer();

  }
}
