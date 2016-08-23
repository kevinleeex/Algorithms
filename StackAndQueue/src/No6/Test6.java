package No6;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Description: <br/>
 * Author: KevinLee <br/>
 * Version: 1.0 <br/>
 * Create Date Time: 2016-08-22 23:55. <br/>
 * Update Date Time: <br/>
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 4, 3, 3, 6, 7};
        int[] max = getMax(arr, 3);
        System.out.println(Arrays.toString(max));
    }

    private static int[] getMax(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }

        LinkedList<Integer> maxQ = new LinkedList<>();
        int[] result = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!maxQ.isEmpty() && arr[maxQ.peekLast()] <= arr[i]) {
                maxQ.pollLast();
            }
            maxQ.addLast(i);
            if (maxQ.peekFirst() == i - w) {
                maxQ.pollFirst();
            }
            if (i >= w - 1) {
                result[index++] = arr[maxQ.peekFirst()];
            }
        }
        return result;
    }
}
