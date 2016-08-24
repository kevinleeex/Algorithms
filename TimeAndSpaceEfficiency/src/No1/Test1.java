package No1;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-25 0:41. <br/>
 * Update Date Time: <br/>
 */
public class Test1 {
    public static void main(String[] args) {
        long startTime, endTime, duration;
        int count;

        int number = 123456789;

        startTime = System.currentTimeMillis();
        count = Solution1.get1FO(number);
        System.out.println("fo:" + count);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Solution1 Spent " + duration + "ms");

        startTime = System.currentTimeMillis();
        count = Solution2.get1FO(number);
        System.out.println("fo:" + count);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Solution2 Spent " + duration + "ms");

    }
}
