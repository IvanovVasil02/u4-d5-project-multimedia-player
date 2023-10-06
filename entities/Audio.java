package entities;

public class Audio extends MultimediaElement implements Play{
  public Audio(String title, int audioVolume, int duration) {
    super(title, audioVolume, duration);
  }

  @Override
  public void play() {
    for (int i = this.duration; i > 0; i--){
      System.out.println("Audio: " +
              "title = '" + this.title + getAudioVolume(this.audioVolume) +
              "', duration: " + i +
              '.');
    }
  }


}
