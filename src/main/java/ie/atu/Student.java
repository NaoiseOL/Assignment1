package ie.atu;
import java.util.Scanner;
public class Student {
    private String name;
    private String email;
    private String course;


    public Student(){//Basic Student constructor with no parameters or variables declared with it
        this.name = getStudentName();//uses getters and setters for student information through prompts
        this.email = getStudentEmail();
        this.course =getStudentCourse();
    }

    public Student(String name){//second constructor that intakes name of student, rest of info is taken through getters connected to setters
        this.name=name;
        this.email=getStudentEmail();
        this.course=getStudentCourse();
    }

    public Student(String name, String email, String course){//third constructor that intakes all info form prompts in main when being created
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void setStudentName(){//setter using scanner to intake student name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name");
        this.name = scanner.nextLine();
    }

    public String getStudentName(){//getter to return student name

        return name;
    }

    public void setStudentEmail(){//setter using scanners to intake student email
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email");
        this.email = scanner.nextLine();
    }

    public String getStudentEmail(){
        return email;
    }//getter to return student email

    public void setStudentCourse(){//setter using scanner to intake student course
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Course");
        this.course = scanner.nextLine();
    }

    public String getStudentCourse() {
        return course;
    }//getter to return student course

    public void displayInfo(){//display Info function to show information of students
        System.out.println("---------------------------------------------");
        System.out.println("Name: "+ name +"\nEmail: "+email + "\nCourse: "+course);
        System.out.println("---------------------------------------------");

    }
}
