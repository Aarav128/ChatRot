import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.swing.JOptionPane;

public class MusicPlayer {
    public static void main(String[] args) {
      playSound("test.wav");
    }

    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream(url));
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
      }
}
