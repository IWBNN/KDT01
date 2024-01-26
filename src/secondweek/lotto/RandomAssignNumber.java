package secondweek.lotto;

import java.util.LinkedList;
import java.util.Random;

public class RandomAssignNumber {

    private LinkedList<Integer> numbers;

    public RandomAssignNumber() {
        this.numbers = new LinkedList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }
    public LinkedList<Integer> getNumbers(){
        return numbers;
    }

    public static void main(String[] args) {
        RandomAssignNumber RAN = new RandomAssignNumber();

        Random rd = new Random();

        for(int i = 0;i < 6;i++){
            RAN.addNumber(rd.nextInt(45)+1);
        }

        LinkedList<Integer> lottoNum = RAN.getNumbers();

        System.out.print(" " + lottoNum);



    }
}

