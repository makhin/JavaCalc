public enum Sign {
    PLUS("+"),
    MINUS("-"),
    STAR("*"),    
    SLASH("/");

    private final String label;

    private Sign(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static Sign fromString(String text) {
        for (Sign b : Sign.values()) {
            if (b.label.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }    
}