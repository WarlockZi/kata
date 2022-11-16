public abstract class KeywordAnalyzer{
    protected abstract String[] getKeywords();

    protected abstract Label getLabel() ;

    public abstract Label processText(String text);
}
