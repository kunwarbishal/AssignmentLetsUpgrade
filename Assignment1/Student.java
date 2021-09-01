import java.util.Scanner;

public class Student {
    int roll;
    String name;
    float marks;

    public void input() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter name of student:");
          name = scan.nextLine();
          System.out.println("Enter roll no:");
          roll   = scan.nextInt();
          System.out.println("Enter total marks:");
          marks=scan.nextFloat(); 
    }

    public void display() {
        System.out.println("Details of students::");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("Total marks: " + marks);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.display();
        
    }
}
