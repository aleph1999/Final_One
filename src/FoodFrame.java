import javax.swing.*;

public class FoodFrame extends Page {

    private final JFrame food_frame = new JFrame("Welcome to Food with Khaled");
    private final ImagePanel food_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/food_window.jpg");

    // Food Page Buttons
    JButton play_food_1 = new JButton("▶");
    JButton play_food_2 = new JButton("▶");
    JButton play_food_3 = new JButton("▶");
    JButton play_food_4 = new JButton("▶");
    JButton play_food_5 = new JButton("▶");
    JButton play_food_6 = new JButton("▶");

    JButton back = new JButton("Back");

    public JButton getBack() {
        return back;
    }

    static String food_eng[] = {"Can I have?/I want to order",
            "Bottled water",
            "I'm allergic to",
            "Is it spicy?",
            "Where is the bathroom?",
            "Check, please"};

    static String food_arb[] = {"بقدر اطلب هسة؟",
            "هات قنية مي",
            "انا بتحسس من",
            "هاذ بيحرك كثير",
            "فين دورة المي؟",
            "جبلي الفاتورة، بدي ادفع لو اتكرمت"};

    static String food_translation[] = {"baqdar at-lab has-sah?",
            "hat qa-ney-eh ma-yeh",
            "anna bat-has-sas min",
            "haath beh-req ke-theer",
            "feyn door-ret il-ma-y",
            "geeb-li il-fa-too-rah, bid-di ad-fa' la-w tkera-mit"};

    static JList jList_eng_food = new JList(food_eng);
    static JList jList_arb_food = new JList(food_arb);
    static JList jlist_food_translation = new JList(food_translation);

    public JFrame getFood_frame() {
        return food_frame;
    }


    public void foodFrame() {
        customizeFrame(food_frame,1032,685, food_panel);

        addList(food_frame, food_panel, jList_eng_food, 50, 300);
        addList(food_frame,food_panel,jList_arb_food, 350, 300);
        addList(food_frame, food_panel, jlist_food_translation, 650, 300);

        addButton(food_frame, play_food_1,food_panel,950,300,20,16);
        addButton(food_frame, play_food_2,food_panel,950,317,20,16);
        addButton(food_frame, play_food_3,food_panel,950,334,20,16);
        addButton(food_frame, play_food_4,food_panel,950,351,20,16);
        addButton(food_frame, play_food_5,food_panel,950,368,20,16);
        addButton(food_frame, play_food_6,food_panel,950,385,20,16);

        playButton(play_food_1, "/Users/ryanmansour/KhaledProject/Food/food_1.wav");
        playButton(play_food_2, "/Users/ryanmansour/KhaledProject/Food/food_2.wav");
        playButton(play_food_3, "/Users/ryanmansour/KhaledProject/Food/food_3.wav");
        playButton(play_food_4, "/Users/ryanmansour/KhaledProject/Food/food_4.wav");
        playButton(play_food_5, "/Users/ryanmansour/KhaledProject/Food/food_5.wav");
        playButton(play_food_6, "/Users/ryanmansour/KhaledProject/Food/food_6.wav");

        addButton(food_frame,back,food_panel, 0,0,50,50);

        //addBackground(transit_frame, third,0,0,1372,772);

    }
}