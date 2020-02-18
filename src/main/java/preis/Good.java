package preis;

public class Good {
    String name;
    int code;
    double price;

    public Good(String name, int code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public boolean goodEquals(Good newGood) {
        return name.equals(newGood.name) && code == newGood.code && price == newGood.price;
    }
}
