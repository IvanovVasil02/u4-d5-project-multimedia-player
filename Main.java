import entities.Audio;
import entities.Img;
import entities.MultimediaElement;
import entities.Video;

public class Main {

  public static void main(String[] args) {
    Img img1 = new Img("First image", 3);
    img1.show();

    Audio audio1 = new Audio("All of me", 2, 5);
    audio1.play();

    Video video1 = new Video("All of me", 2, 3, 4);
    video1.play();

    MultimediaElement.turnUpBrightness(video1);
    MultimediaElement.lowerAudio(video1);
    MultimediaElement.turnUpAudio(video1);
    MultimediaElement.lowerBrightness(audio1);
    
  }
}
