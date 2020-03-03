import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import preis.Good;
import preis.Preiskurant;
import java.util.ArrayList;

public class test {
    Preiskurant newList = new Preiskurant(new ArrayList<Good>());
    Preiskurant expList = new Preiskurant(new ArrayList<Good>());
    Good newGood;
    int newCode;
    int count;

    @Test
    public void putTest() {
        newGood = new Good("Курица", 23, 150.78);

        newList.put(new Good("Молоко", 18, 55.75));
        newList.put(new Good("Масло", 234, 48.99));
        newList.put(new Good("Колбаса", 348, 278.90));
        newList.put(newGood);

        expList.put(new Good("Молоко", 18, 55.75));
        expList.put(new Good("Масло", 234, 48.99));
        expList.put(new Good("Колбаса", 348, 278.90));
        expList.put(new Good("Курица", 23, 150.78));

        assertTrue(expList.preiskEquals(newList));
    }

    @Test
    public void changePriceTest() {
        newGood = new Good("Курица", 23, 150.78);

        newList.put(new Good("Курица", 23, 155.75));
        newList.put(new Good("Молоко", 18, 55.75));
        newList.put(new Good("Масло", 234, 48.99));
        newList.put(new Good("Колбаса", 348, 278.90));

        expList.put(new Good("Курица", 23, 150.78));
        expList.put(new Good("Молоко", 18, 55.75));
        expList.put(new Good("Масло", 234, 48.99));
        expList.put(new Good("Колбаса", 348, 278.90));

        newList.changePrice("Курица", 150.78);

        assertTrue(expList.preiskEquals(newList));
    }

    @Test
    void changeNameTest() {
        newGood = new Good("Цыпленок", 23, 150.78);

        newList.put(new Good("Курица", 23, 150.78));
        newList.put(new Good("Молоко", 18, 55.75));
        newList.put(new Good("Масло", 234, 48.99));
        newList.put(new Good("Колбаса", 348, 278.90));

        expList.put(new Good("Цыпленок", 23, 150.78));
        expList.put(new Good("Молоко", 18, 55.75));
        expList.put(new Good("Масло", 234, 48.99));
        expList.put(new Good("Колбаса", 348, 278.90));

        newList.changeName(23, "Цыпленок");

        assertTrue(expList.preiskEquals(newList));
    }

    @Test
    void deleteTest() {
        newGood = new Good("Курица", 23, 150.78);

        newList.put(new Good("Молоко", 18, 55.75));
        newList.put(new Good("Масло", 234, 48.99));
        newList.put(new Good("Курица", 23, 150.78));
        newList.put(new Good("Колбаса", 348, 278.90));

        expList.put(new Good("Молоко", 18, 55.75));
        expList.put(new Good("Масло", 234, 48.99));
        expList.put(new Good("Колбаса", 348, 278.90));

        newList.delete(newGood);

        assertTrue(expList.preiskEquals(newList));
    }

    @Test
    void checkPriceTest() {
        newCode = 23;
        count = 5;

        newList.put(new Good("Курица", 23, 150.78));
        newList.put(new Good("Молоко", 18, 55.75));
        newList.put(new Good("Масло", 234, 48.99));
        newList.put(new Good("Колбаса", 348, 278.90));

        assertEquals(newList.checkPrice(newCode, count), 753.90);
    }

}


