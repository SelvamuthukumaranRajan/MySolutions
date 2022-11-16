package stream;

import java.util.Arrays;

public class StreamProbs {
    //Even values that are divisible by 3
    public int averageValue(int[] nums) {
        return (int)Arrays.stream(nums).filter(x -> x%6 == 0).average().orElse(0);
    }
}
