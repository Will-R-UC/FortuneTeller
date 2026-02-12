import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadFortuneAction implements ActionListener {
    private final JTextArea fortuneList;

    public ReadFortuneAction(JTextArea fortuneList) {
        this.fortuneList = fortuneList;
    }

    public void actionPerformed(ActionEvent ae) {
        fortuneList.append("just a test...\n");
    }
}
