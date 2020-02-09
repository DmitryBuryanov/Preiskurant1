package preis;

import java.util.ArrayList;

public class Preiskurant {

    public static void main(String[] args) {

    }

    public static ArrayList<Good> put(ArrayList<Good> newList, Good newGood) {
        newList.add(newGood);
        return newList;
    }

    public static ArrayList<Good> changePrice(ArrayList<Good> newList, Good newGood) {
        for (int i = 0; i < newList.size(); i++) {
            if (newGood.name == newList.get(i).name) newList.get(i).price = newGood.price;
        }
        return newList;
    }

    public static ArrayList<Good> changeName(ArrayList<Good> newList, Good newGood) {
        for (int i = 0; i < newList.size(); i++) {
            if (newGood.code == newList.get(i).code) newList.get(i).name = newGood.name;
        }
        return newList;
    }

    public static ArrayList<Good> delete(ArrayList<Good> newList, Good newGood) {
        newList.remove(newGood);
        return newList;
    }

    public static double checkPrice(ArrayList<Good> newList, int newCode, int count) {
        for (int i = 0; i < newList.size(); i++) {
            if (newCode == newList.get(i).code) return newList.get(i).price * count;
        }
        return 0.0;
    }

}