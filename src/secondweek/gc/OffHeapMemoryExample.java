package secondweek.gc;

import java.lang.ref.Cleaner;
import java.nio.ByteBuffer;

public class OffHeapMemoryExample {

    public static void main(String[] args) {
        // Off-Heap 메모리 크기 설정 (예: 1 메가바이트)
        int offHeapMemorySize = 1024 * 1024;

        // Direct ByteBuffer를 사용하여 Off-Heap 메모리 할당
        ByteBuffer offHeapBuffer = ByteBuffer.allocateDirect(offHeapMemorySize);

        // Off-Heap 메모리에 데이터 쓰기
        String data = "Hello Off-Heap!";
        byte[] bytes = data.getBytes();
        offHeapBuffer.put(bytes);

        // Off-Heap 메모리에서 데이터 읽기
        byte[] readBytes = new byte[bytes.length];
        offHeapBuffer.get(readBytes);

        String readData = new String(readBytes);
        System.out.println("Read from Off-Heap Memory: " + readData);

        // Off-Heap Buffer를 Cleaner를 사용하여 해제
        cleanDirectBuffer(offHeapBuffer);
    }

    // Direct ByteBuffer를 Cleaner를 사용하여 해제하는 메서드
    private static void cleanDirectBuffer(ByteBuffer buffer) {
        if (buffer.isDirect()) {
            Cleaner cleaner = Cleaner.create();
        }
    }
}