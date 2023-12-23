package classes;

import interfaces.MusicPlayer;

public class IphonePlayer implements MusicPlayer {

  public void open() {
    System.out.println("\n******** Starting music player **********");
  }

  @Override
  public void play() {
    System.out.println("Playing Music");
  }

  @Override
  public void stop() {
    System.out.println("Stop playing Music");

  }

  @Override
  public void selectMusic() {
    System.out.println("Music Selected");
  }
}
