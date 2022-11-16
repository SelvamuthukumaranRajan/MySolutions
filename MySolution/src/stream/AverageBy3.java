package Stream;

import java.util.Arrays;

public class AverageBy3 {
    public static int solution(int[] nums) {
        return (int)Arrays.stream(nums).filter(x -> x%6 == 0).average().orElse(0);
    }
}
