package entities;
public class Img extends Multimedia implements Show{

  public Img(String title, int brightnessLevel) {
    super(title, brightnessLevel);
  }

  @Override
  public void show() {
    System.out.println("Img:" +
            " title = '" + this.title + getBrightnessLevel(this.brightnessLevel) +
            "'.");
  }
}
