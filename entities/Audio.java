package entities;

public class Audio extends MultimediaElement implements Play{
  public Audio(String title, int audioVolume, int duration) {
    super(title, audioVolume, duration);
  }

  @Override
  public void play() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Audio:" +
            "title='" + this.title + getAudioVolume(this.audioVolume) +
            ", duration: " + this.duration +
            '.';
  }

}
