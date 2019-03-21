import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        int i = 0;
//        do {
//            if (i % 2 == 0)
//            System.out.println(i);
//            i++;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            if (i % 5 == 0)
//                System.out.println(i);
//            i--;
//        } while (i >= -10);
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000000);

//        for(int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 ==0) {
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else
//                System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many iterations do you want?: ");
        int userInt = scanner.nextInt();
        int loopInt = userInt;
        System.out.println(" ");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

    UserLoop:
        for (int i = 1; true; i++) {
            System.out.printf("%-6s | %-7d | %d%n", i, i*i, i*i*i);

            while (i >= userInt) {
                System.out.println(" ");
                System.out.print("Continue? [y/n] ");
                String answer = scanner.next();
                System.out.println(" ");

                if (answer.equals("y")) {
                    System.out.println("number | squared | cubed");
                    System.out.println("------ | ------- | -----");
                    userInt += loopInt;
                    continue;
                }

                else if (answer.equals("n")) {
                    System.out.println("You're a nerd!");
                    break UserLoop;
                }

            }
        }


//            System.out.println("Continue? [y/n]");
//            String answer = scanner.next();
//        if (answer.equals("y")) {
//            do {
//                System.out.println(i + "      " + "|" + " " + (i * i) + "       " + "|" + " " + (i * i * i) + "   ");
//                i++;
//            } while (i <= (userInt*2));
//        }

//        System.out.print("Enter a numeric grade (0-100): ");
//        int grade = scanner.nextInt();
//        if (grade >= 88){
//            System.out.println("A");
//        } else if (grade >= 80 && grade < 88) {
//            System.out.println("B");
//        } else if (grade >= 67 && grade < 80) {
//            System.out.println("C");
//        } else if (grade >= 60 && grade < 67) {
//            System.out.println("D");
//        } else if (grade < 60) {
//            System.out.println("F");
//        }

    }


}

