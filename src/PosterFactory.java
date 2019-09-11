import javax.swing.*;

public class PosterFactory {

    public static void main(String[] args){

        int posterBought;
        int boxesFilled;
        int postersLeftOver;
        final int BOX_LIMIT = 11;
        String posterBoughtString;

        posterBoughtString = JOptionPane.showInputDialog(null, "How many posters orded today? ",
                "Order Dialog", JOptionPane.INFORMATION_MESSAGE);
        posterBought = Integer.parseInt(posterBoughtString);

        boxesFilled = posterBought / BOX_LIMIT;
        postersLeftOver = posterBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " +
                boxesFilled + " with " + postersLeftOver + " posters left over ");

    }
}
