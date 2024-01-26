package thirdweek.ordermanagement;

import java.util.HashMap;
import java.util.Map;

public class OrderItem {
    private String salesItemName;
    private String category;
    private int count;
    private int price;
    public static final Map<String, OrderItem> goods = new HashMap<>();

    static {
        goods.put("Americano", new OrderItem("Americano", "coffee", 2500));
        goods.put("Espresso", new OrderItem("Espresso", "coffee", 2000));
        goods.put("CafeLatte", new OrderItem("CafeLatte", "coffee", 3000));
        goods.put("Caramel Macchiato", new OrderItem("Caramel Macchiato", "coffee", 4000));
        goods.put("ChocoLatte", new OrderItem("ChocoLatte", "drink", 3500));
        goods.put("Lime Tea", new OrderItem("Lime Tea", "fruit",  3000));
        goods.put("Yuja Tea", new OrderItem("Yuja Tea", "fruit", 4000));
    }

    //OrderItem Americano = new OrderItem("Americano", "coffee", 150, 2500);

    OrderItem(String SalesItemName, String category, int price) {
        this.salesItemName = SalesItemName;
        this.category = category;
        this.price = price;
    }

    OrderItem(String SalesItemName, String category, int count, int price) {
        this.salesItemName = SalesItemName;
        this.category = category;
        this.count = count;
        this.price = price;
    }

    public String getSalesItemName() {
        return salesItemName;
    }

    public void setSalesItemName(String salesItemName) {
        this.salesItemName = salesItemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
