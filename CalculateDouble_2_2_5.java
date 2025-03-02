import javax.swing.*;
public class CalculateDouble_2_2_5 {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(
                null,
                "Please input the first number: ",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE
        );

        strNum2 = JOptionPane.showInputDialog(
                null,
                "Please input the second number: ",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE
        );
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        JOptionPane.showMessageDialog(
                null,
                "The sum of the two numbers is: " + sum + "\n" +
                "The difference of the two numbers is: " + difference + "\n" +
                "The product of the two numbers is: " + product + "\n" +
                "The quotient of the two numbers is: " + quotient,
                "Results",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }
}