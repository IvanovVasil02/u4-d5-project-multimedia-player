package entities;

public abstract class Multimedia {
  public String title;
  public int brightnessLevel;
  public int audioVolume;
  public int duration;

  //  Img Constructor
  public Multimedia(String title, int brightnessLevel) {
    this.title = title;
    this.brightnessLevel = brightnessLevel;
  }

  // Audio Constructor
  public Multimedia(String title, int audioVolume, int duration) {
    this.title = title;
    this.audioVolume = audioVolume;
    this.duration = duration;
  }

  //  Video Constructor
  public Multimedia(String title, int audioVolume, int brightnessLevel, int duration) {
    this.title = title;
    this.brightnessLevel = brightnessLevel;
    this.audioVolume = audioVolume;
    this.duration = duration;
  }

  //  Check the type of the selected element
  public static void playInstance(Multimedia element) {
    if (element instanceof Audio) {
      ((Play) element).play();
      System.out.println("Enter 1 to play audio");
      System.out.println("2 to raise the audio level");
      System.out.println("3 to lower the audio level");

    } else if (element instanceof Video) {
      ((Play) element).play();
      System.out.println("Enter 1 to play the video");
      System.out.println("2 to raise the audio level");
      System.out.println("3 to lower the audio level");
      System.out.println("4 to raise the brightness");
      System.out.println("5 to lower the brightness");

    } else {
      ((Show) element).show();
      System.out.println("Enter 1 to show the image");
      System.out.println("4 to raise the brightness");
      System.out.println("5 to lower the brightness");
    }


  }

  public static void setInstance(Multimedia element, int control) {


    switch (control) {
      case 1:
        playInstance(element);
        break;
      case 2:
        turnUpAudio(element);
        break;
      case 3:
        lowerAudio(element);
        break;
      case 4:
        turnUpBrightness(element);
        break;
      case 5:
        lowerBrightness(element);
        break;
    }

  }

  //  Get brightness level
  public static String getBrightnessLevel(int level) {
    String totalLevel = "";
    for (int i = 0; i < level; i++) {
      totalLevel += "*";
    }
    return totalLevel;
  }

  //  Calc audio volume level
  public static String getAudioVolume(int level) {
    String totalLevel = "";
    for (int i = 0; i < level; i++) {
      totalLevel += "!";
    }
    return totalLevel;
  }

  //  Lower Brightness
  public static void lowerBrightness(Multimedia element) {
    element.brightnessLevel -= 1;
    System.out.println("brightness level set to: " + getBrightnessLevel(element.brightnessLevel));

  }

  //  Turn up brightness
  public static void turnUpBrightness(Multimedia element) {
    element.brightnessLevel += 1;
    System.out.println("brightness level set to: " + getBrightnessLevel(element.brightnessLevel));
  }

  //  Lower audio
  public static void lowerAudio(Multimedia element) {
    element.audioVolume -= 1;
    System.out.println("Audio level set to: " + getAudioVolume(element.audioVolume));

  }

  //  Turn up audio
  public static void turnUpAudio(Multimedia element) {
    element.audioVolume += 1;
    System.out.println("Audio level set to: " + getAudioVolume(element.audioVolume));
  }

  public static Boolean isEmptyArray(Multimedia[] elemArray) {
    boolean result = true;
    for (Multimedia elem : elemArray) {
      if (elem == null) {
        result = false;
        break;
      }
    }
    return result;
  }

}
