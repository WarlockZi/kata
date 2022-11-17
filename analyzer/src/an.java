public class an {
    public static void main(String[] args) {
        String[] badWords = {"плохой", "отстой"};
        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(10);
        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
//        System.out.println(checkLabels(analyzers, "Хороший текст для теста."));
//        System.out.println(checkLabels(analyzers, "Плохой текст для теста, так как это :( ужас."));
//        System.out.println(checkLabels(analyzers, "Плохой текст для теста, полный отстой."));
        System.out.println(checkLabels(analyzers, "И это все, что вы :( хотели написать в комментариях.Да ну, вообще..."));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer a : analyzers) {
            Label label = a.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}

interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;
    private Label label;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    protected String[] getKeywords() {
        return keywords;
    }

    protected Label getLabel() {
        return Label.SPAM;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords = {":(", ":|", "=("};

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        String[] l = text.split(" ");
        if (l.length > this.maxLength) {
            return getLabel();
        }
        return Label.OK;
    }

    protected Label getLabel() {
        return Label.TOO_LONG;
    }
}


abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] words = getKeywords();
        for (String key_i : words) {
            boolean check = text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }
}