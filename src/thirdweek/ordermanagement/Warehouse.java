package thirdweek.ordermanagement;

import java.util.HashMap;
import java.util.Map;

public class Warehouse{

    private String salesItemName;
    private String category;
    private int count;
    private int price;
    public static final Map<String, Warehouse> goods = new HashMap<>();
    static {
        goods.put("Americano", new Warehouse("Americano", "coffee", 2500));
        goods.put("Espresso", new Warehouse("Espresso", "coffee", 2000));
        goods.put("CafeLatte", new Warehouse("CafeLatte", "coffee", 3000));
        goods.put("Caramel Macchiato", new Warehouse("Caramel Macchiato", "coffee", 4000));
        goods.put("ChocoLatte", new Warehouse("ChocoLatte", "drink", 3500));
        goods.put("Lime Tea", new Warehouse("Lime Tea", "fruit",  3000));
        goods.put("Yuja Tea", new Warehouse("Yuja Tea", "fruit", 4000));
    }

    public static final Map<String, Warehouse> material = new HashMap<>();

    static {
        material.put("star blend", new Warehouse("star blend", "coffeebean", 13_000));
        //material.put("holic espresso", new Warehouse("holic espresso", "coffeebean", 13_000));
        //material.put("Kenya AA kiambu", new Warehouse("Kenya AA kiambu", "coffeebean", 13_000));
        material.put("maplesyrup", new Warehouse("maplesyrup", "syrup", 8_000));
        material.put("Lime", new Warehouse("Lime", "fruit",  19_000));
        material.put("Yuja", new Warehouse("Yuja", "fruit", 19_000));
    }

    private static final Map<String, Integer> goodsCount = new HashMap<>();
    private static final Map<String, Integer> materialCount = new HashMap<>();

    static {
        // 초기 상품 수량 설정
        goodsCount.put("Americano", 0);
        goodsCount.put("Espresso", 0);
        goodsCount.put("CafeLatte", 0);
        goodsCount.put("Caramel Macchiato", 0);
        goodsCount.put("ChocoLatte", 0);
        goodsCount.put("Lime Tea", 0);
        goodsCount.put("Yuja Tea", 0);

        // 초기 자재 수량 설정
        materialCount.put("star blend", 0);
        //materialCount.put("holic espresso", 0);
        //materialCount.put("Kenya AA kiambu", 0);
        materialCount.put("maplesyrup", 0);
        materialCount.put("Lime", 0);
        materialCount.put("Yuja", 0);
    }


    public Warehouse(String salesItemName, String category, int price) {
        this.salesItemName = salesItemName;
        this.category = category;
        this.price = price;
    }
    public Warehouse(String salesItemName, String category, int count, int price) {
        this.salesItemName = salesItemName;
        this.category = category;
        this.count = count;
        this.price = price;

        // 초기 수량 설정
        if ("coffee".equals(category) || "drink".equals(category) || "fruit".equals(category)) {
            goodsCount.put(salesItemName, count);
        } else {
            materialCount.put(salesItemName, count);
        }
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

    // goodsCount Map을 반환하는 메서드
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Map<String, Integer> getGoodsCount() {
        return goodsCount;
    }

    // materialCount Map을 반환하는 메서드
    public static Map<String, Integer> getMaterialCount() {
        return materialCount;
    }
    public static Warehouse getMaterial(String salesItemName) {
        return new Warehouse(salesItemName, "", 0, 0);
    }
}
