package preis;

public class Equals {

    public static boolean equals(Preiskurant list1, Preiskurant list2) {
        for (int i = 0; i < list2.newList.size(); i++) {
            if (!list1.newList.get(i).name.equals(list2.newList.get(i).name) && list1.newList.get(i).code !=
                    list2.newList.get(i).code && list1.newList.get(i).price != list2.newList.get(i).price) {
                return false;
            }
        }
        return true;
    }
}
