import javax.print.attribute.standard.JobHoldUntil;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.swing.JOptionPane;

public class MusicPlayer {
    Clip clip;
    public static void main(String[] args) {
      new MusicPlayer().playSound("bird_caw2.wav");
      // JOptionPane.showMessageDialog(null, "press ok to stop playing");
    }

    public void stopSound() {
      clip.stop();
    }

    public void playSound(String url) {
      try {
        File musicPath = new File(url);
        if(musicPath.exists()) {
          AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
          clip = AudioSystem.getClip();
          clip.open(audioInput);
          clip.start();
        } else {
          System.out.println("oof");
        }
      } catch (Exception e){
        System.out.println(e);
      }
    }
}
