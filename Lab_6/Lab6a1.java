import java.util.Scanner;

class Circle {

    double radius;

    public double area() {

        return Math.PI * radius * radius;
    }
}

public class Lab6a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("Enter radius : ");
        c1.radius = sc.nextDouble();

        System.out.println("Enter radius2 : ");
        c2.radius = sc.nextDouble();

        // double ans = c1.area(c1.radius);
        // System.out.println(ans);

        System.out.println(c1.area());
        System.out.println(c2.area());

        sc.close();

    }

}