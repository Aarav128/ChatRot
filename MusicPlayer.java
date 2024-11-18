import javax.print.attribute.standard.JobHoldUntil;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.swing.JOptionPane;

public class MusicPlayer {
    public static void main(String[] args) {
      playSound("bird_caw2.wav");
      // JOptionPane.showMessageDialog(null, "press ok to stop playing");
    }

    public static void playSound(String url) {
      try {
        File musicPath = new File(url);
        if(musicPath.exists()) {
          AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
          Clip clip = AudioSystem.getClip();
          clip.open(audioInput);
          clip.start();
          JOptionPane.showMessageDialog(null, "press ok to stop playing");
          clip.stop();
        } else {
          System.out.println("oof");
        }
      } catch (Exception e){
        System.out.println(e);
      }
    }
}
