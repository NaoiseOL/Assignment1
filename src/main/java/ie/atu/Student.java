package ie.atu;
import java.util.Scanner;
public class Student {
    private String name;
    private String email;
    private String course;


    public Student(){
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public Student(String name){
        this.name=name;
        this.email=getStudentemail();
        this.course=getStudentcourse();
    }

    public void setStudentName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name");
        this.name = scanner.nextLine();
    }

    public String getStudentName(){

        return name;
    }

    public void setStudentEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email");
        this.email = scanner.nextLine();
    }

    public String getStudentemail(){

        return email;
    }

    public void setStudentCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Course");
        this.course = scanner.nextLine();
    }

    public String getStudentcourse() {

        return course;
    }

    public void displayInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: "+ name +"\nEmail: "+email + "\nCourse: "+course);
        System.out.println("---------------------------------------------");

    }
}
