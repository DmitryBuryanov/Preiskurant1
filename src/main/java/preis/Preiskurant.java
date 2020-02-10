package preis;

import java.util.ArrayList;
import java.util.HashSet;

public class Preiskurant {

    public static void main(String[] args) {

    }

    public static HashSet<Good> put(HashSet<Good> newSet, Good newGood) {
        newSet.add(newGood);
        return newSet;
    }

    public static ArrayList<Good> changePrice(ArrayList<Good> newList, Good newGood) {
        for (int i = 0; i < newList.size(); i++) {
            if (newGood.name == newList.get(i).name && newGood.code == newList.get(i).code)
                newList.get(i).price = newGood.price;
        }
        return newList;
    }

    public static ArrayList<Good> changeName(ArrayList<Good> newList, Good newGood) {
        for (int i = 0; i < newList.size(); i++) {
            if (newGood.code == newList.get(i).code && newGood.price == newList.get(i).price)
                newList.get(i).name = newGood.name;
        }
        return newList;
    }

    public static HashSet<Good> delete(HashSet<Good> newSet, Good newGood) {
        newSet.remove(newGood);
        return newSet;
    }

    public static double checkPrice(ArrayList<Good> newList, int newCode, int count) {
        for (int i = 0; i < newList.size(); i++) {
            if (newCode == newList.get(i).code) return newList.get(i).price * count;
        }
        return 0.0;
    }

}