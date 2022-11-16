public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        int len;
        String [] l = text.split(" ");
        if (l.length>this.maxLength){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }

    public Label getLabel() {
        return Label.TOO_LONG;
    }
}
