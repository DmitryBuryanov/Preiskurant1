package preis;

import java.util.ArrayList;

public class Preiskurant {

    ArrayList<Good> newList;

    public Preiskurant(ArrayList<Good> newList) {
        this.newList = newList;
    }

    public Preiskurant put(Good newGood) {
        newList.add(newGood);
        return this;
    }

    public Preiskurant changePrice(Good newGood) {
        for (Good good : newList) {
            if (newGood.name.equals(good.name) && newGood.code == good.code)
                good.price = newGood.price;
        }
        return this;
    }

    public Preiskurant changeName(Good newGood) {
        for (Good good : newList) {
            if (newGood.code == good.code && newGood.price == good.price)
                good.name = newGood.name;
        }
        return this;
    }

    public Preiskurant delete(Good newGood) {
        for (Good good : newList) {
            if (newGood.code == good.code && newGood.name.equals(good.name) && newGood.price == good.price)
                newList.remove(good);
        }
        return this;
    }

    public double checkPrice(int newCode, int count) {
        for (Good good : newList) {
            if (newCode == good.code) return good.price * count;
        }
        return 0.0;
    }
}