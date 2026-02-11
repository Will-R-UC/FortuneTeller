import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    Font font = new Font("Apple Chancery", Font.PLAIN, 36);
    final Color VERY_LIGHT_BLUE = new Color(237, 246, 249);
    final Color GREY = new Color(49, 54, 55);
    final Color OFF_WHITE = new Color(253, 254, 254);
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
        main.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(main);
        main.setBackground(VERY_LIGHT_BLUE);

        //top panel
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.setPreferredSize(new Dimension(0, 160));
        top.setOpaque(false);
        main.add(top, BorderLayout.NORTH);

        JLabel title = new JLabel("Fortune Teller", magicBallIcon, JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.BOTTOM);
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setFont(font);
        title.setForeground(GREY);
        top.add(title, BorderLayout.CENTER);

        //center panel
        JScrollPane center = new JScrollPane();
        main.add(center);

        JTextArea fortuneList = new JTextArea();
        fortuneList.setFont(font.deriveFont(22f));
        fortuneList.setBackground(OFF_WHITE);
        fortuneList.setEditable(false);
        center.setViewportView(fortuneList);

        //bottom panel
        JPanel bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(0,160));
        bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
        main.add(bottom, BorderLayout.SOUTH);

        JButton readFortuneButton = new JButton("Read My Fortune!");
        JButton quitButton = new JButton("Quit");

        bottom.add(readFortuneButton);
        bottom.setOpaque(false);
        bottom.add(quitButton);

    }
}