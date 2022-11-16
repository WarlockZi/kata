public enum NEGATIVE_TEXT {
    SMILES1(":("), SMILES2(":|"), SMILES3("=:"),
    ;
    private String title;

    NEGATIVE_TEXT(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
