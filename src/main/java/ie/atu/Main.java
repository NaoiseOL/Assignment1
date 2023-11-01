//Naoise O'Loughlin
//Group B
package ie.atu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();//created new student through a constructor in the student class

        student1.setStudentName();//uses these three setters to set student information
        student1.setStudentEmail();
        student1.setStudentCourse();

        Scanner scanner = new Scanner(System.in);//scanner createdu to intake name to be used in decleration of constructor
        System.out.println("Please enter full name: ");
        String name1 = scanner.nextLine();//scanner that intakes user input

        Student student2 = new Student(name1);//created new student2 including the name taken in the scanner
        student2.setStudentEmail();//uses setters to set rest of info through prompts
        student2.setStudentCourse();

        System.out.println("Please enter full name: ");//using String based prompts with scanners to allow user to input information for student 3
        String name2 = scanner.nextLine();
        System.out.println("Please enter email: ");
        String email = scanner.nextLine();
        System.out.println("Please enter course: ");
        String course = scanner.nextLine();

        Student student3 = new Student(name2,email,course);//Student constructor created with all information given within above Strings and scanners


        student1.displayInfo();//using a displayInfo function that consists of getters to show student information
        student2.displayInfo();
        student3.displayInfo();

    }
}