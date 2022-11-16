public class SpamAnalizer extends KeywordAnalyzer implements TextAnalyzer{
    private String[] keywords;

    public SpamAnalizer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        String[] words_negative = getKeywords();
        for (String key_i : words_negative) {
            boolean check = text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }


}
