package No1;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-25 0:12. <br/>
 * Update Date Time: <br/>
 */
public class Solution2 {
    private static int powerBaseOf10(int n) {
        return (int) Math.pow(10, n);
    }

    private static int getLenOfNum(int num) {
        int len = 0;
        while (num != 0) {
            num /= 10;
            len++;
        }
        return len;
    }

    public static int get1FO(int num) {
        if (num < 1) {
            return 0;
        }
        int len = getLenOfNum(num);
        if (len == 1) {
            return 1;
        }
        int tmp = powerBaseOf10(len - 1);
        int first = num / tmp;
        int first1FO = first == 1 ? num % tmp + 1 : tmp;
        int other1FO = first * (len - 1) * (tmp / 10);
        return first1FO + other1FO + get1FO(num % tmp);
    }

}
