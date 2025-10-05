import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter one of the option");
        System.out.println("1.\n2.\n3.\n4.");
        int option = input.nextInt();
       if (option<1 || option>4){
           do {
               System.out.println("Invalid! Enter again:");
               option = input.nextInt();

           }while (option<1 || option>4);
       }

    }
}