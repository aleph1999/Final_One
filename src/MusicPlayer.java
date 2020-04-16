import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.io.InputStream;

public class MusicPlayer {

    public MusicPlayer(){

    }

    public static void playAudio(String musicLocation){
        try{
            File musicPath = new File(musicLocation);

            if (musicPath.exists()){

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();


                // JOptionPane.showMessageDialog(null,"Press Ok to stop playing");

            } else {
                System.out.println("Can't find file");
            }


        }

        catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void closeAudio(){

    }



}