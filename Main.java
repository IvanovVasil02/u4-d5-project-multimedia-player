import entities.Audio;
import entities.Img;
import entities.Multimedia;
import entities.Video;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Img img1 = new Img("First image", 3);
    Img img2 = new Img("Second image", 3);
    Audio audio1 = new Audio("All of me", 2, 5);
    Video video1 = new Video("Perfect", 2, 3, 4);
    Video video2 = new Video("hawaii", 2, 3, 4);

    Multimedia[] elements = new Multimedia[5];

    int active = 1;

    Scanner input = new Scanner(System.in);
    switch (active) {


      case 1:
        while (active == 1) {
          for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + " element or enter 0 to exit");
            System.out.println("Enter 1 to insert image");
            System.out.println("Enter 2 to insert audio");
            System.out.println("Enter 3 to insert video");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 0) {
              break;
            }
            switch (choice) {

              case 1: {
                System.out.println("Enter image title");
                scanner.nextLine();
                String title = scanner.nextLine();

                System.out.println("Enter brightness image level");
                int brightness = scanner.nextInt();

                elements[i] = new Img(title, brightness);
                break;
              }
              case 2: {
                System.out.println("Enter audio title");
                scanner.nextLine();
                String title = scanner.nextLine();

                System.out.println("Enter audio volume level");
                int volume = scanner.nextInt();

                System.out.println("Enter audio duration");
                int duration = scanner.nextInt();

                elements[i] = new Audio(title, volume, duration);
                break;
              }
              case 3: {
                System.out.println("Enter video title");
                scanner.nextLine();
                String title = scanner.nextLine();

                System.out.println("Enter video volume level");
                int volume = scanner.nextInt();

                System.out.println("Enter brightness image level");
                int brightness = scanner.nextInt();

                System.out.println("Enter video duration");
                int duration = scanner.nextInt();

                elements[i] = new Video(title, volume, brightness, duration);
                break;
              }
              default:
                System.out.println("You have not entered one of the available commands, please enter one of these below, thanks!\n");

            }
          }

          if (Multimedia.isEmptyArray(elements)) {
            System.out.println("press 2 to play an item, 1 to create New list, 0 to exit");
          } else {
            System.out.println("1 to create New list, 0 to to confirm exit");
          }
          active = input.nextInt();
        }

      case 2:
        while (active == 2) {
          System.out.println("Choose an element to reproduce from 1 to 5");
          input.nextLine();
          int choice1 = input.nextInt();
          int control;

          switch (choice1) {
            case 1:
              Multimedia.playInstance(elements[0]);
              control = input.nextInt();
              Multimedia.setInstance(elements[0], control);
              break;
            case 2:
              Multimedia.playInstance(elements[1]);
              control = input.nextInt();
              Multimedia.setInstance(elements[1], control);
              break;
            case 3:
              Multimedia.playInstance(elements[2]);
              control = input.nextInt();
              Multimedia.setInstance(elements[2], control);
              break;
            case 4:
              Multimedia.playInstance(elements[3]);
              control = input.nextInt();
              Multimedia.setInstance(elements[3], control);
              break;
            case 5:
              Multimedia.playInstance(elements[4]);
              control = input.nextInt();
              Multimedia.setInstance(elements[4], control);
              break;
          }

          System.out.println("Enter 2 to continue, 1 to create New list, 0 to exit");
          input.nextLine();
          active = input.nextInt();
        }
      default:
        break;
    }

  }
}
