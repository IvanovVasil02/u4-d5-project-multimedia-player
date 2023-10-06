package entities;

public class Video extends MultimediaElement implements Play{

  public Video(String title, int audioVolume, int brightnessLevel, int duration) {
    super(title, audioVolume, brightnessLevel, duration);
  }

  @Override
  public void play() {
    System.out.println(toString());
  }
  @Override
  public String toString() {
    return "Video:" +
            "title='" + this.title + getAudioVolume(this.audioVolume) +
            getBrightnessLevel(this.brightnessLevel) +
            ", duration: " + this.duration +
            '.';
  }
}
