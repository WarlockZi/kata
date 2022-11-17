public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] words = getKeywords();
        for (String w : words) {
            boolean check = text.contains(w);
            if (check) {
                return getLabel();
            }
        }
        return Label.OK;
    };
}
