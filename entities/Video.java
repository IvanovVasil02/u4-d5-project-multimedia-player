package entities;

public class Video extends Multimedia implements Play{

  public Video(String title, int audioVolume, int brightnessLevel, int duration) {
    super(title, audioVolume, brightnessLevel, duration);
  }

  @Override
  public void play() {
    for (int i = this.duration; i > 0; i--){
      System.out.println("Video: " +
              "title = '" + this.title + getAudioVolume(this.audioVolume) +
              getBrightnessLevel(this.brightnessLevel) +
              "', duration: " + i +
              '.');
    }
  }
}
