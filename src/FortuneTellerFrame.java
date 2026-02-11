import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    Font font = new Font("Apple Chancery", Font.PLAIN, 36);
    final Color GREY = new Color(49, 54, 55);
    final ImageIcon magicBall = new ImageIcon(getClass().getResource("/magicBall.png"));
    Image scaledMagicBall = magicBall.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
    ImageIcon magicBallIcon = new ImageIcon(scaledMagicBall);

    public FortuneTellerFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fortune Teller");
        setSize(800,600);
        setLocationRelativeTo(null);
        createGUI();
    }

    private void createGUI() {
        //main panel
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        add(main);
        main.setBackground(new Color(237, 246, 249));

        //top panel
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.setPreferredSize(new Dimension(800, 180));
        top.setOpaque(false);
        main.add(top, BorderLayout.NORTH);

        //title and icon
        JLabel title = new JLabel("Fortune Teller", magicBallIcon, JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.BOTTOM);
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setFont(font);
        title.setForeground(GREY);
        top.add(title, BorderLayout.CENTER);


    }
}