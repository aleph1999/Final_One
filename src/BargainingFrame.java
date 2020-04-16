import javax.swing.*;

public class BargainingFrame extends Page {

    private final JFrame bargaining_frame = new JFrame("Welcome to Bargaining with Khaled");
    private final ImagePanel bargaining_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/bargaining_window.jpg");

    public JFrame getBargaining_frame() {
        return bargaining_frame;
    }

    public JButton getBack() {
        return back;
    }

    JButton play_bargain_1 = new JButton("▶");
    JButton play_bargain_2 = new JButton("▶");
    JButton play_bargain_3 = new JButton("▶");
    JButton play_bargain_4 = new JButton("▶");
    JButton play_bargain_5 = new JButton("▶");
    JButton play_bargain_6 = new JButton("▶");

    JButton back = new JButton("Back");

    static String bargain_eng[] = {"How much?",
            "Is there a discount?",
            "Too expensive!",
            "I'm not interested/ No, thank you",
            "Do you have change?",
            "Where is the bank?"};

    static String bargain_arb[] = {"اشم هاظ",
//            "بدكاش تخفضلي شوي، جاز الله عليك اتخفضلي شوي،هو مفيش خصم؟ ",
            "بدكاش تخفضلي شوي، جاز الله عليك اتخفضلي شوي ",
            "وال! هاظ غالي كتير، شو صرقة هي؟",
            "شكرا سيدي خلص بديش",
            "معك فراطه",
            "بتعرف وين الصراف؟"};

    static String bargain_translation[] = {"Achim Haath",
            " Bid-kash tekh-sem-ly she-wai",
            "Waal! Haath gha-ly sh-theer. Shu ser-gah hee",
            "Shukran see-di. Khalas bid-deesh",
            "Mae-ik fra-tah",
            "Bi-tae-raf wayn il-sarraf"};

    static JList jList_eng_bargain = new JList(bargain_eng);
    static JList jList_arb_bargain = new JList(bargain_arb);
    static JList jlist_bargain_translation = new JList(bargain_translation);


    public void bargainingFrame() {
        customizeFrame(bargaining_frame,1032,685, bargaining_panel);

        addList(bargaining_frame, bargaining_panel, jList_eng_bargain, 50, 300);
        addList(bargaining_frame,bargaining_panel,jList_arb_bargain, 350, 300);
        addList(bargaining_frame,bargaining_panel,jlist_bargain_translation, 650,300);

        addButton(bargaining_frame, play_bargain_1,bargaining_panel,950,300,20,16);
        addButton(bargaining_frame, play_bargain_2,bargaining_panel,950,317,20,16);
        addButton(bargaining_frame, play_bargain_3, bargaining_panel,950,334,20,16);
        addButton(bargaining_frame, play_bargain_4,bargaining_panel,950,351,20,16);
        addButton(bargaining_frame, play_bargain_5,bargaining_panel,950,368,20,16);
        addButton(bargaining_frame, play_bargain_6,bargaining_panel,950,385,20,16);

        playButton(play_bargain_1, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_1.wav");
        playButton(play_bargain_2, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_2.wav");
        playButton(play_bargain_3, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_3.wav");
        playButton(play_bargain_4, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_4.wav");
        playButton(play_bargain_5, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_5.wav");
        playButton(play_bargain_6, "/Users/ryanmansour/KhaledProject/Bargaining/bargain_6.wav");

        addButton(bargaining_frame,back,bargaining_panel, 0,0,50,50);

        //addBackground(transit_frame, third,0,0,1372,772);
    }


}