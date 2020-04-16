import javax.swing.*;

public class Lesson extends Page {

    private final JFrame lesson_frame = new JFrame("Welcome to your Lesson with Khaled");
    private final ImagePanel lesson_panel = new ImagePanel("/Users/ryanmansour/KhaledProject/Backgrounds/lesson_window.jpg");
    // private final ImagePanel lesson_panel = new ImagePanel(null);

    JButton back = new JButton("Back");

    // LESSON 1

    JLabel first_title = new JLabel("PRONOUNS WITH PREPOSITION");
    JLabel second_title = new JLabel("PERSONAL PRONOUNS");
    JLabel third_title = new JLabel("ENCLITIC PRONOUNS");

    // 1) PROUNOUNS WITH PREPOSITION LIST

    static String meaning[] = {"MEANING", " 'to', indirect object", "'in', 'with', 'by' ", " 'in' ",
            " 'to' ", " 'on' ", " 'with' ", " 'from' ", " 'on', 'about' "};

    static String independent[] = {"INDEPENDENT FORM", "li / ل", "bi, / ب", "fi / في", " الي/ ila",
            "ala / على", "ma'a / مع", "min / من", "'an / عن"};

    static String with_me[] = { "WITH...'ME'", "li / لي ", "bi /   بي ", "fiya / في ", "ilayya /   الي ",
            "'alayya /  علي ", "ma'i /  معي ", "minni / مني ", "'anni /  عني"};

    static String with_you[] = {"WITH... 'YOU'", "laka / لك ", "bika / لك ", "fika /  فيك ", "ilayka / اليك ",
            "alayka /  عليك ", "ma'aka / معك ", "minka /  منك ", "'anka /  عتك "};

    static String with_him[] = {"WITH... 'HIM'" ,"lahu / له  ", "bihi / به  ", "fihi / فيه ", "ilayhi / اليه ",
            "alayhi / عليه  ", "ma'ahu /  معه ", "min'hu / منه ", "'anhu' /  عنه "};

    static JList meaning_jList = new JList(meaning);
    static JList independent_jList = new JList(independent);
    static JList withMe_jList = new JList(with_me);
    static JList withYou_jList = new JList(with_you);
    static JList withHim_jList = new JList(with_him);

    private void prepositionPronounListBuilder() {

        addList(lesson_frame, lesson_panel, meaning_jList, 0, 100);
        addList(lesson_frame,lesson_panel,independent_jList, 300, 100);
        addList(lesson_frame,lesson_panel,withMe_jList, 600,100);
        addListSpecial(lesson_frame,lesson_panel,withYou_jList, 900,100);
        addListSpecial(lesson_frame,lesson_panel,withHim_jList, 1100,100);
    }

    // 2) PERSONAL PRONOUNS


    static String person[] = {"PERSON", "1st", "2nd (Masculine)", "2nd (Feminine)", "3rd (Masculine)", "3rd (Feminine)"};
    static String singular[] ={"SINGULAR", "ana / انا", "anta / انت", "anti / انت", "huwa / هو", "hiya / هي"};
    static String dual[] = {"DUAL", "nahnu / نحن", "antuma / انتما", "antuma / انتما", "huma / هما",  "huma / هما"};
    static String plural[] = {"PLURAL", "nahnu / نحن", "antum / اتتم", "antunna / انتن", "hum / هم", "hunna / هن"};

    static JList person_jList = new JList(person);
    static JList singular_jList = new JList(singular);
    static JList dual_jList = new JList(dual);
    static JList plural_jList = new JList(plural);

    private void personalPronounListBuilder(){
        addList(lesson_frame, lesson_panel, person_jList, 0, 300);
        addList(lesson_frame,lesson_panel,singular_jList, 300, 300);
        addList(lesson_frame,lesson_panel,dual_jList, 600,300);
        addList(lesson_frame,lesson_panel,plural_jList, 900,300);

    }


