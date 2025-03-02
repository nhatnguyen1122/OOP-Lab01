import javax.swing.JOptionPane;

public class ChoosingOption_6_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);

        String choice = (option == JOptionPane.YES_OPTION) ? "Yes" : "No";
        JOptionPane.showMessageDialog(null, "You've chosen: " + choice);

        System.exit(0);
    }
}