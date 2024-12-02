import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MusicPlayer {
    Clip clip;
    public MusicPlayer() {
      System.out.println("We even have music!");
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
