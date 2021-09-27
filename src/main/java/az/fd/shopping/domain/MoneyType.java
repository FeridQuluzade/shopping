package az.fd.shopping.domain;

public enum MoneyType {
    USD("$","Dollar"),
    EUR("E","Euro"),
    AZN("M","Manat");
    private String label; //dollar
    private String symbol; //$

     MoneyType(String symbol, String label) {
        this.label = label;
        this.symbol = symbol;
    }
}
