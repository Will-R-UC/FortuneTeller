import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    Font titleFont = new Font("Apple Chancery", Font.PLAIN, 36);
    Font listFont = new Font("Sans Serif", Font.PLAIN, 20);
    Font buttonFont = new Font("JetBrains Mono", Font.PLAIN, 16);
    final Color VERY_LIGHT_BLUE = new Color(237, 246, 249);
    final Color GREY = new Color(49, 54, 55);
    final Color OFF_WHITE = new Color(253, 254, 254);
    final ImageIcon magicBall = new ImageIcon(getClass().getResource("/magicBall.png"));
    Image scaledMagicBall = magicBall.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
    ImageIcon magicBallIcon = new ImageIcon(scaledMagicBall);

    public FortuneTellerFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adjustSelf();
        createGUI();
    }

    private void adjustSelf() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
        setLocation(screenWidth / 8, screenHeight / 8);

        setTitle("Fortune Teller");
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
        title.setFont(titleFont);
        title.setForeground(GREY);
        top.add(title, BorderLayout.CENTER);

        //center panel
        JScrollPane center = new JScrollPane();
        main.add(center);

        JTextArea fortuneList = new JTextArea();
        fortuneList.setFont(listFont);
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

        readFortuneButton.setPreferredSize(new Dimension(200, 80));
        quitButton.setPreferredSize(new Dimension(100, 80));

        readFortuneButton.setFont(buttonFont);
        quitButton.setFont(buttonFont);

        readFortuneButton.setBackground(OFF_WHITE);
        quitButton.setBackground(OFF_WHITE);

        final ReadFortuneAction readFortuneAction = new ReadFortuneAction(fortuneList);
        readFortuneButton.addActionListener(readFortuneAction);
        final QuitAction quitAction = new QuitAction();
        quitButton.addActionListener(quitAction);

        bottom.add(readFortuneButton);
        bottom.setOpaque(false);
        bottom.add(quitButton);

    }
}