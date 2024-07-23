import java.util.Scanner;

public class marks{
    static int n; 
    static int[][] marks;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        n = scanner.nextInt();
        marks = new int[n][3];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add student marks");
            System.out.println("2. Update student mark");
            System.out.println("3. Get the average for a subject");
            System.out.println("4. Get the average for a student");
            System.out.println("5. Get the total mark of a student");
            System.out.println("6. Display grades for all students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudentMarks(scanner);
                    break;
                case 2:
                    updateStudentMark(scanner);
                    break;
                case 3:
                    getSubjectAverage(scanner);
                    break;
                case 4:
                    getStudentAverage(scanner);
                    break;
                case 5:
                    getStudentTotal(scanner);
                    break;
                case 6:
                    displayGrades();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

      

        
