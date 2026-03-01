package entities.enums;

public enum Color {
    BLACK("#000000"),
    BLUE("#0000ff"),
    RED("#ff0000");

    private String hexColor;
    
    Color(String hexColor) {
        this.hexColor = hexColor;
    }   

    public String getHexColor () {
        return hexColor;
    }
}
