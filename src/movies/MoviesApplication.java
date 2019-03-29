package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {


            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                System.out.println(movie.getName());
            }
//
//            System.out.printf("What would you like to do?%n" +
//                    "0 - exit%n" +
//                    "1 - view all movies%n" +
//                    "2 - view movies in the animated category%n" +
//                    "3 - view movies in the drama category%n" +
//                    "4 - view movies in the horror category%n" +
//                    "5 - view movies in the sci-fi category %n" +
//                    "Enter your choice: ");
//
//            Scanner sc = new Scanner(System.in);
//            int choice = sc.nextInt();
//
//
//
//            }

    }
}
