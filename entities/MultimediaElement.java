package entities;

public abstract class MultimediaElement {
  public String title;
  public int brightnessLevel;
  public int audioVolume;
  public int duration;

//  Img Constructor
  public MultimediaElement(String title, int brightnessLevel) {
    this.title = title;
    this.brightnessLevel = brightnessLevel;
  }

  //  Img Audio
  public MultimediaElement(String title, int audioVolume, int duration) {
    this.title = title;
    this.audioVolume = audioVolume;
    this.duration = duration;
  }

  //  Video Constructor
  public MultimediaElement(String title, int audioVolume, int brightnessLevel, int duration) {
    this.title = title;
    this.brightnessLevel = brightnessLevel;
    this.audioVolume = audioVolume;
    this.duration = duration;
  }

//  Get brightness level
  public static String getBrightnessLevel(int level) {
    String totalLevel= "";
    for(int i = 0; i<level; i++){
      totalLevel += "*";
    }
    return totalLevel;
  }

  //  Calc audio volume level
  public static String getAudioVolume(int level) {
    String totalLevel= "";
    for(int i = 0; i<level; i++){
      totalLevel += "!";
    }
    return totalLevel;
  }

  public static void lowerBrightness(MultimediaElement element) {
    element.brightnessLevel -= 1;
    System.out.println("brightness level set to: " + getBrightnessLevel(element.brightnessLevel));

  }
  public static void turnUpBrightness(MultimediaElement element) {
    element.brightnessLevel += 1;
    System.out.println("brightness level set to: " + getBrightnessLevel(element.brightnessLevel));
  }

  public static void lowerAudio(MultimediaElement element) {
    element.audioVolume -= 1;
    System.out.println("Audio level set to: " + getAudioVolume(element.audioVolume));

  }
  public static void turnUpAudio(MultimediaElement element) {
    element.audioVolume += 1;
    System.out.println("Audio level set to: " + getAudioVolume(element.audioVolume));
  }
}
