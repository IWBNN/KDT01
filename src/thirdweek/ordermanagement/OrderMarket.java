package thirdweek.ordermanagement;

import java.util.Map;
import java.util.Objects;

public class OrderMarket extends OrderMaterial{

    private int materialCount;
    OrderMarket(String salesItemName, String category, int price) {
        super(salesItemName, category, price);
    }

    OrderMarket(String salesItemName, String category, int count, int price) {
        super(salesItemName, category, count, price);
    }

    OrderMaterial Yuja = new OrderMaterial("Yuja", "fruit", 3, 19_000);

}
