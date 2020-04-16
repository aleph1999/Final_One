import javax.swing.*;

public class ControlFrame extends Page {

    private final JFrame control_frame = new JFrame("Kindly choose a lesson");
    private final ImagePanel control_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/control_window.jpg");

    final JButton transit = new JButton("Language Phrases to Know in Transit");
    final JButton food = new JButton("Dining Phrases that Make or Break Your Restaurant Experience Overseas ");
    final JButton bargain = new JButton("Shopping Questions that you must know");
    final JButton linguistic = new JButton("Linguistic Exploration");

    public JFrame getControl_frame() {
        return control_frame;
    }

    public JButton getTransit() {
        return transit;
    }

    public JButton getFood() {
        return food;
    }

    public JButton getBargain() {
        return bargain;
    }

    public JButton getLinguistic() {
        return linguistic;
    }

    public ControlFrame() {

    }

    public void controlFrame() {
        customizeFrame(control_frame, 1600, 1067, control_panel);

        addButton(control_frame, transit, control_panel, 400, 200, 500, 100);
        addButton(control_frame, food, control_panel, 400, 300, 500, 100);
        addButton(control_frame, bargain, control_panel, 400, 400, 500, 100);
        addButton(control_frame, linguistic, control_panel, 400, 500, 500, 100);
    }

}

