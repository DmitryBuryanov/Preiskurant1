package preis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;

public class test {
    HashSet<Good> newSet;
    HashSet<Good> expSet;
    ArrayList<Good> newList;
    ArrayList<Good> expList;
    Good newGood;
    int newCode;
    int count;
    double newPrice;
    boolean check;

    @Test
    void putTest() {
        newGood = new Good("Курица", 23, 150.78);

        newSet = new HashSet<Good>();
        newSet.add(new Good("Молоко", 18, 55.75));
        newSet.add(new Good("Масло", 234, 48.99));
        newSet.add(new Good("Колбаса", 348, 278.90));

        expSet = newSet;
        expSet.add(newGood);

        assertEquals(expSet, Preiskurant.put(newSet, newGood));
    }

    @Test
    void changePriceTest() {
        newGood = new Good("Курица", 23, 150.78);

        newList = new ArrayList<Good>();
        newList.add(new Good("Молоко", 18, 55.75));
        newList.add(new Good("Масло", 234, 48.99));
        newList.add(new Good("Колбаса", 348, 278.90));

        expList = newList;

        newList.add(new Good("Курица", 23, 123.34));
        expList.add(new Good("Курица", 23, 150.78));

        assertEquals(expList, Preiskurant.changePrice(newList, newGood));

    }

}
