import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main(Gameplay gameplay) {
        setTitle("Tanks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 800, 630);
        setResizable(false);
        setBackground(Color.black);
        add(gameplay);
        setVisible(true);
    }

    public static void main(String[] args) {
        Gameplay gamePlay = new Gameplay();
        Main main = new Main(gamePlay);
    }
}
