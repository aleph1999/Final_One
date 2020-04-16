import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class WelcomePage extends Page implements ActionListener {

    // FRAMES
    // Main Frame
    private static final JFrame main_frame = new JFrame("Khalid's Cultural Assistant");
    private static final JPanel main_panel = new JPanel();
    private static final ImageIcon main_background = new ImageIcon("/Users/ryanmansour/KhaledProject/Backgrounds/main_window.jpeg");

    // Control Frame
    private static final ControlFrame control_frame = new ControlFrame();

    // Transit, Food, Bargaining, Linguistic Frames
    private static final TransitFrame transit_frame = new TransitFrame();
    private static final FoodFrame food_frame = new FoodFrame();
    private static final BargainingFrame bargaining_frame = new BargainingFrame();
    private static final LinguisticExploration linguistic_frame = new LinguisticExploration();

    private static final Lesson lesson_frame_1 = new Lesson();
    private static final Lesson lesson_frame_2 = new Lesson();



    // BUTTONS
    // Main Page Buttons
    final JButton main_begin = new JButton("Begin your learning experience");
    // Control Page Buttons
    final JButton transit = control_frame.getTransit();
    final JButton food = control_frame.getFood();
    final JButton bargain = control_frame.getBargain();
    final JButton lingusitic = control_frame.getLinguistic();




    public WelcomePage(){
        welcomeFrame();

        // todo: Add music, only play when on first page
        musicPlayer.playAudio("/Users/ryanmansour/KhaledProject/Audio/bedouin2.wav");

        main_begin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                control_frame.controlFrame();

                transit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        transit_frame.transitFrame();

                        frameSwitcher(control_frame.getControl_frame(), transit_frame.getTransit_frame());

                        // goBack when pressed
                        backButton(transit_frame.getBack(), transit_frame.getTransit_frame(), control_frame.getControl_frame());

                    }
                });

                food.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        food_frame.foodFrame();

                        frameSwitcher(control_frame.getControl_frame(), food_frame.getFood_frame());

                        backButton(food_frame.getBack(), food_frame.getFood_frame(), control_frame.getControl_frame());

                    }
                });

                bargain.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        bargaining_frame.bargainingFrame();

                        frameSwitcher(control_frame.getControl_frame(), bargaining_frame.getBargaining_frame());

                        backButton(bargaining_frame.getBack(), bargaining_frame.getBargaining_frame(), control_frame.getControl_frame());


                    }
                });

                lingusitic.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        linguistic_frame.linguisticExploration();

                        frameSwitcher(control_frame.getControl_frame(), linguistic_frame.getLinguistic_frame());

                        backButton(linguistic_frame.getBack(), linguistic_frame.getLinguistic_frame(), control_frame.getControl_frame());

                        lesson1_pressed();

                        lesson2_pressed();

                    }
                });


                frameSwitcher(main_frame, control_frame.getControl_frame());


            }
        });


        main_frame.setVisible(true);


    }

    private void lesson1_pressed() {
        linguistic_frame.getLesson1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lesson_frame_1.lesson1();

                frameSwitcher(linguistic_frame.getLinguistic_frame(), lesson_frame_1.getLesson_frame());

                backButton(lesson_frame_1.getBack(), lesson_frame_1.getLesson_frame(), linguistic_frame.getLinguistic_frame());

            }
        });
    }

    private void lesson2_pressed() {
        linguistic_frame.getLesson2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lesson_frame_2.lesson2();

                frameSwitcher(linguistic_frame.getLinguistic_frame(), lesson_frame_2.getLesson_frame());

                backButton(lesson_frame_2.getBack(), lesson_frame_2.getLesson_frame(), linguistic_frame.getLinguistic_frame());


            }
        });
    }

    private void backButton(JButton back, JFrame current, JFrame previous) {
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameSwitcher(current, previous);
            }
        });
    }


    private void welcomeFrame() {
        customizeFrame(main_frame, 600,900, main_panel);
        addButton(main_frame, main_begin,BorderLayout.SOUTH);
        //addButton(main_frame, main_begin, main_panel,100,100,100,100);
        addBackground(main_frame,main_panel,main_background,0,0, 600, 900);
    }




    @Override
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        new WelcomePage();





    }

}
