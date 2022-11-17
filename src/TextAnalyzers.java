
public class TextAnalyzers {
    public static void main(String[] args) {
        String[] badWords = {"плохой", "отстой"};
        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(17);
        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
        System.out.println(checkLabels(analyzers, "Хороший текст для теста."));
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, так как это :( ужас."));
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, полный отстой."));
        System.out.println(checkLabels(analyzers, "И это все, что вы хотели написать в комментариях.Да ну, вообще..."));
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

