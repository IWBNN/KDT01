package thirdweek.ordermanagement;
import java.util.HashMap;
import java.util.Map;

public class OrderMaterial {
    private String salesItemName;
    private String category;
    private int count;
    private int price;


    public static final Map<String, OrderMaterial> goods = new HashMap<>();

    static {
        goods.put("star blend", new OrderMaterial("star blend", "coffeebean", 13_000));
        //goods.put("holic espresso", new OrderMaterial("holic espresso", "coffeebean", 13_000));
        //goods.put("Kenya AA kiambu", new OrderMaterial("Kenya AA kiambu", "coffeebean", 13_000));
        goods.put("maplesyrup", new OrderMaterial("maplesyrup", "syrup", 8_000));
        goods.put("Lime", new OrderMaterial("Lime", "fruit",  19_000));
        goods.put("Yuja", new OrderMaterial("Yuja", "fruit", 19_000));
    }

    OrderMaterial(String SalesItemName, String category, int price) {
        this.salesItemName = SalesItemName;
        this.category = category;
        this.price = price;
    }

    OrderMaterial(String SalesItemName, String category, int count, int price) {
        this.salesItemName = SalesItemName;
        this.category = category;
        this.count = count;
        this.price = price;
    }

//    public void requestGoods(OrderMaterial targetItem, int a) {
//                System.out.println(targetItem.SalesItemName + " " + a + "봉지 구매");
//                targetItem.count = a + targetItem.count;
//            System.out.println("현재 " + targetItem.SalesItemName + "의 개수 " + targetItem.count);
//        }
//
//        public void orderMec(String category, String itemName, int countNum){
//            //System.out.println("카테고리를 설정해주세요: (coffeebean, syrup, fruit)");
//            //category = scanner.nextLine();
//            if(Objects.equals(category, "coffeebean")){
//                //System.out.println("구매할 품목을 선택해주세요: (star blend, holic espresso, Kenya AA kiambu");
//                //itemName = itemName;
//                //System.out.println("수량을 선택해주세요: ");
//                //count = countNum;
//                OrderMaterial OM = new OrderMaterial(itemName, category, 3, 13_000);
//                OM.requestGoods(OM,countNum);
//            } else if(Objects.equals(category, "syrup")){
//                //System.out.println("구매할 품목을 선택해주세요: (maplesyrup");
//                //itemName = scanner.nextLine();
//                //System.out.println("수량을 선택해주세요: ");
//                //count = scanner.nextInt();
//                OrderMaterial OM = new OrderMaterial(itemName, category, 3, 8_000);
//                OM.requestGoods(OM,countNum);
//            } else {
//                //System.out.println("구매할 품목을 선택해주세요: (fruit");
//                //itemName = scanner.nextLine();
//                //System.out.println("수량을 선택해주세요: ");
//                //count = scanner.nextInt();
//                OrderMaterial OM = new OrderMaterial(itemName, category, 3, 19_000);
//                OM.requestGoods(OM,countNum);
//            }
//        }


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
