import javax.swing.SwingUtilities;

public class FortuneTellerViewer {
    static void main() {
        SwingUtilities.invokeLater(() -> {
            FortuneTellerFrame window = new FortuneTellerFrame();
            window.setVisible(true);
        });
    }
}