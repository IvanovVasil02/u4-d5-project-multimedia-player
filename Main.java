import entities.*;

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


//    for(int i = 0; i < elements.length; i++){
//      Scanner input = new Scanner(System.in);
//
//      System.out.println("Inserisci titolo");
//      String title = input.nextLine();
//
//      System.out.println("Inserisci livello luminosità");
//      int brightness = input.nextInt();
//
//      elements[i] = new Img(title, brightness);
//    }

//    for(Multimedia element: elements){
//        Multimedia.checkInstance(element);
//    }


//    do{
//
//    } while (true);
  }



}
