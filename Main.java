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

    static void getResponse() { // take user input
        
    }
}
