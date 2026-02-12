import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ReadFortuneAction implements ActionListener {
    final Random rand = new Random();
    int index = -1;

    final String[] fortunes = {
            "You will be attacked by a flock of birds on your way home soon.",
            "You will stub your toe in the next 5 hours when you least expect it.",
            "A stranger will cause a mild inconvenience to you in the near future.",
            "You will make a new friend out of a person you originally thought was quite annoying.",
            "A person who you love or mildly like will become rich and famous.",
            "You will find a $20 bill lying on the ground, but the wind will carry it out of your reach.",
            "A person will in the near future tell you a joke which you find funny, but not funny enough to laugh.",
            "An awkward situation will arise when you forget something at home. This will occur very soon.",
            "Repeated stress will wear you down, but you'll find something incredible to take solace in.",
            "You will be hit by a baseball or some other flying object, but will not be able to figure out where it came from.",
            "You will consider stealing a car, but ultimately come to your senses and dismiss the thought as a fantasy.",
            "You will, for a fleeting moment in the near future, find joy in something extremely unexpected.",
    };


    private final JTextArea fortuneList;

    public ReadFortuneAction(JTextArea fortuneList) {
        this.fortuneList = fortuneList;
    }

    public void actionPerformed(ActionEvent ae) {
        int lastIndex = index;
        do {
            index = rand.nextInt(12);
        } while (index == lastIndex);

        fortuneList.append(fortunes[index] + "\n");
    }
}
