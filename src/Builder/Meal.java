package Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for(var item : itemList) {
            cost += item.price();
        }
        return  cost;
    }

    public void showItems() {
        for (var item : itemList) {
            System.out.println(" name  => "+ item.name());
            System.out.println(" packagin => " + item.packing().pack());
            System.out.println(" price =>  "+ item.price());
        }
    }
}
