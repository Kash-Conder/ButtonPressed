import javax.swing.JFrame;

/**
 * Events handling
 *
 * @author Agatha Owora
 */
public class Main {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        JFrame frame = new WindowFrame();

        frame.setSize(700, 500);
        frame.setLocation(500, 100);
        frame.setTitle("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
