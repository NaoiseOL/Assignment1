package ie.atu;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Naoise");

        student1.setStudentName();
        student1.setStudentEmail();
        student1.setStudentCourse();

        student2.setStudentEmail();
        student2.setStudentCourse();

        student1.displayInfo();
        student2.displayInfo();

    }
}