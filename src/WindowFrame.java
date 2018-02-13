import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Component for displaying the canvas
 *
 * @author Agatha Owora
 */
public class WindowFrame extends JFrame {

    private final JButton buttonSouth;
    private final JTextField textFieldNorth;

    /**
     * Constructor for the WindowFrame
     */
    public WindowFrame() {
        // Creating GUI
        textFieldNorth = new JTextField();
        buttonSouth = new JButton("I am a button");

        // ContentPane's default layout manager: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(textFieldNorth, "North");
        contentPane.add(buttonSouth, "South");

        // Adding action listeners
        textFieldNorth.addActionListener(new TextListener());
        buttonSouth.addActionListener(new ButtonListener());
    }

    // Adding an event to someone pressing the enter key after inserting all their text 
    private class TextListener implements ActionListener {

        /**
         * Text listener
         *
         * @param e trigger
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String textTyped = textFieldNorth.getText();
            System.out.println("You typed in NORTH = " + textTyped);
        }
    }

    // Adding an event to the button pressed
    private class ButtonListener implements ActionListener {

        /**
         * Button listener
         *
         * @param e trigger
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("The button is pressed.");
        }
    }
}