    // 3) ENCLITIC PRONOUNS
    static String person_[] = {"PERSON", "1st", "2nd (Masculine)", "2nd (Feminine)", "3rd (Masculine)", "3rd (Feminine)"};
    static String singular_[] ={"SINGULAR","", "ka / ك", "ki / ك", "hu / ه", "ha / ها"};
    static String dual_[] = {"DUAL", "na / نا", "kuma / كما", "kuma / كما", "huma / هما", "hima / هما"};
    static String plural_[] = {"PLURAL", "na / نا ", "kum / كم", "kunna / كن", "hum / هم", "hunna / هن"};

    static JList person__jList = new JList(person_);
    static JList singular__jList = new JList(singular_);
    static JList dual__jList = new JList(dual_);
    static JList plural__jList = new JList(plural_);

    private void encliticPronounsListBuilder(){
        addList(lesson_frame, lesson_panel, person__jList, 0, 500);
        addList(lesson_frame,lesson_panel,singular__jList, 300, 500);
        addList(lesson_frame,lesson_panel,dual__jList, 600,500);
        addList(lesson_frame,lesson_panel,plural__jList, 900,500);
    }

    // LESSON 2

    static String phrase_1[] = { "بدكاش                     تخصملي            شوي" ,
            "a little   discount-for-me   Do you not want",
            "                   word by word                   ",
            "deconstructed:   يدكاش",
            "               بد  -  كا -    ش            " ,
            "            Neg - you - 'root for'  want"};

    static String phrase_2[] = {"شكرا        سيدي           خلص               بديش   " ,
            "I don't want     enough       sir     thank you",
            "                   word by word                   ",
            "deconstructed:   بديش",
            "               بد   -    ي -     ش            ",
            "             Neg - me - 'root for' want           "};

    static String phrase_3[] = {"بتعرف               وين             الصراف  "  ,
            "the bank          where         do you know",
            "                   word by word                   ",
            "deconstructed:     بتعرف",
            "              بد      -     عرف             ",
            "            root for 'know'  -  do you            "};


    static String phrase_4[] = {"بقدر              اطلب           هسة          ",
            "          now       order          can I",
            "                   word by word                   ",
            "deconstructed:         اطلب        ",
            "ا    -      طلب          ",
            "        root for order  -  marker for ' I ' "};

    static String phrase_5[] = {"هاظ                بيحرق             كثير        ",
            "       a lot           spicy               this",
            "                   word by word                   ",
            "deconstructed:          بحرق  ",
            "ب       -      حرق              ",
            "           root for 'fire'    -     it is"};

    static String phrase_6[] = {"جيلي            الفاتورة     بدي        ادفع     لو            اتكرمت",
            "you-please   if    pay      I want. the bill   bring-me",
            "                   word by word                   ",
            "deconstructed:          جبلي",
            "جب     -      لي ",
            "to me    -   bring"};


    static String phrase_7[] = {"مطولين                 احنا                          قربنا",
            "getting close-us        us          taking long-we",
            "                   word by word                   ",
            "deconstructed:          قربنا",
            "قرب     -      نا ",
            "us    -   getting close"};

    static String phrase_8[] = {"متى حنتحرك            /            متى ماشين            ",
            "are we going   when      /     until we moving when",
            "                   word by word                   ",
            "deconstructed:          حنتحرك",
            "ح     -      نت       -    حرك ",
            "root for 'move    -   we    -  will "};

    static String phrase_9[] = {"هو             بعيد            المكان                   ",
            "                the place      for          he is ",
            "                   word by word                   ",
            "deconstructed:          هو",
            "هو ",
            "3rd person masculine pronoun "};


    // LESSON 3
    static String start[] = {"TYPES OF SENTENCES / WORD ORDER",
            "In bedouin arabic, there are two main types of sentences; nominal and verbal",
    "The former is that the sentence which effectively begins with a noun, and the latter is what effectively begins with a verb",
            " -if sentence starts with: noun, pronoun, adjective, adverb =  {nominal}",
            " -if sentence starts with: verb = {verbal sentence} "};

