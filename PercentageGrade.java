import java.util.*;

class PercentageGrade {
    public static void main(String[] args) {
        float m, j, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths");
        m = sc.nextFloat();
        System.out.println("Enter the marks of Java");
        j = sc.nextFloat();
        System.out.println("Enter the marks of DBMS");
        d = sc.nextFloat();

        if (m > 500 || j > 500 || d > 500) {
            System.out.println("Please Enter valid marks");
            sc.close(); 
            return; 
        }

        float p1 = (m / 500) * 100;
        float p2 = (j / 500) * 100;
        float p3 = (d / 500) * 100;

        System.out.println("The percentage of Maths: " + p1);
        System.out.println("The percentage of Java: " + p2);
        System.out.println("The percentage of DBMS: " + p3);

        
        System.out.print("Maths Grade: ");
        if (p1 >= 90) {
            System.out.println("A");
        } else if (p1 >= 80) {
            System.out.println("B");
        } else if (p1 >= 70) {
            System.out.println("C");
        } else if (p1 >= 60) {
            System.out.println("D");
        } else if (p1 >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        
        System.out.print("Java Grade: ");
        if (p2 >= 90) {
            System.out.println("A");
        } else if (p2 >= 80) {
            System.out.println("B");
        } else if (p2 >= 70) {
            System.out.println("C");
        } else if (p2 >= 60) {
            System.out.println("D");
        } else if (p2 >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        
        System.out.print("DBMS Grade: ");
        if (p3 >= 90) {
            System.out.println("A");
        } else if (p3 >= 80) {
            System.out.println("B");
        } else if (p3 >= 70) {
            System.out.println("C");
        } else if (p3 >= 60) {
            System.out.println("D");
        } else if (p3 >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        sc.close(); 
    }
}
