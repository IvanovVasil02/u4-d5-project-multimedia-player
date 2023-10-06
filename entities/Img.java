package entities;
public class Img extends MultimediaElement implements Show{

  public Img(String title, int brightnessLevel) {
    super(title, brightnessLevel);
  }

  @Override
  public void show() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {
    return "Img:" +
            "title='" + this.title + getBrightnessLevel(this.brightnessLevel) +
            '.';
  }
}
