package thirdweek.ordermanagement;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카페를 운영한다고 가정해보자
        // 손님의 주문을 받아보자

        // 주문 품목을 받고, 주문자가 지불할 금액을 출력할 수 있는 코드를 짜보자 ㅇ
        // Order 클래스에서 받아올 정보 -> OrderItem에 들어있는 정보
        //Order O = new Order(null, null, 0, 0);

        Order2 O = new Order2();

        Warehouse starBlend = O.getStarBlend();
        Warehouse yuja = O.getYuja();
//        Warehouse americano = O.getAmericano();
//        Warehouse yujaTea = O.getYujaTea();


        O.requestMaterials(starBlend, 50);
        O.requestMaterials(yuja, 30);

        Warehouse americano = new Warehouse("Americano", "coffee", starBlend.getCount() * 10, 2500);
        Warehouse yujaTea = new Warehouse("Yuja Tea", "Tea", yuja.getCount() * 20, 2500);

        O.customerOrder(americano, 10);
        O.customerOrder(americano, 10);
        O.customerOrder(yujaTea, 1);

        // 위의 경우 남은 재고를 파악할 수 있음 main 메서드에서 OrderItem을 호출했는데, main 메서드가 아닌
        // 다른 곳에서 호출하여 그 값을 가져올 수 있을까?
        // 재고를 따로 기입해준 창고가 있다면?
        // 그렇다면 그 창고는 참조를 어떻게 해야할까?
        // ...... OrderItem 에서 구조를 참조, count를 포함한 OrderItem을 창고에서 정의한 후 Order 에서 창고에 있는 정의를 쓴다면?
        // 그냥 Order에서 정의 후 호출을 하면 안되는걸까? -> 가능한 것을 확인.. 어느 쪽이 더 깔끔한 코드일까?

        // OrderMarket에서 구매한 물품의 정보를 받아 OrderItem의 count 와 연결할 수 있을까?
        //만약 한다면 Order에서 구현한 orderItem Americano 의 count를 OrderMarket과 연동하여 변수처리로 옮겨야함..
        //위의 경우 창고 클래스를 만들어서 관리하는 것이 더욱 깔끔하지 않을까..? -> 창고 클래스를 작성해보자
        // 구조를 생각해보면.. 창고가 받아야하는 정보가 무엇인가? 원자재의 수(있다고 가정 + Market에서 구입시 추가되는 형식으로?)
        // 그 원자재의 수에 따라 만들 수 있는 OrderItem 의 수를 나타낼 수 있다. 이경우 어떤 클래스에 이 내용을 배치해야하나?

        // 즉, 창고에는 원자재의 수를 담은 원자재의 내용이 들어가야하고, 그 창고를 extends 하여 OrderItem에서 수량을 받고,
        // 그 수량에 맞추어 Order 클래스에서 제작할 수 있는 품목의 수를 적어주면 되지 않을까? -> extend..?

        // OrderMarket 에서 구매한 원재료의 count를 받아 Order의 주문 가능한 개수( 주문시 차감... 등등의 상호작용이 가능한?)를
        // 연동하여 입출력이 원활할 수 있게 구현?
        // main 메서드에서 OrderItem을 직접 호출시 가능... main에서 받지 말고 다른 곳에서 받을 수는 없을까?



        // 한 종류에 대해 가격 수량 및 총 지불액 출력 성공 ... 구매하는 품목이 여러개일 때는..?
        //O.customerOrder("Americano", 3);
        //O.customerOrder("Yuja Tea", 1);
        //O.customerOrder("ChocoLatte", 2);
        // Order에서 private 형태의 모든 상품 주문 가격을 담을 수 있는 int 형의 변수를 선언하여 담음으로써 출력 가능하도록 작성 ㅇ

        // 위의 itemName과 itemCount를 scan하여 입출력 관계로 받으면 사용자와의 상호작용도 쉽게 가능할 것으로 보임
        // customerOrder( int 구매하고자 하는 품목 수, --- , ---) 를 추가해서 Order에서 for문을 돌린다면?
        // item을 여러개 받지 못함

//        int orderCount = 0;
//        String act = null;
//        while (!Objects.equals(act, "quit")) {
//            act = null;
//            System.out.println("주문하고자 하는 품목을 입력하세요. (주문을 종료하시려면 \"quit\" 을 입력해주세요.)");
//            act = scanner.nextLine();
//            if(!Objects.equals(act, "quit")) {
//                System.out.println("수량을 입력해주세요.");
//                orderCount = scanner.nextInt();
//                O.customerOrder(act, orderCount);
//            } else {
//                System.out.println("주문을 종료합니다.");
//                break;
//            }
//        }
        // 왜 O.customerOrder 에 대한 출력문이 나온 후 다음 scanner를 받기 전에 반복하여 돌아갈까?

        // 소모품에 대하여 마켓 주문을 하는 것을 우선 구현 ..? -> 클래스 OrderMarket
        // 입력값을 받아 구매할 물품의 이름과 카테고리, 수량, 가격을 설정해야 하나? => orderMec ㅇ
        //OrderMarket OM = new OrderMarket(null,null,1,0);
        //OM.requestGoods("star blend", 50, 3);
        // 임시적으로 현재 재고를 직접 받아 추가한 만큼의 양을 재고에 넣는 코드 작성
        //OM.requestGoods(OM.Yuja, 50);
        // item 이름이 다를 시 에러가 발생 --- 예외처리를 해줘야함 o
        // category에 따른 분류를 할 시 orderMec 을 사용하나 그렇지 않아도 될 경우 requestGoods를 바로 사용해도 무관할 것 같음



//        String category = null;
//        String itemName = null;
//        int count = 0;
//        int price = 0;
//        System.out.println("카테고리를 설정해주세요: (coffeebean, syrup, fruit)");
//        category = scanner.nextLine();
//        if(Objects.equals(category, "coffeebean")){
//            System.out.println("구매할 품목을 선택해주세요: (star blend, holic espresso, Kenya AA kiambu");
//            itemName = scanner.nextLine();
//            System.out.println("수량을 선택해주세요: ");
//            count = scanner.nextInt();
//            OrderMarket OM = new OrderMarket(itemName, category, 3, 13_000);
//            OM.requestGoods(OM,count);
//        } else if(Objects.equals(category, "syrup")){
//            System.out.println("구매할 품목을 선택해주세요: (maplesyrup");
//            itemName = scanner.nextLine();
//            System.out.println("수량을 선택해주세요: ");
//            count = scanner.nextInt();
//            OrderMarket OM = new OrderMarket(itemName, category, 3, 8_000);
//            OM.requestGoods(OM,count);
//        } else {
//            System.out.println("구매할 품목을 선택해주세요: (fruit");
//            itemName = scanner.nextLine();
//            System.out.println("수량을 선택해주세요: ");
//            count = scanner.nextInt();
//            OrderMarket OM = new OrderMarket(itemName, category, 3, 19_000);
//            OM.requestGoods(OM,count);
//        }

        // Order에 관해서 필요한 요소
        // 판매 물품 배달, 소모품 마켓 주문... 정도가 있을 것이다.
        // 소비자 입장에서의 Order는 무엇일까
        // 판매 상품 주문(매장, 포장, 배달) 이 있을 것이다.

    }
}
