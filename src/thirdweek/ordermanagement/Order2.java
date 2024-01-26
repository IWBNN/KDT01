package thirdweek.ordermanagement;

import java.util.Objects;

public class Order2 extends Warehouse {
    public Order2(String salesItemName, String category, int price) {
        super(salesItemName, category, price);
    }

    public Order2(String salesItemName, String category, int count, int price) {
        super(salesItemName, category, count, price);
    }

    public Order2() {
        super(null,null,0,0);
    }

    private int totalOrderPrice;
    private int materialCount;

    public Warehouse getStarBlend() {
        return new Warehouse("star blend", "coffeebean", 5, 13_000);
    }

    public Warehouse getYuja() {
        return new Warehouse("Yuja", "fruit", 3, 19_000);
    }

    public Warehouse getAmericano() {
        return new Warehouse("Americano", "coffee", getStarBlend().getCount() * 10, 2500);
    }

    public Warehouse getYujaTea() {
        return new Warehouse("Yuja Tea", "Tea", getYuja().getCount() * 20, 4000);
    }

    public Warehouse getLimeTea() {
        return new Warehouse("Lime Tea", "Tea", 0, 4000);
    }


    public void requestMaterials(Warehouse itemName, int itemCount) {
        if (itemName.getSalesItemName() != null) {
            System.out.println(itemName.getSalesItemName() + " " + itemCount + "봉지 구매");
            int currentCount = itemName.getCount();
            itemName.setCount(currentCount + itemCount);
            System.out.println("현재 " + itemName.getSalesItemName() + "의 개수 " + itemName.getCount());
            System.out.println("품목 주문 가격: " + itemName.getPrice() * itemCount);
            System.out.println("-----------------------------------");
        } else {
            System.out.println("품목의 이름이 올바르지 않습니다.");
        }
    }

    public void customerOrder(Warehouse orderItem, int itemCount) {
        if (orderItem != null && itemCount > 0) {
            String salesItemName = orderItem.getSalesItemName();
            int availableCount = orderItem.getCount();

            //int goodsCountIncrease = calculateGoodsCountIncrease(salesItemName, itemCount);

            if (availableCount - itemCount < 0) {
                System.out.println("주문하신 수량만큼 상품을 제공할 수 없습니다. 다른 상품을 주문해주세요.");
                System.out.println("-----------------------------------");
                return;
            } else {
                System.out.println("상품명: " + salesItemName);
                System.out.println("가격: " + orderItem.getPrice() + "원");
                System.out.println("수량: " + itemCount);
                System.out.println("품목 주문 가격: " + (orderItem.getPrice() * itemCount) + "원");

                totalOrderPrice += orderItem.getPrice() * itemCount;
                orderItem.setCount(availableCount - itemCount);

                // 해당 품목에 대한 material의 수량 감소
                String category = orderItem.getCategory();
                Warehouse material = getMaterial(category);
                if (material != null) {
                    int materialCount = material.getCount();
                    int materialCountDecrease = itemCount;
                    material.setCount(materialCount - materialCountDecrease);
                }

                System.out.println("모든 품목 주문 가격: " + totalOrderPrice + "원");
                System.out.println("남은 " + salesItemName + "의 개수: " + orderItem.getCount());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("주문 실패: 상품이 없거나 수량이 유효하지 않습니다.");
        }
    }

//    private int calculateGoodsCountIncrease(String salesItemName, int itemCount) {
//        // 특정 품목에 대한 goods의 수량 계산
//        if (salesItemName.equals("Yuja Tea")) {
//            return itemCount * 20;
//        } else if (salesItemName.equals("Lime Tea")) {
//            return itemCount * 15;
//        } else {
//            // 기본적으로는 itemCount만큼 증가
//            return itemCount;
//        }
//    }

//    public void orderMec(String category, Warehouse itemName, int countNum){
//        //System.out.println("카테고리를 설정해주세요: (coffeebean, syrup, fruit)");
//        //category = scanner.nextLine();
//        if(Objects.equals(category, "coffeebean")){
//            //System.out.println("구매할 품목을 선택해주세요: (star blend, holic espresso, Kenya AA kiambu");
//            //itemName = itemName;
//            //System.out.println("수량을 선택해주세요: ");
//            //count = countNum;
//            //OrderMaterial OM = new OrderMaterial(itemName, category, 3, 13_000);
//            requestGoods(itemName,countNum);
//        } else if(Objects.equals(category, "syrup")){
//            //System.out.println("구매할 품목을 선택해주세요: (maplesyrup");
//            //itemName = scanner.nextLine();
//            //System.out.println("수량을 선택해주세요: ");
//            //count = scanner.nextInt();
//            //OrderMaterial OM = new OrderMaterial(itemName, category, 3, 8_000);
//            requestGoods(itemName,countNum);
//        } else if(Objects.equals(category,"fruit")){
//            //System.out.println("구매할 품목을 선택해주세요: (fruit");
//            //itemName = scanner.nextLine();
//            //System.out.println("수량을 선택해주세요: ");
//            //count = scanner.nextInt();
//            //OrderMaterial OM = new OrderMaterial(itemName, category, 3, 19_000);
//            requestGoods(itemName,countNum);
//        } else{
//            System.out.println("카테고리와 구매하고자 하는 제품의 키워드가 일치하지 않습니다. 다시 시도해주세요.");
//        }
//    }
}