    static String explanations[] = {"EXAMPLE 1",
   "اشم(V)          هاظ (O)",
        "Pronoun: this      Verb: how much",
        "VERBAL SENTENCE {VO}",
            "EXAMPLE 2",
            "انا                        بتحسس                       من",
        "independent prepositional noun            verb('to have an allergic reaction'        1st person pronoun (I)",
    "NOMINAL SENTENCE {SV"};

    static String note[] = {"Another more in-depth way to look at word order is through agreement assymetry:",
        "if all words in a sentence match on person-point-of-view, number, and gender with the subject; makes it a SVO/SV word order",
        "(vise versa is true; if they don't agree symmetrically then it is most probably VSO/VO word order"};

    static String nextExplanation[] = {"Look at the following detailed explanation:",
        "EXAMPLE 1",
        "المعلمون  قرؤو الكتاب",
        "al-muallimuna qara'u il-kitab",
        "The teachers-M.PL.NOM   read.Post-3.M. PL     the-book-ACC",
        "the (male) teachers read the book",
        "full agreement : SVO order : nominal sentence",
    "EXAMPLE 2",
    "قرا المعلمون الكتاب",
    "read.Post-3M.SG    the-teacher-M.PL.NOM     the-book-ACC",
    "the (male) teachers read the book",
    "partial agreement: VSO Order: verbal sentence"};



    static JList phrase1_jList = new JList(phrase_1);
    static JList phrase2_jList = new JList(phrase_2);
    static JList phrase3_jList = new JList(phrase_3);

    static JList phrase4_jList = new JList(phrase_4);
    static JList phrase5_jList = new JList(phrase_5);
    static JList phrase6_jList = new JList(phrase_6);

    static JList phrase7_jList = new JList(phrase_7);
    static JList phrase8_jList = new JList(phrase_8);
    static JList phrase9_jList = new JList(phrase_9);

    static JList start_jList = new JList(start);
    static JList explanations_jList = new JList(explanations);
    static JList note_jList = new JList(note);
    static JList nextExplanation_jList = new JList(nextExplanation);



    public Lesson(){

    }

    public JFrame getLesson_frame() {
        return lesson_frame;
    }


    public JButton getBack() {
        return back;
    }




    public void lesson1(){
        customizeFrame(lesson_frame,1300,685, lesson_panel);
        addButton(lesson_frame,back,lesson_panel, 0,0,50,50);

        addLabel(lesson_panel, first_title,0,0,50,100);
        addLabel(lesson_panel, second_title,0,250,50,100);
        addLabel(lesson_panel, third_title,0,450,50,100);

        lesson1_lists_builder();

    }

    private void lesson1_lists_builder() {
        prepositionPronounListBuilder();
        personalPronounListBuilder();
        encliticPronounsListBuilder();

    }


    public void lesson2(){
        customizeFrame(lesson_frame,1300,685, lesson_panel);
        addButton(lesson_frame,back,lesson_panel, 0,0,50,50);

        addList(lesson_frame,lesson_panel, phrase1_jList, 050, 50);
        addList(lesson_frame,lesson_panel, phrase2_jList, 450, 50);
        addList(lesson_frame,lesson_panel, phrase3_jList, 850, 50);

        addList(lesson_frame,lesson_panel, phrase4_jList, 050, 300);
        addList(lesson_frame,lesson_panel, phrase5_jList, 450, 300);
        addList(lesson_frame,lesson_panel, phrase6_jList, 850, 300);
//
        addList(lesson_frame,lesson_panel, phrase7_jList, 050, 550);
        addList(lesson_frame,lesson_panel, phrase8_jList, 450, 550);
        addList(lesson_frame,lesson_panel, phrase9_jList, 850, 550);


    }


    public void lesson3(){
        customizeFrame(lesson_frame,1300,685, lesson_panel);
        addButton(lesson_frame,back,lesson_panel, 0,0,50,50);

        addList3(lesson_frame,lesson_panel,start_jList,00, 50);
        addList3(lesson_frame,lesson_panel,explanations_jList,00, 200);
        addList30(lesson_frame,lesson_panel,note_jList,00, 350);
        addList40(lesson_frame,lesson_panel,nextExplanation_jList,00, 450);




    }

}