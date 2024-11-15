import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Main {
   
    static boolean validResponse = true;
    public static void main(String[] args) {
        while (true) {
          // loop
        }
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