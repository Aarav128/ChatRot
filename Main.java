import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Main {
    private enum ChatbotState {
        HELP, ERROR, MAINMENU, MUSICPLAYER, QUIT
    }

    private enum HelpState {
        MAINMENU, MUSICPLAYER
    }
    private enum ErrorState {
        MAINMENU, MUSICPLAYER
    }
    private static ChatbotState state;
    private static HelpState helpState;
    private static ErrorState errorState;
    static boolean validResponse = true;
    public static void main(String[] args) {
        state = ChatbotState.MAINMENU;
        while (state != ChatbotState.QUIT) {
            botOutput();
        }
    }

    static void botOutput() {
        switch (state) {
            case ChatbotState.QUIT:
                System.out.println("Have a great day!");
                break;
            case ChatbotState.MAINMENU:
                System.out.println("Welcome to the UNTHEMED Chatbot");
                System.out.println("How can I help you today?");
                getResponse();
                break;
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


    static void getResponse() { // take user input
        
    }
}