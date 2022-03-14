import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame(){
//        GamePanel panel = new GamePanel();
//        this.add(panel); simplified --
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // take the componentes that we add to the frame
        this.setVisible(true);
        this.setLocation(null); //middle of screen
    }



}
