import javax.swing.*;

public class LinguisticExploration extends Page {

    private final JFrame linguistic_frame = new JFrame("Welcome to Linguistics with Khaled");
    private final ImagePanel linguistic_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/linguistic_window.jpg");

    JButton back = new JButton("Back");
    JButton lesson1 = new JButton("Lesson 1: General Arabic Grammar");
    JButton lesson2 = new JButton("Lesson 2: Sentence Breakdown");
    JButton lesson3 = new JButton("Lesson 3: Word order of bedouin Arabic");


    public LinguisticExploration(){

    }

    public JFrame getLinguistic_frame() {
        return linguistic_frame;
    }

    public ImagePanel getLinguistic_panel() {
        return linguistic_panel;
    }

    public JButton getBack() {
        return back;
    }

    public JButton getLesson1() {
        return lesson1;
    }

    public JButton getLesson2() {
        return lesson2;
    }

    public JButton getLesson3() {
        return lesson3;
    }

    public void linguisticExploration(){
        customizeFrame(linguistic_frame,820,685, linguistic_panel);

        addButton(linguistic_frame, lesson1,linguistic_panel,200,250,500,100);
        addButton(linguistic_frame,lesson2,linguistic_panel,200,350,500,100);
        addButton(linguistic_frame,lesson3,linguistic_panel,200,450,500,100);
        addButton(linguistic_frame,back,linguistic_panel, 0,0,50,50);


    }
}