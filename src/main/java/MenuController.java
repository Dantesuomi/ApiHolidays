import javax.swing.*;

public class MenuController {

    //NOT USED!!!!!!!!!

    public static void optionMenu(){

        String message = "Choose a month to get information about holidays in the UK!";
        String title = "Hello";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String input = (String) JOptionPane.showInputDialog(null, "",
                "Choose a month", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                months, // Array of choices
                months[1]); // Initial choice
        System.out.println(input);

        if (input.equalsIgnoreCase("March")) {
            JOptionPane.showMessageDialog(null, "Holiday", "gggg", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Not a holiday month");
        }
    }


}
