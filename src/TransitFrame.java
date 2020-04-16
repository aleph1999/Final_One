import javax.swing.*;

public class TransitFrame extends Page {

    // Language Frame
    private final JFrame transit_frame = new JFrame("Welcome to Transit with Khaled");
    private final ImagePanel transit_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/transit_window.jpg");

    // Transport Page Buttons
    JButton play_tr_1 = new JButton("▶");
    JButton play_tr_2 = new JButton("▶");
    JButton play_tr_3 = new JButton("▶");
    JButton play_tr_4 = new JButton("▶");
    JButton play_tr_5 = new JButton("▶");
    JButton play_tr_6 = new JButton("▶");

    JButton back = new JButton("Back");

    public JFrame getTransit_frame() {
        return transit_frame;
    }


    static String transit_eng[] = {"Left. Right. Straight. Back. Turn Around",
            "How long? (Duration) ",
            "What time does it leave",
            "How far?",
            "Im going to",
            "Wheres the airport/bus/train?"};

    static String transit_arb[] = {"شمال/ يمين/ دغري/ ورا/لف و ارجع",
            "مطولين احنا؟ قربنا؟",
            "متى حنتحرك/ متى ماشيين؟",
            "هو بعيد المكان؟",
            "انا رايح غاد" ,
            "فين طريق المطار؟ السرفيس؟ الباص؟ القطار؟"};

    static String transit_translation[] = { "shmal, yameen, do-ghri, warah, lif o' er-ja'h",
            "mtaw-leen eh-nah? qar-rab-nah?",
            "matah ha-nit-har-rak? matah mash-yeen?",
            "who-weh, be'ed il-ma-kaa",
            "anna ra-yeh ghad",
            "feyn ta-reeq il-ma-tar?il-ser-vees/il-baas/qi-tar"};


    static JList jList_eng_tr = new JList(transit_eng);
    static JList jList_arb_tr = new JList(transit_arb);
    static JList jList_transit_translation = new JList(transit_translation);

    public JButton getBack() {
        return back;
    }

    public TransitFrame(){

    }

    public void transitFrame() {
        customizeFrame(transit_frame,1032,685,transit_panel);

        addList(transit_frame, transit_panel, jList_eng_tr, 50, 300);
        addList(transit_frame,transit_panel,jList_arb_tr, 350, 300);
        addList(transit_frame,transit_panel,jList_transit_translation, 650,300);

        addButton(transit_frame, play_tr_1,transit_panel,950,300,20,16);
        addButton(transit_frame, play_tr_2,transit_panel,950,317,20,16);
        addButton(transit_frame, play_tr_3,transit_panel,950,334,20,16);
        addButton(transit_frame, play_tr_4,transit_panel,950,351,20,16);
        addButton(transit_frame, play_tr_5,transit_panel,950,368,20,16);
        addButton(transit_frame, play_tr_6,transit_panel,950,385,20,16);

        playButton(play_tr_1, "/Users/ryanmansour/KhaledProject/Transit/transit_1.wav");
        playButton(play_tr_2, "/Users/ryanmansour/KhaledProject/Transit/transit_2.wav");
        playButton(play_tr_3, "/Users/ryanmansour/KhaledProject/Transit/transit_3.wav");
        playButton(play_tr_4, "/Users/ryanmansour/KhaledProject/Transit/transit_4.wav");
        playButton(play_tr_5, "/Users/ryanmansour/KhaledProject/Transit/transit_5.wav");
        playButton(play_tr_6, "/Users/ryanmansour/KhaledProject/Transit/transit_6.wav");

        addButton(transit_frame,back,transit_panel, 0,0,50,50);

        // addBackground(transit_frame, transit_panel,third,0,0,1372,772);
        // addLabel(transit_frame, bargainingLabel);
    }


}
