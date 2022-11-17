public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }

    protected Label getLabel() {
        return Label.TOO_LONG;
    }
}
