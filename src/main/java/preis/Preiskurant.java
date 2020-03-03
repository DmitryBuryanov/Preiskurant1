package preis;

import java.util.ArrayList;

public class Preiskurant {

    private ArrayList<Good> newList;

    public Preiskurant(ArrayList<Good> newList) {
        this.newList = newList;
    }

    public void put(Good newGood) {
        for (Good good : newList) {
            if (good.name.equals(newGood.name) || good.code == newGood.code) throw
                    new IllegalArgumentException("Нельзя добавить товар");
        }
        newList.add(newGood);
    }

    public void changePrice(String name, Double price) {
        for (Good good : newList) {
            if (name.equals(good.name)) good.price = price;
        }
    }

    public void changeName(int code, String name) {
        for (Good good : newList) {
            if (code == good.code) good.name = name;
        }
    }

    public void delete(Good newGood) {
        newList.removeIf(good -> good.goodEquals(newGood));
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