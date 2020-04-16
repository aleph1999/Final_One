import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public abstract class Page {

    MusicPlayer musicPlayer = new MusicPlayer();

    public void setup(int width, int height, JFrame fr, JPanel jPanel){

        fr.setSize(width, height);
        fr.setLocation(300,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(jPanel);

        //fr.getContentPane().add(BorderLayout.CENTER, jt);
    }

    public void addBackground(JFrame fr, JPanel panel, ImageIcon img,int x, int y, int width, int height){

        JLabel background = new JLabel("",img, JLabel.CENTER);
        background.setBounds(x,y,width,height);
        background.setOpaque(true);
        fr.add(background);
    }



    public void addButton(JFrame frame, JButton button, JPanel jPanel, int loc_x, int loc_y, int height, int width){
        jPanel.setLayout(null);
        button.setBounds(loc_x,loc_y,height,width);
        // frame.getContentPane().add(button);
        jPanel.add(button);

    }

    public void addButton(JFrame frame, JButton button, String location){ ;
        frame.getContentPane().add(button,location);
    }

    public void addLabel(JPanel panel,JLabel label, int loc_x, int loc_y, int height, int width){
        panel.setLayout(null);
        panel.setBounds(loc_x,loc_y,height, width);
        panel.add(label);
        label.setVisible(true);
    }


    public void addList(JFrame frame, JPanel panel, JList list, int x, int y){
        panel.setLayout(null);
        list.setBounds(x,y,300,100);
        panel.add(list);
    }

    public void addListSpecial(JFrame frame, JPanel panel, JList list, int x, int y){
        panel.setLayout(null);
        list.setBounds(x,y,200,100);
        panel.add(list);
    }

    public void addList3(JFrame frame, JPanel panel, JList list, int x, int y){
        panel.setLayout(null);
        list.setBounds(x,y,1300,150);
        panel.add(list);
    }
    public void addList30(JFrame frame, JPanel panel, JList list, int x, int y){
        panel.setLayout(null);
        list.setBounds(x,y,1300,100);
        panel.add(list);
    }

    public void addList40(JFrame frame, JPanel panel, JList list, int x, int y){
        panel.setLayout(null);
        list.setBounds(x,y,1300,220);
        panel.add(list);
    }

    public void customizeFrame(JFrame frame, int width, int height, JPanel panel) {
        // Setup window
        setup(width,height,frame,panel);
    }
    public void playButton(JButton button, String musicLocation) {
        button.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                musicPlayer.playAudio(musicLocation);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }



    public void frameSwitcher(JFrame current, JFrame next){

        current.setVisible(false);
        next.setVisible(true);

    }



}