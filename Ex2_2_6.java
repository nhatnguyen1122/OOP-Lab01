import java.util.Scanner;

public class Ex2_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. Linear equation with one variable");
        System.out.println("2. System of linear equations with two variables");
        System.out.println("3. Quadratic equation with one variable");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(sc);
                break;
            case 2:
                solveLinearSystem(sc);
                break;
            case 3:
                solveQuadraticEquation(sc);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

    private static void solveLinearEquation(Scanner sc) {
        System.out.println("Solving linear equation: ax + b = 0");
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitely many solutions.");
            } 
            else {
                System.out.println("No solution.");
            }
        } 
        else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }
    
    private static void solveLinearSystem(Scanner sc) {
        System.out.println("Solving system of linear equations:");
        System.out.println("a11 x1 + a12 x2 = b1");
        System.out.println("a21 x1 + a22 x2 = b2");
        System.out.print("Enter a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
        else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinitely many solutions");
            }
            else {
                System.out.println("No solution");
            }
        }
    }

    private static void solveQuadraticEquation(Scanner sc) {
        System.out.println("Solving quadratic equation: ax^2 + bx + c = 0");
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("One double root: x = " + x);
        }
        else {
            System.out.println("No real roots");
        }
    }
}