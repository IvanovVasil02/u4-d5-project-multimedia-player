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

//    for(MultimediaElement element: elements){
//        if(element instanceof Audio || element instanceof Video){
//          ((Play) element).play();
//        }else {
//          ((Show) element).show();
//        }
//    }

//    System.out.println("Scegli elemento: ");
//    int choise = input.nextInt();

//    switch (choise){
//      case 1 :
//        Multimedia.checkInstance(elements[0]);
//        break;
//      case 2 :
//        Multimedia.checkInstance(elements[1]);
//        break;
//      case 3 :
//        Multimedia.checkInstance(elements[2]);
//        break;
//      case 4 :
//        Multimedia.checkInstance(elements[3]);
//        break;
//      case 5 :
//        Multimedia.checkInstance(elements[4]);
//        break;
//    }
    
    do {
      for (int i = 0; i < 5; i++) {
        System.out.println("Enter the " + (i + 1) + " element->");
        System.out.println("Enter 1 to insert image");
        System.out.println("Enter 2 to insert audio");
        System.out.println("Enter 3 to insert video");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

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
            System.out.println("Enter title");
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
            System.out.println("Enter title");
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
        }
      }
      break;

    } while (true);


  }


}
