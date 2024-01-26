package thirdweek.ordermanagement;
import java.util.Map;

public class Order extends OrderItem {

    private int totalOrderPrice;

    Order(String SalesItemName, String category, int price) {
        super(SalesItemName, category, price);
    }

    Order(String SalesItemName, String category, int count, int price) {
        super(SalesItemName, category, count, price);
    }

    OrderMarket OM = new OrderMarket(null,null,0,0);
    OrderMaterial Yuja = new OrderMaterial("Yuja", "fruit", 3, 19_000);
    OrderItem Americano = new OrderItem("Americano", "coffee", 150, 2500);
    OrderItem YujaTea = new OrderItem("Yuja Tea", "Tea", OM.Yuja.getCount() * 3, 4000);



    public void customerOrder (OrderItem orderItem , int itemCount) { //String itemName ... goods 에서 당겨올 수 있음
        //Map<String, OrderItem> goodsMap = goods;
        //OrderItem orderItem = goodsMap.get(itemName);
        //Map을 이용할경우 count를 이용한 재고 파악이 불가해 참조 방식을 변경

        if (orderItem != null && itemCount > 0) {
            if(orderItem.getCount() - itemCount < 0){
                System.out.println("주문하신 수량만큼 상품을 제공할 수 없습니다. 다른 상품을 주문해주세요.");
                System.out.println("-----------------------------------");
                return;
            }else {
                System.out.println("상품명: " + orderItem.getSalesItemName());
                System.out.println("가격: " + orderItem.getPrice() + "원");
                System.out.println("수량: " + itemCount);
                System.out.println("품목 주문 가격: " + (orderItem.getPrice() * itemCount) + "원");
                int orderPrice = orderItem.getPrice() * itemCount;
                totalOrderPrice += orderPrice;
                orderItem.setCount(orderItem.getCount() - itemCount);

                System.out.println("모든 품목 주문 가격: " + totalOrderPrice + "원");
                System.out.println("남은 " + orderItem.getSalesItemName() + "의 개수: " + orderItem.getCount());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("주문 실패: 상품이 없거나 수량이 유효하지 않습니다.");
        }

    }
}
