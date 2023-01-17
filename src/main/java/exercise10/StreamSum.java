package exercise10;

import java.util.stream.LongStream;

public class StreamSum {
    public static void main(String[] args) {
        System.out.println(streamSum(3, 6));
        System.out.println(streamSum(10000000, 1000000000));
    }

    public static long streamSum(int a, int b) {
        return LongStream.range(a, b).sum();
    }
}
