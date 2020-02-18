package preis;

import java.util.ArrayList;

public class Preiskurant {

    private ArrayList<Good> newList;

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
        newList.removeIf(good -> good.goodEquals(newGood));
        return this;
    }

    public double checkPrice(int newCode, int count) {
        for (Good good : newList) {
            if (newCode == good.code) return good.price * count;
        }
        return 0.0;
    }

    public boolean preiskEquals(Preiskurant newPreis) {
        if (this.newList.size() != newPreis.newList.size()) return false;
        for (int i = 0; i < this.newList.size(); i++) {
            if (!this.newList.get(i).goodEquals(newPreis.newList.get(i))) return false;
        }
        return true;
    }

}