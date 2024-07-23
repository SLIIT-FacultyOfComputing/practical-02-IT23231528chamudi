  import java.util.Scanner;

public class q1{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter your first name: ");
      String first = scanner.nextLine();
      
      System.out.print("Enter your last name: ");
      String last = scanner.nextLine();
      
      System.out.print("Enter your middle name: ");
      String middle = scanner.nextLine();
      
      System.out.println("your name is " +last + first + middle);
   }
}

