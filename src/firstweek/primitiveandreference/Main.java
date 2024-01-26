package firstweek.primitiveandreference;

public class Main {
    public static void main(String[] args) {
        byte myByte = 1; // 8bit

        short myShort = 1; // 16bit
        char myChar = 'a'; // 16bit

        int myInteger = 1; // 32bit
        long myLong = 1; // 64bit
        Byte myWrappedByte = myByte;
        boolean isByteEqual = myWrappedByte.equals(2);


        Short myWrappedShort = myShort;
        boolean isShortEqual = myWrappedShort.equals(2);
        Character myWrappedChar = myChar;
        char maxChar = Character.MAX_VALUE;

        Integer myWrappedInteger = myInteger;
        boolean isIntegerEqual = myWrappedInteger.equals(2);
        Long myWrappedLong = myLong;
        boolean isLongEqual = myWrappedLong.equals(2);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

    }
}
